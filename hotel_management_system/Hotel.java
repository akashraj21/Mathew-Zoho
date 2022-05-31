package hotel_management_system;

import java.util.*;

public class Hotel {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		Hotel_d ad = new Hotel_d();
		
		int ch;
		
		do{
			System.out.println("***** Hotel Management System *****");
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

class Hotel_d {
	
	Scanner s2 = new Scanner(System.in);
	String customer_name;
	int no_of_people;
	int room_booked;
	String room_type;
	String accomodations;
	long contact_number;
	int Ac = 20;
	int non_Ac = 30;
	String food;
	int price;
	
	
	Customer_Details c[] = new Customer_Details[20];
	Food order[] = new Food[30];
	Food arr[] = new Food[20];
	
	int cnt = 0;
	int orderc = 0;
	int arrcnt = 0;
	
	public void admin()
	{
		int opt1;
		
		do{
			System.out.println("**** Admin *****");
			System.out.println("[1]. Add Food");
			System.out.println("[2]. Menu");
			System.out.println("[3]. Orders");
			System.out.println("[4]. Exit");
			opt1 = s2.nextInt();
			s2.nextLine();
			
			switch(opt1)
			{
			case 1 :
			{
				System.out.println("Enter Dish Name : ");
				food = s2.nextLine();
				
				
				System.out.println("Enter Price : ");
				price = s2.nextInt();
				
				arr[arrcnt] = new Food(food, price);
				arrcnt++;
				
				break;
			}
			case 2 :
			{
				System.out.println("Dishes     Price");
				for(int i = 0; i < arrcnt; i++)
				{
					arr[i].display();
				}
				break;
			}
			case 3 :
			{
				System.out.println("Customer Name  Room No  Dishes     Price");
				for(int i = 0; i < orderc; i++)
				{
					order[i].display1();
				}
				break;
			}
			case 4 :
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
		}while(opt1 != 4);
		
	}
	
	public void customer()
	 {
		int opt;
		
		do{
			System.out.println("***** Customer *****");
			System.out.println("[1]. Book Room");
			System.out.println("[2]. Display Details");
			System.out.println("[3]. Cancel Booking");
			System.out.println("[4]. Order Food");
			System.out.println("[5]. Logout");
			opt = s2.nextInt();
			s2.nextLine();
			
			switch(opt){
			case 1 :
			{
				System.out.println("Enter Customer Name : ");
				customer_name = s2.nextLine();
				
				System.out.println("Enter No of People : ");
				no_of_people = s2.nextInt();
				s2.nextLine();
				
				System.out.println("Room Type You want(AC/non-Ac) : ");
				room_type = s2.nextLine();
				
				if (room_type.equalsIgnoreCase("AC"))
				{
					Ac--;
				}
				else{
					non_Ac--;
				}
				
				System.out.println("Enter Room Id : ");
				room_booked = s2.nextInt();
				s2.nextLine();
				
				
				System.out.println("Enter Contact Number : ");
				contact_number = s2.nextLong();
				
				c[cnt] = new Customer_Details(customer_name, no_of_people, room_booked,room_type,contact_number);
				cnt++;
				
				break;
			}
			case 2 :
			{
				System.out.println("Select the customer Name : ");
				for(int i = 0; i < cnt; i++)
				{
					System.out.println((i+1)+ ".  " + c[i].customer_name);
				}
				
				int cusnum = s2.nextInt();
				s2.nextLine();
				
				c[cusnum-1].display();
				break;
			}
			case 3 :
			{
				System.out.println("Select the customer Name to Cancel Booking : ");
				for(int i = 0; i < cnt; i++)
				{
					System.out.println((i+1)+ ".  " + c[i].customer_name);
				}
				
				int cusnum = s2.nextInt();
				s2.nextLine();
				
				for(int i = cusnum-1; i < cnt; i++)
				{
					c[i] = c[i+1];
				}
				cnt--;
				
				break;
			}
			case 4 :
			{
				System.out.println("Select the customer Name : ");
				for(int i = 0; i < cnt; i++)
				{
					System.out.println((i+1)+ ".  " + c[i].customer_name);
				}
				
				int cusnum = s2.nextInt();
				s2.nextLine();
				
				
				int roomid = c[cusnum-1].room_booked;
				
				System.out.println("Dishes     Price");
				for(int i = 0; i < arrcnt; i++)
				{
					arr[i].display();
				}
				
				int fn = s2.nextInt();
				s2.nextLine();
				
				order[orderc] = new Food(c[cusnum-1].customer_name, roomid, arr[fn-1].food, arr[fn-1].price);
				orderc++;
				
				break;
			}
			case 5 :
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
		}while(opt != 5);
		
	}
	
	
	public void payment()
	{
		
		
	}
}

class Customer_Details1{
	
	String customer_name;
	int no_of_people;
	int room_booked;
	String room_type;
	long contact_number;
	
	 public Customer_Details(String customer_name, int no_of_people, int room_booked, String room_type,long contact_number)
	 {
		 this.customer_name = customer_name;
		 this.no_of_people = no_of_people;
		 this.room_booked = room_booked;
		 this.room_type = room_type;
		 this.contact_number = contact_number;
	 }
	 
	 public void display()
	 {
		 System.out.println("Customer Name : " + customer_name);
		 System.out.println("No of Person : " + no_of_people);
		 System.out.println("Room Id : " + room_booked);
		 System.out.println("Room Type : " + room_type);
		 System.out.println("Contact Number : " + contact_number);
	 }
}

class Food{
	
	String customer_name;
	int room_id;
	String food;
	int price;
	
	
	int foodcnt = 0;
	
	Scanner s3 = new Scanner(System.in);
	
	public Food(String food, int price)
	{
		this.food = food;
		this.price = price;
	}
	
	public Food(String customer_name, int room_id, String food, int price)
	{
		this.food = food;
		this.price = price;
		this.customer_name = customer_name;
		this.room_id = room_id;
	}
	
	public void display()
	{
		System.out.println(food + "   " + price);
	}
	
	public void display1()
	{
		System.out.println(customer_name + "   " + room_id + "   " + food + "   " + price);
	}
	
}