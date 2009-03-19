package com.iokeanos.hibernate.dao;

public class DummyDAO {
	
}
/*
@Transactional
public class DummyDAO extends HibernateDaoSupport{

	Dummy dummy;
	
	public void save(Dummy dummy) {
		getHibernateTemplate().save(dummy);
	}

	*//**
	 * 'load' returns a proxy with only the id populated.
	 * To access members in the proxy requires a Hibernate
	 * session.  Haven't figured out how to do transactions
	 * between bundles yet... 
	 *//*
	public Dummy load(long id) {
		return (Dummy) getHibernateTemplate().load(Dummy.class, id);
	}

	public Dummy get(long id) {
		return (Dummy) getHibernateTemplate().get(Dummy.class, id);
	}

	public void update(Dummy dummy) {
		getHibernateTemplate().update(dummy);
	}

	public void delete(Dummy dummy) {
		getHibernateTemplate().delete(dummy);
	}


}
*/