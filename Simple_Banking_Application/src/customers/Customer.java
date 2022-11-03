package customers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Customer {
	private String fullName;
	private int accountNo;
	private String accountType;
	private int balance;
	private String mobileNo;
	
	public String getFullName() {
		return fullName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public int getBalance() {
		return balance;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	
	public Customer() {
		
	}
	
	Customer(String fullName, int accountNo, String accountType, int balance, String mobileNo){
		this.fullName = fullName;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.mobileNo = mobileNo;
	}
	public String toString() {
		return "The account holder name: " + fullName + "\n" +
			   "The account No: " + accountNo + "\n" +
			   "The accountType: " + accountType + "\n" +
			   "The balance: " + balance + "\n" +
			   "The mobileno: " + mobileNo;
	}
	
	ArrayList<Customer> nc = new ArrayList<Customer>();
	Scanner read = new Scanner(System.in);
	
	public void insertNewCustomer() {
		System.out.println("Enter the Full Name");
		fullName = read.next();
		System.out.println("Enter the Account No");
		accountNo = read.nextInt();
		System.out.println("Enter the Account Type");
		accountType = read.next();
		System.out.println("Enter the balance");
		balance = read.nextInt();
		System.out.println("Enter the Mobile No");
		mobileNo = read.next();
		nc.add(new Customer(fullName,accountNo,accountType,balance,mobileNo));
	}
	public void display() {
		System.out.println("The full name: "+ getFullName());
		System.out.println("The account number: "+ getAccountNo());
		System.out.println("The account type: "+ getAccountType());
		System.out.println("The balance: "+ getBalance());
		System.out.println("The mobile number: "+ getMobileNo());
		
	}
	public void searchByAccountNo() {
		System.out.println("enter the account number:");
		int acno = read.nextInt();
		Iterator<Customer> ic = nc.iterator();
		while(ic.hasNext()) {
			Customer ncc = ic.next();
			if(ncc.accountNo == acno) {
				System.out.println(ncc);
			}
			else {
				System.out.println("There is no customer record");
			}
		}
	}
	public void deposit() {
		System.out.println("Enter the account no");
		int ad = read.nextInt();
		System.out.println("Enter the deposit amount");
		int depositAmount = read.nextInt();
		Iterator<Customer> ics = nc.iterator();
		while(ics.hasNext()) {
			Customer ncs = ics.next();
			if(ncs.accountNo == ad) {
				ncs.balance = ncs.balance + depositAmount;
				System.out.println(ncs);
			}
			else {
				System.out.println("There  no such account");
			}
				
		}
	}
	public void withdrawal() {
		System.out.println("Enter the account no");
		int ant = read.nextInt();
		System.out.println("Enter the withdrawal amount");
		int withDAmt = read.nextInt();
		Iterator<Customer> inc = nc.iterator();
		while(inc.hasNext()) {
			Customer ncus = inc.next();
			if(ncus.accountNo == ant) {
				if(ncus.balance > withDAmt) {
					ncus.balance = ncus.balance - withDAmt;
					System.out.println("The amount has been withdrawn successfully");
				}
				else {
					System.out.println("Insufficient balance in your account");
				}
				System.out.println(ncus);
			}
			else {
				System.out.println("There  is no such account");
			}
			
		}
	}
	public void checkBalance() {
		System.out.println("Enter the account no");
		int actno = read.nextInt();
		Iterator<Customer> inc = nc.iterator();
		while(inc.hasNext()) {
			Customer nrs = inc.next();
			if(nrs.accountNo == actno) {
				System.out.println("The current balance of this account is" + nrs.balance);
			}
			else {
				System.out.println("No such account in the bank");
			}
		}
	}


}
