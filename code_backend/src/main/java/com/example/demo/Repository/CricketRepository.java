package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cricketers;

public interface CricketRepository extends JpaRepository<Cricketers,Integer>
{

	

}
