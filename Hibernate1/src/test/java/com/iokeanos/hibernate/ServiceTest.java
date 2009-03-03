package com.iokeanos.hibernate;

import com.iokeanos.hibernate.util.HibernateUtil;

import junit.framework.TestCase;

public class ServiceTest extends TestCase{
	public void testUtil(){
		System.err.println(HibernateUtil.getSessionFactory());
		assertNotNull(HibernateUtil.getSessionFactory());
	}
}
