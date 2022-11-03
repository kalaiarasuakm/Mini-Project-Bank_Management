package bank_Management;
import java.util.Scanner;

public class Options {
	int op;
	int choose;
	customers.Customer ne = new customers.Customer();
	public void selectOptions() {
		Scanner read = new Scanner(System.in);
		do {
			System.out.println("Choose the below options");
			System.out.println("1.Customer");
			System.out.println("2.Exit");
			op = read.nextInt();
			switch(op) {
			case 1: System.out.println("1.Insert the  customer details");
			        System.out.println("2.Displaying the customer details");
			        System.out.println("3.Search the customer details by AC No");
			        System.out.println("4.Deposit of customers money ");
			        System.out.println("5.Withdrawal of customers money");
			        System.out.println("6.Check Balance");
			        System.out.println("7.Exit");
			        System.out.println("Choose the above options");
			        choose = read.nextInt();
			        switch(choose) {
			        case 1: ne.insertNewCustomer();
			                break;
			        case 2: ne.display();
			                break;
			        case 3: ne.searchByAccountNo();
			                break;
			        case 4: ne.deposit();
			                break;
			        case 5: ne.withdrawal();
			                break;
			        case 6: ne.checkBalance();
			                break;
			        case 7: System.exit(0);
			                break;
			        }
			        break;
			case 2: System.exit(0);
			        break;
			}
		}while(op!=0);
	}
}
