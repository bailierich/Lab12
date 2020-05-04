package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {
	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Big B car terminal admin page!\n");
		System.out.print("How many cars would you like to enter?");
		int amntOfCars = scnr.nextInt();
		
		for (int i = 0; i < amntOfCars; i++) {
			addCar();
		}
		
		System.out.println("Here are the cars you added to your terminal: ");
		listCars();
	}
public static void addCar() {
	Car car = new Car();
	System.out.println("Make: " );
	car.setMake(scnr.next());
	
	
	
	System.out.println("Model: ");
	car.setModel(scnr.next());
	
	System.out.println("Year: ");
	car.setYear(scnr.nextInt());
	
	System.out.println("Price: ");
	car.setPrice(scnr.nextDouble());
	
	scnr.nextLine(); // what's a good way to know when you need to add a line to
					// clear your scanner?
	cars.add(car);
	
}
public static void listCars() {
	for (int i = 0; i < cars.size(); i++) {
		System.out.printf("%-7s %-7s %-5d $%.2f",cars.get(i).getMake(),cars.get(i).getModel(),cars.get(i).getYear(),cars.get(i).getPrice());
	}
}
}
