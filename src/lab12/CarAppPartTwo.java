package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppPartTwo {
public static Scanner scnr = new Scanner(System.in);
public static List<Car> cars = new ArrayList<>();	
static {
		cars.add(new Car("BMW","X2 xDrive28i" , 2020, 41845));
		cars.add(new Car("Cadillac", "Escalade ESV Luxury",2020 , 75669));
		cars.add(new Car("Cadillac", "CT5 V-Series", 2020, 64890));
		cars.add(new UsedCar("Chevrolet","Impala LT", 2011, 2995, 190306));
		cars.add(new UsedCar("Dodge", "Dart", 2015, 6995, 64384));
		cars.add(new UsedCar("Lexus", "LS 430", 2005,3995,186580 ));
	}


public static void main(String[] args) {
	listCars();
	System.out.println("\nWhich car would you like?");
	int selectedCar = scnr.nextInt();
	showById(selectedCar);
	System.out.println("\nWould you like to buy this car (y/n)?");
	String decision = scnr.next();
	
	if(decision.equalsIgnoreCase("y")) {
		System.out.println("\nGreat! Our finance department will be in touch shortly!");
		buyCar(selectedCar);
	}else {
		System.out.println("Ok! Maybe you'll be ready to buy next time!");
	}
	
	System.out.println("\nCurrent Car List: ");
	listCars();
	
	System.out.println("\nHave a great day!");
	
}
public static void listCars() {
	for (int i = 0; i < cars.size(); i++) {
		System.out.println("Car "+ (i+1) + " : " + cars.get(i));
		
	}
}
public static void showById(int id) {
	System.out.println(cars.get(id - 1));
}
public static void buyCar(int id) {
	cars.remove(id - 1);
}
}