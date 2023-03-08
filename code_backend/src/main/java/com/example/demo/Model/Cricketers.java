package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cricketers 
{
	@Id
	private int jersey;
	private String Name;
	private int runs;
	private String franchise;
	private double auction_rate;
	private boolean centuries;
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	public double getAuction_rate() {
		return auction_rate;
	}
	public void setAuction_rate(double auction_rate) {
		this.auction_rate = auction_rate;
	}
	public boolean isCenturies() {
		return centuries;
	}
	public void setCenturies(boolean centuries) {
		this.centuries = centuries;
	}
	public Cricketers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cricketers(int jersey, String name, int runs, String franchise, double auction_rate, boolean centuries) {
		super();
		this.jersey = jersey;
		Name = name;
		this.runs = runs;
		this.franchise = franchise;
		this.auction_rate = auction_rate;
		this.centuries = centuries;
	}
}
