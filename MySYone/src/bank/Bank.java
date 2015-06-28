package bank;

public class Bank {
	public String name;  
	public double balance;
	
	public Bank(String n,double b)
	{
		this.name = n;
		this.balance = b;
	}
	
	public double ck(float je){
		balance += je;
		return balance;
	}
	
	public double qk(float je){
		balance -= je;
		return balance;
	}
	
	public double cx(){
		return balance;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String name = "cs";
		double money = 210;
		double cureentmoy;
		Bank mybank = new Bank(name,money);
		cureentmoy = mybank.cx();
		System.out.println("1.当前余额:");
		System.out.println(cureentmoy);
		mybank.ck(500);
		cureentmoy = mybank.cx();
		System.out.println("2.当前余额");
		System.out.println(cureentmoy);
		mybank.qk(300);
		cureentmoy = mybank.cx();
		System.out.println("3.当前余额");
		System.out.println(cureentmoy);
		
		
	}

}
