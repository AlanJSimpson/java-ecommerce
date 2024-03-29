package com.consagrados.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consagrados.ecommerce.entities.User;
import com.consagrados.ecommerce.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		UpdateData(entity, obj);
		
		return repository.save(entity);		
	}

	private void UpdateData(User entity, User obj) {
		entity.setEmail(obj.getEmail());
		entity.setName(obj.getPhone());
		entity.setPhone(obj.getPhone());		
	}
}
