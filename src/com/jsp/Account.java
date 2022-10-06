package com.jsp;

public class Account {
	private String Name;
	private String Number;
	private double Balance;
	private String Phoneno;
	private String Email;
	private String Password;
	
	
	
	public Account(String Name,String Number,double Balance,String Phoneno,String Email,String Password) {
		this.Name=Name;
		this.Number=Number;
		this.Balance=Balance;
		this.Phoneno=Phoneno;
		this.Email=Email;
		this.Password=Password;
		
	}
	public void depositedMoney(double depositedMoney) {
		this.Balance+=depositedMoney;
		System.out.println("money deposisted sucessfull "+this.Balance);
	}
	public void withdrallMoney(double withdral) 
	{
		if(this.Balance-withdral<0) {
			System.out.println("unsucessful withdral "+this.Balance);
			
			
		}else {
			this.Balance-=withdral;
		System.out.println("sucessful withdral, current money is "+this.Balance);
		}
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	
	

}
