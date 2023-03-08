package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Cricketers;
import com.example.demo.Repository.CricketRepository;
import com.example.demo.Service.CricketService;
@RestController
@CrossOrigin("http://localhost:3000")
public class CricketController
{
	@Autowired
	CricketRepository crickrepo;
	@Autowired 
	CricketService crickserv;
	@GetMapping("/get")
	List<Cricketers> allfunction()
	{
		return crickrepo.findAll();
	}
	@GetMapping("/get/{jersey}")
	public Optional <Cricketers>getById(@PathVariable int jersey)
	{
		return crickserv.findcricketer(jersey);
	}
	@PostMapping("/post")
	public Cricketers postfunction(@RequestBody Cricketers bat)
	{
		return crickrepo.save(bat);
	}
	
	@DeleteMapping("/delete/{jersey}")
	public String delfunc(@PathVariable int jersey)
	{
		return crickserv.deletefunction(jersey);
	}
	@PutMapping("/update/{jersey}")
	public String updfunc(@PathVariable int jersey,@RequestBody Cricketers bt)
	{
		return crickserv.updatefunction(jersey,bt);
	}
}
