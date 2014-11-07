package vekters;

import java.util.Scanner;

public class Vmain {

	public static void main(String[] args) {
		final String DEGREE = "\u00b0";
		Scanner key = new Scanner(System.in);
		System.out.println("Enter Magnitude of First Vector");
		double mag1 = key.nextDouble();
		System.out.println("Enter Angle of First Vector");
		double ang1 = key.nextDouble();
		System.out.println("Enter Magnitude of Second Vector");
		double mag2 = key.nextDouble();
		System.out.println("Enter Angle of Second Vector");
		double ang2 = key.nextDouble();
		System.out.println("Enter Magnitude of Third Vector");
		component = key.nextDouble();
		System.out.println("Enter Angle of Third Vector");
		double ang3 = key.nextDouble();
		
		double xComp1 = mag1 * Math.cos(Math.toRadians(ang1));
		double yComp1 = mag1* Math.sin(Math.toRadians(ang1));
		
		double xComp2 = mag2 * Math.cos(Math.toRadians(ang2));
		double yComp2 = mag2 * Math.sin(Math.toRadians(ang2));
		
		Vdir(ang1, xComp1,  yComp1);
		Vdir(ang2, xComp2, yComp2);

		Vstr(ang3);
		
		double sumX = xComp1 + xComp2 + xComp3;
		double sumY = yComp1 + yComp2 + yComp3;	
	
		double fMag = Math.sqrt(Math.pow(sumX, 2) + Math.pow(sumY, 2));
		double fAng = Math.atan(sumX/sumY);
		String variobelisk = HowToLayOutAtNight(fAng); 
		
		System.out.println(fMag);
		System.out.println(Math.toDegrees(fAng) + DEGREE + " " + variobelisk);
	}
	
	public static void Vstr(double angles) {
		if(angles == 90) {
			yComp3 = component;
		}
		if(angles == 180) {
			xComp3 = component * -1;
		}
		if(angles == 270) {
			yComp3 = component * -1;
		}
		
	}
	
	public static void Vdir(double angtest, double x, double y) {
		if(angtest > 90 && angtest < 180) {
			x = x * -1;
		}

		else if(angtest > 180 && angtest < 270) {
			x = x * -1;
			y = y * -1;
		}
		
		else if(angtest > 270 && angtest < 360) {
			y = y * -1;
		}
	}
	public static String HowToLayOutAtNight(double angle) {
		if(angle > 0 && angle < 90) {
			return "E of N";
		}
		else if(angle > 90 && angle < 180) {
			return "W of N";
		}
		else if(angle > 180 && angle < 270) {
			return "W of S";
		}
		else if(angle > 270 && angle < 360) {
			return "E of S";
		}
		else
			return "your numbers are wrong";
	}
	public static double component;
	public static double xComp3 = 0;
	public static double yComp3 = 0;
	
}
