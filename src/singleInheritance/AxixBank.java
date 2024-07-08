 package singleInheritance;

public class AxixBank extends BankInfo {
	 
	void deposits() {
    System.out.println("The amount deposit by saving account");
	}

	public static void main(String[] args) {
		AxixBank paymode=new AxixBank();
		paymode.saving();
		paymode.fixed();
		paymode.deposits();		
		
	}

}
