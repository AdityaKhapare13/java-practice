package RCI;

public abstract class bankAccount {
	public String accHolderName = "Aditya";
	public int accNo = 965713845;
	private double accBalance = 1587.25;
	
	public abstract void displayAllDetails();

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	} 

	

}
