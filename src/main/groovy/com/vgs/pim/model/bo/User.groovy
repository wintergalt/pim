package com.vgs.pim.model.bo

import org.hibernate.cfg.ExtendsQueueEntry;

class User {

	Long id
	String username
	String password
	String firstName
	String lastName
	Date birthdate
	String email
	Address address
	
}
