package hotel_management_system;

import java.util.*;

public class Atm extends initialize{
	
	public static void main(String args[])
	{
		arr[cus_cnt] = new Customer_Details("Mathew", 102030, 1234, 2000);
		cus_cnt++;
		
		int ch;
		Scanner s1 = new Scanner(System.in);
		initialize ad = new initialize();
		
		do{
			System.out.println("***** ATM *****");
			System.out.println("[1]. Admin");
			System.out.println("[2]. Customer");
			System.out.println("[3]. Exit");
			ch = s1.nextInt();
			s1.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				String user;
				String pass;
				int o = 0;
				
				System.out.println("Enter Username : ");
				user = s1.nextLine();
				
				System.out.println("Enter Password : ");
				pass = s1.nextLine();
				
				Auth a = new Auth();
				o = a.authCheck(user, pass);
				if(o == 0)
				{
					break;
				}
				else
				{
					
					ad.admin();
					break;
				}
				
			}
			case 2 :
			{
				ad.customer();
				break;
			}
			case 3 :
			{
				System.out.println("Thank You");
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
				break;
			}
			}
			
		}
		while(ch != 3);
		
	}
}
class initialize{
	
	String name;
	long accno;
	int pin;
	int bal;
	
	Scanner s2 = new Scanner(System.in);
	
	static Customer_Details arr[] = new Customer_Details[20];
	static int cus_cnt = 0;
	
	public void admin(){
		
		int opt1;
		
		do{
			System.out.println("***** Admin *****");
			System.out.println("[1]. Add Customer");
			System.out.println("[2]. View Customer");
			System.out.println("[3]. Exit");
			opt1 = s2.nextInt();
			s2.nextLine();
			
			switch(opt1)
			{
			case 1 :
			{
				System.out.println("Enter Name : ");
				name = s2.nextLine();
				
				System.out.println("Enter Account Number : "); 
				accno = s2.nextLong();
				
				System.out.println("Enter PIN Number : ");
				pin = s2.nextInt();
				s2.nextLine();
				
				System.out.println("Enter Balance : ");
				bal = s2.nextInt();
				s2.nextLine();
				
				arr[cus_cnt] = new Customer_Details(name, accno, pin, bal);
				cus_cnt++;
				
				break;
			}
			case 2 :
			{
				for(int i = 0; i < cus_cnt; i++)
				{
					System.out.println("\nCustomer : " + (i+1));
					arr[i].display();
				}
				
				break;
			}
			case 3 :
			{
				System.out.println("Thank You");
				break;
				
			}
			default :
			{
				System.out.println("Invalid Input");
				break;
			}
			}
		}while(opt1 != 3);
	}
	
	public void customer()
	{
		int opt2;
		
		do{
			System.out.println("***** ATM *****");
			System.out.println("[1]. Enter Account No");
			System.out.println("[2]. Exit");
			opt2 = s2.nextInt();
			s2.nextLine();
			
			switch(opt2)
			{
			case 1 :
			{
				int acno, flag = 0, i;
				System.out.println("Enter Account No : ");
				acno = s2.nextInt();
				
				for(i = 0; i < cus_cnt; i++)
				{
					if(acno == arr[i].getaccno())
					{
						flag = 1;
						break;
					}
				}
				
				if (flag == 0)
				{
					System.out.println("Invalid Account Number");
				}
				else if(flag == 1)
				{
					int p;
					System.out.println("Enter Pin No : ");
					p = s2.nextInt();
					s2.nextLine();
					
					if (p == arr[i].getpin())
					{
						arr[i].display1();
						actions(i);
					}
					else
					{
						System.out.println("Invalid Pin");
					}
				}
				break;
			}
			case 2 :
			{
				System.out.println("THANK YOU");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
			}
		}while(opt2 != 2);
	}
	
	public void actions(int i){
		
		int opt3;
		
		do{
			System.out.println("[1]. Deposit");
			System.out.println("[2]. Withdraw");
			System.out.println("[3]. Balance");
			System.out.println("[4]. Change Pin");
			System.out.println("[5]. Exit");
			opt3 = s2.nextInt();
			s2.nextLine();
			
			switch(opt3)
			{
			case 1 :
			{
				System.out.println("Balance : " + arr[i].getbal());
				
				int wt;
				
				System.out.println("Enter the Amount to Withdraw : ");
				wt = s2.nextInt();
				s2.nextLine();
				
				if (wt > arr[i].getbal())
				{
					System.out.println("Enter Valid Amount");
				}
				else
				{
					arr[i].setbal(arr[i].getbal() - wt);
					System.out.println("WithDrawed.. ");
					
					System.out.println("Balance : " + arr[i].getbal());
				}
				break;
			}
			case 2 :
			{
				int dp;
				
				System.out.println("Enter the Amount to Deposit : ");
				dp = s2.nextInt();
				s2.nextLine();
				
				if (dp < 0)
				{
					System.out.println("Deposit Valid Amount");
				}
				else
				{
					arr[i].setbal(arr[i].getbal() + dp);
					System.out.println("Deposited.. ");
					
					System.out.println("Balance : " + arr[i].getbal());
				}
				break;
			}
			case 3 :
			{
				System.out.println("Balance : " + arr[i].getbal());
				break;
			}
			case 4 :
			{
				int cp;
				System.out.println("Enter your Old Pin : ");
				cp = s2.nextInt();
				s2.nextLine();
				
				
				if(arr[i].getpin() == cp)
				{
					System.out.println("Enter Your New Pin : ");
					cp = s2.nextInt();
					s2.nextLine();
				
					arr[i].setpin(cp);
				
					System.out.println("Pin Changed");
				}
				else
				{
					System.out.println("Invalid Pin");
				}
				break;
				
			}
			case 5 :
			{
				System.out.println("THANK YOU");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}
			}
		}while(opt3 != 5);
		
	}
}


class Customer_Details{
	
	private long cus_accno;
	private int pin;
	private String name;
	private int bal;

	public Customer_Details(String name, long accno, int pin, int bal)
	{
		setaccno(accno);
		setname(name);
		setpin(pin);
		setbal(bal);
	}
	
	
	
	public long getaccno()
	{
		return cus_accno;
	}
	
	public void setaccno(long accno)
	{
		cus_accno = accno;
	}
	
	public int getpin()
	{
		return pin;
	}
	
	public void setpin(int pin)
	{
		this.pin = pin;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public int getbal()
	{
		return bal;
	}
	
	public void setbal(int bal)
	{
		this.bal = bal;
	}
	
	public void display()
	{
		System.out.println("Name : " + getname());
		System.out.println("Account No : " + getaccno());
		System.out.println("PIN : " + getpin());
		System.out.println("Balance : " + getbal());
	}
	
	public void display1()
	{
		System.out.println("Name : " + getname());
		System.out.println("Account No : " + getaccno());
		System.out.println("Balance : " + getbal());
	}
}
		
	