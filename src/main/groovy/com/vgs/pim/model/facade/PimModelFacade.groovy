package com.vgs.pim.model.facade

import com.vgs.pim.model.bo.User


class PimModelFacade {

	User retrieveUserById(Long id) {
		new User(id:id, firstName:"Diego")
	}
	
	void updateUser(User u) {
		
	}
	
}
