package RCI;

public class bank extends Display_Details{

	public static void main(String[] args) {
		   
		Display_Details A = new Display_Details();
		A.accHolderName = "AK";
		A.accNo = 468127965;
		A.setAccBalance(4500.27); 
		A.displayAllDetails();

	}

}
