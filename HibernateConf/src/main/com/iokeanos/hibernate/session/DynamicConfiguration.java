package com.iokeanos.hibernate.session;


/**
 * Hibernate session factory that can get updated during the runtime of the
 * application.
 */
public class DynamicConfiguration {}/*implements InitializingBean {

	private Logger logger = Logger.getLogger(DynamicConfiguration.class);

	private List<Class> annotatedClasses = new ArrayList<Class>();

	private Properties hibernateProperties;

	private SessionFactory proxiedSessionFactory;

	private DataSource dataSource;

	private int myhashCode;

	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}

	public void setAnnotatedClasses(List<Class> annotatedClasses) {
		this.annotatedClasses = annotatedClasses;
	}

	public void addAnnotatedClass(Class anotadedClass) {
		annotatedClasses.add(anotadedClass);
		createNewSessionFactory();
	}
	
	public void removeAnnotatedClass(Class anotadedClass) {
		annotatedClasses.remove(anotadedClass);
		createNewSessionFactory();
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public SessionFactory getSessionFactory() {
		return proxiedSessionFactory;
	}


	private SessionFactory sessionFactory;

	private void createNewSessionFactory() {
		
		logger.info("Creating new session factory...");
		
		if (hibernateProperties == null) {
			throw new IllegalStateException(
					"Hibernate properties have not been set yet");
		}

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.setProperties(hibernateProperties);
		for (Class c : annotatedClasses) {
			cfg.addAnnotatedClass(c);
		}
		sessionFactory = cfg.buildSessionFactory();
		
//		AnnotationSessionFactoryBean asfb = new AnnotationSessionFactoryBean();
//		asfb.setDataSource(dataSource);
//		asfb.setHibernateProperties(hibernateProperties);
//		asfb.setAnnotatedClasses(annotatedClasses
//				.toArray(new Class[annotatedClasses.size()]));
//		try {
//			asfb.afterPropertiesSet();
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//		sessionFactory = (SessionFactory) asfb.getObject();
		proxiedSessionFactory = (SessionFactory) Proxy.newProxyInstance(
				SessionFactory.class.getClassLoader(),
				new Class[] { SessionFactory.class }, new InvocationHandler() {
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						logger.info("Delegate factory invoked: " + sessionFactory + 
								"" + method.getName());
						return method.invoke(sessionFactory, args);
					}
				});
		
		logger.info("Created new session factory: " + sessionFactory);
		logger.info("Known classes are");
		for(Class c : annotatedClasses) {
			logger.info(c.getName());
		}
	}

	public void afterPropertiesSet() throws Exception {
		createNewSessionFactory();
		BundleTracker.setDynamicConfiguration(this);
	}

	public void addAnnotatedClasses(Bundle sourceBundle, String[] classes) {
		for(String s : classes) {
			try {
				logger.error("Adding class: " + s);
				annotatedClasses.add(
						sourceBundle.loadClass(s));
			} catch (ClassNotFoundException e) {
				logger.error("Error adding annotaded class: " + s, e);
				throw new RuntimeException(e);
			}
		}
		createNewSessionFactory();
	}
	
	public void removeAnnotatedClasses(Bundle sourceBundle, String[] classes) {
		for(String s : classes) {
			for (Class c : annotatedClasses) {
				if (c.getName().equals(s)) {
					logger.error("Removing class: " + s);
					annotatedClasses.remove(c);
					break;
				}
			}
		}
		createNewSessionFactory();
	}
	
	public void addAnnotatedClasses(Class[] classes) {
		annotatedClasses.addAll(Arrays.asList(classes));
		createNewSessionFactory();
	}
	
	public void removeAnnotatedClasses(Class[] classes) {
		annotatedClasses.removeAll(Arrays.asList(classes));
		createNewSessionFactory();
	}

}
*/