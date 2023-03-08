package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cricketers;
import com.example.demo.Repository.CricketRepository;

@Service
public class CricketService
{
@Autowired
CricketRepository crickrepo;
	public String deletefunction(int jersey)
	{
		if(crickrepo.existsById(jersey))
		{
		crickrepo.deleteById(jersey);
		return "Successfully Deleted";
		}
		else
		{
			return "The Jersey doesnt exist";
		}
	}
	public String updatefunction(int jersey,Cricketers bt)
	{
		if(crickrepo.existsById(jersey)) 
		{
			Cricketers bat=new Cricketers();
			bat.setJersey(bt.getJersey());
//			crickrepo.save(bt);
			bat.setName(bt.getName());
//			crickrepo.save(bt);
			bat.setRuns(bt.getRuns());
//			crickrepo.save(bt);
			bat.setFranchise(bt.getFranchise());
//			crickrepo.save(bt);
			bat.setAuction_rate(bt.getAuction_rate());
//			crickrepo.save(bt);
			bat.setCenturies(bt.isCenturies());
			crickrepo.save(bt);
			return "Updated";
		}
		else
		{
			return "The jersey doesnt exist";
		}
	}
	public Optional<Cricketers> findcricketer(int jersey) 
	{
		return crickrepo.findById(jersey);
		
	}
}
