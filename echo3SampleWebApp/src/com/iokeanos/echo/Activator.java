package com.iokeanos.echo;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;


public class Activator implements BundleActivator
{
	public static String START = "/echo";
	public static String RESET = "/rs";
	
    private ServiceTracker httpServiceTracker;

    private static BundleContext context;

    private static final Logger classLog = Logger.getLogger(Activator.class);
    
    
    public void start(BundleContext context) throws Exception
    {
    	Activator.context = context;

    	httpServiceTracker = new HttpServiceTracker(context);
        httpServiceTracker.open();
        
        classLog.info("Sample echo3 application is started");
    }

    public void stop(BundleContext context) throws Exception
    {
        httpServiceTracker.close();
        httpServiceTracker = null;
        
        classLog.info("Sample echo3 application is stoped");
    }

    public static BundleContext getContext()
    {
        return context;
    }
    
    
    
}