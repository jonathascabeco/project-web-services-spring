package com.jonathascabeco.stswebservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathascabeco.stswebservicesproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	//instanciar obj repository que tem varias funcionalidades para interação com o usuario;
	
	

}
