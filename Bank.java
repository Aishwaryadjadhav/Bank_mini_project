package mini_project;

public class Bank {

	int acc_num;
	String holdername;
	int current_blnc;
	
	public Bank(int acc_num, String holdername, int current_blnc) {
		super();
		this.acc_num = acc_num;
		this.holdername = holdername;
		this.current_blnc = current_blnc;
	}
	
	public static void main(String[] args) {
		
		Bank b=new Bank(1001,"aishu",20000);
		
		b.displayblnc();
		b.deposite(10000);
		b.withdraw(10000);
		
		b.printaccdtails();
		
	}
	
	private void printaccdtails() {
		System.out.println("-------------account details------------");
		System.out.println("account number  :"+ acc_num);
		System.out.println("holder name  :"+ holdername);
		System.out.println("current_blnc  :"+ current_blnc);
		System.out.println("-----------------------------------------");
		
		
	}

	private void displayblnc() {
		System.out.println("current_blnc"+" : "+current_blnc);
		System.out.println("-----------------------------------------");
		
	}


	private void withdraw(int amount) {
		if(current_blnc>=amount) {
			current_blnc=current_blnc-amount;
			System.out.println("amount withdraw" + " : "+ amount);
			System.out.println("current_blnc after withdraw"+ " : " +current_blnc);
			System.out.println("-----------------------------------------");
			
		}else {
			System.out.println("no balance");
		}
		
		
	}
	private void deposite(int amount) {
		current_blnc=current_blnc+amount;
		System.out.println("amount deposit"+" : "+ amount);
		System.out.println("current_blnc after deposite"+ " : " +current_blnc);
		System.out.println("-----------------------------------------");
		
	}

}
