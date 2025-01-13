package RCI;

public class Display_Details extends bankAccount {
	

	@Override
	public void displayAllDetails() {
		System.out.println(this.accHolderName);
		System.out.println(this.accNo);
		System.out.println(this.getAccBalance());
		
	}
}
