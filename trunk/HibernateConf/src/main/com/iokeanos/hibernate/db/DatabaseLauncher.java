package com.iokeanos.hibernate.db;

import java.io.File;

import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;

public class DatabaseLauncher {
	
	private static Logger logger = Logger.getLogger(DatabaseLauncher.class);

	private static org.hsqldb.Server databaseServer;

	public static void startDatabase() {
		
		if (databaseServer != null && databaseServer.getState() == 1) {
			// database is already running
			// this could happen when spring context is initialized multiple
			// times during unit testing
			return;
		}
		
		deleteDatabaseLockFile();

		HsqlProperties hsqlProperties = new HsqlProperties();
		hsqlProperties.setProperty("server.database.0",
				"file:data/osgi-hibernate-sample.db");
		hsqlProperties.setProperty("server.dbname.0", "osgi-hibernate-sample");
		databaseServer = new Server();
		databaseServer.setProperties(hsqlProperties);
		databaseServer.start();
		// wait for server to come online
		int i = 0;
		while ((databaseServer.getState()) != 1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			i++;
			if (i > 20) {
				throw new RuntimeException("Database startup timed out");
			}
		}
		databaseServer.checkRunning(true);
	}

	public static void stopDatabase() {
		databaseServer.stop();
		// wait until database has stopped
		int i = 0;
		while (databaseServer.getState() != 16) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			i++;
			if (i > 20) {
				throw new RuntimeException("Database shutdown timed out");
			}
		}
		databaseServer.checkRunning(false);
	}

	private static void deleteDatabaseLockFile() {
		// I keep getting errors that the database cannot start because it is locked
		// Might be a problem because the database is started and stopped so often
		// Trying to fix it by, ahem, deleting the database lock file before trying 
		// to start it
		// is stopped
		File dataDir = new File("data");
		if (dataDir != null && dataDir.exists()) {
			for(File file : dataDir.listFiles()) {
				if (file.getName().equals("osgi-hibernate-sample.db.lck")) {
					logger.info("Deleting file: " + file.getName());
					file.delete();
				}
			}
		}
	}

}
