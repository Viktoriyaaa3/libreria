package com.example.libreria.repository;

import com.example.libreria.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface UsersRepo extends CrudRepository<Users, Long>{

}
