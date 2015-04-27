package main;

import net.webservicex.*;

public class Main {
	public static void main(String[] args){
		Country factory = new Country();
		CountrySoap proxy = factory.getCountrySoap();
		
		String country = proxy.getCountryByCountryCode("TH");
		System.out.println("Country " + country);
	}
}
