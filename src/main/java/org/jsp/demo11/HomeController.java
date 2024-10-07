package org.jsp.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@RequestMapping("/hi")
	public String hi()
	{
		System.out.println("Hi from HomeController");
		return "Hi from Home Controller....!";
	}
	
	
	@RequestMapping("/hello")
	public String hello()
	{
		System.out.println("Hello from HomeController");
		return "Hello from Home Controller....!";
	}
	
	
	@RequestMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return user;
	}
	
	@RequestMapping("/find")
    public Person findPerson(@RequestBody Person p)
	{
			return p;
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam String userName,@RequestParam String password)
	{
		System.out.println(userName);
		System.out.println(password);
		return "Login Successfully...!";
	}

	@RequestMapping("/findall")
	public String findAllUsers()
	{
		return "All Users found Succesfully...!";
	}
}
