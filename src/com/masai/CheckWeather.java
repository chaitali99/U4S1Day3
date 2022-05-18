package com.masai;

public class CheckWeather {
	boolean isSnowing;
	boolean isRaining;
	double temperature;
	
	public static void main(String [] args) {
		CheckWeather cw = new CheckWeather();
		cw.isSnowing=false;
		cw.isRaining=true;
		cw.temperature=70.33;
		if(cw.temperature<50.00  || cw.isSnowing ||cw.isRaining) {
			System.out.println("Let's stay home.");
		}else {
			System.out.println("Lets's go out!");
		}
			
			
	}

}
