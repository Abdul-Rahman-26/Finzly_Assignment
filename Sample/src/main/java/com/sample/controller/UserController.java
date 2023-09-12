package com.sample.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.User;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@GetMapping
	public String getString() {
		return "Hello";
	}
	
	@GetMapping("get")
	public List<User> getUser() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		session.beginTransaction().commit();
		return criteria.list();
	}
	
	@PostMapping("post")
	public User postUser(@RequestBody User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		session.save(user);
		session.beginTransaction().commit();
		return user;
	}
	
	@PutMapping("put")
	public String putUser(@RequestBody User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		session.update(user);
		session.beginTransaction().commit();
		//return criteria.list();
		return "User Updated Using Put Method";
	}
	
	@DeleteMapping("delete")
	public String deleteUser(@RequestBody User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		User attachedUser = (User) session.merge(user);
		session.remove(attachedUser);
		session.beginTransaction().commit();
		//return criteria.list();
		return "User Deleted Using Delete Method";
	}
}
