package lab12;

public class UsedCar extends Car {
protected double mileage;	

public UsedCar(double mileage) {
	super();
	this.mileage = mileage;
}

public UsedCar (String make,String model,int year, double price, double mileage) {
		super(make,model,year,price);
		this.mileage = mileage;
	}

public double getMileage() {
	return mileage;
}

public void setMileage(double mileage) {
	this.mileage = mileage;
}
@Override
public String toString() {
	return super.toString() + " (Used) " +mileage +" miles";
	
}

}
