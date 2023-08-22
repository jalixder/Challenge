package Clases;

public class ConvertidorDivisas {
	
	public double PaU(int num1) {
	
		return num1*0.000244;  // Dolar en Agosto 21/2023, igual demas equivalencias
	}
	
	public double UaP(double num1) {
		
		return num1*4107.3;
	}
	
	public double PaE(int num1) { 
		
		return num1*0.000223;
	}
	
	public double EaP(double num1) {
		
		return num1*4481.3;
	}
	
	public double PaL(int num1) {
		
		return num1*0.00019;
	}
	
	public double LaP(double num1) {
		
		return num1*5244.2;
	}
	
	public double PaY(int num1) { 
		
		return num1*0.0356;
	}
	
	public double YaP(int num1) {
		
		return num1*28.12;
	}
	
}