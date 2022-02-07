package model;

import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) throws NegativeNumberException{
		if(additionalW>=0)
		{
			weight = weight + additionalW;
		}else {
			throw new NegativeNumberException();
		}
		
	}
	//Lo hice yooo
	public void removeWeight(double WToSubstract) throws NegativeNumberException{
		if(WToSubstract>=0)
		{
			weight = weight - WToSubstract;
		}else {
			throw new NegativeNumberException();
		}
	
	}
}
