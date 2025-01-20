package RCI;

public class car {
	String make = null;
	String model = null;
	int year = 0;
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void DisplayDetails() {
		System.out.println("This is a"+this.make);
		System.out.println("Model is "+this.model);
		System.out.println("launch in "+this.year);
	}
	
	public static void main(String[] args) {
		car a =new car();
		a.setMake("Toyota"); 
		a.setModel("Camry");
		a.setYear(2023);
		
		a.DisplayDetails();
		
	}
}
