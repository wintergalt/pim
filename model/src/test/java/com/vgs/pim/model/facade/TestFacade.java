package com.vgs.pim.model.facade;

import junit.framework.TestCase;

import com.vgs.pim.model.bo.User;

public class TestFacade extends TestCase {

	public void testSimple() {
		PimModelFacade facade = new PimModelFacade();
		User u = null;
		u = facade.retrieveUserById(1l);
		assertNotNull(u);
		assertEquals("Diego", u.getFirstName());
		System.out.println(u.getFirstName());
		System.out.println(u.getId());
	}

}
