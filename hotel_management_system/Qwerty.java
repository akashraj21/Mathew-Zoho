
package hotel_management_system;

import java.util.*;
interface p1
{
	void admin();
	void customer();
	
}

abstract class func{
	
	
	abstract public void cart();
	
	Scanner s3 = new Scanner(System.in);
	
	public void payment(int sum)
	{
		
		
		int ch;
					int cnum;
					String d;
					int ccnum;
					
					
					System.out.println("Your Cart Total : " + sum);
					System.out.println("Enter the Mode of Payment");
					System.out.println("[1]. Card");
					System.out.println("[2]. Cash");
					ch = s3.nextInt();
					s3.nextLine();
					
					if(ch == 1)
					{
						System.out.println("Enter Your 16 Digit Number : ");
						cnum = s3.nextInt();
						s3.nextLine();
						
						System.out.println("Enter Expiry date(dd/mm) : ");
						d = s3.nextLine();
						
						System.out.println("Enter cvv : ");
						ccnum = s3.nextInt();
						s3.nextLine();
						
						System.out.println("The Amount " + sum + "Paid");
					}
					else if(ch == 2)
					{
						System.out.println("You have to pay "+ sum + "On Delivery");
					}
	}
	
	
	
}
public class Qwerty{
	
	public static void main(String args[])
	{
		
		
		int opt1;
		Scanner s1 = new Scanner(System.in);
		
		Initialize a = new Initialize();
		
		
		do{
			System.out.println(" ***** ZOHO ONLINE SHOPPING LOGIN *****");
			System.out.println("[1] . ADMIN");
			System.out.println("[2] . CUSTOMERS");
			System.out.println("[3] . Exit");
			opt1 = s1.nextInt();
			s1.nextLine();
			
			switch(opt1)
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
				
					o = authCheck(user, pass);
					if(o == 0)
					{
						break;
					}
					else
					{
					
						a.admin();
						break;
					}
					
				}
				case 2 :
				{
					a.customer();
					break;
				}
				case 3 : 
				{
					System.out.println("Returning Main");
					break;
				}
				default :
				{
					System.out.println("Invalid Input");
					break;
				}
				
			}
			
			
		}
		while(opt1 != 3);
		
		
	}
	
	
	public static int authCheck(String username, String password)
	{
		
		final String user = "admin";
		final String pass = "pass";
		if(username.equals(user)){
			if (password.equals(pass))
			{
				System.out.println("Authentication Success");
				return 1;
			}
			else{
				System.out.println("Incorrect Password");
				return 0;
			}
		}
		else{
			System.out.println("Incorrect Username");
			return 0;
		}
		
	}
}

class Initialize extends func implements p1{
	
	int opt2;
	Scanner s2 = new Scanner(System.in);
	
	public static Store_Items sarr[] = new Store_Items[20];
	public static int scnt = 0;
	
	
	public void admin()
	{
		do{
			System.out.println(" ***** ADMIN *****");
			System.out.println("[1] . ADD ITEMS");
			System.out.println("[2] . VIEW ITEMS");
			System.out.println("[3] . DELETE ITEMS");
			System.out.println("[4] . EXIT");
			opt2 = s2.nextInt();
			s2.nextLine();
			
			switch(opt2)
			{
				case 1 :
				{
					int id;
					String name;
					int price;
					
					System.out.println("Enter the Product ID : ");
					id = s2.nextInt();
					s2.nextLine();
					
					System.out.println("Enter the Product Name : ");
					name = s2.nextLine();
					
					System.out.println("Enter Product Price : ");
					price = s2.nextInt();
					s2.nextLine();
					
					sarr[scnt] = new Store_Items(id,name,price);
					scnt++;
					
					break;
				}
				case 2 :
				{
					for(int i = 0; i < scnt; i++)
					{
						System.out.println("Product " + (i+1));
						sarr[i].display();
						System.out.println();
						
					}
					break;
					
				}
				case 3 :
				{
					int iid;
					
					for(int i = 0; i < scnt; i++)
					{
						System.out.println("Product " + (i+1));
						sarr[i].display();
						System.out.println();
						
					}
					
					System.out.println("Enter the Product id to be deleted : ");
					iid = s2.nextInt();
					s2.nextLine();
					
					for(int i = iid-1; i < scnt; i++)
					{
						sarr[i] = sarr[i+1];
						
					}
					
					scnt--;
					break;
					
				}
	
				case 4 : 
				{
					System.out.println("Returning Main");
					break;
				}
				default :
				{
					System.out.println("Invalid Input");
					break;
				}
			}
		
		}
		while(opt2 != 4);
	}
	
	
	public void customer(){
		
		int sum = 0;
		
		do{
			System.out.println(" ***** ZOHO ONLINE SHOPPING *****");
			System.out.println("[1] . Products");
			System.out.println("[2] . Purchase");
			System.out.println("[3] . View Cart");
			System.out.println("[4] . Paymetn");
			System.out.println("[9] . EXIT");
			opt2 = s2.nextInt();
			s2.nextLine();
			
			switch(opt2)
			{
				case 1 :
				{
					for(int i = 0; i < scnt; i++)
					{
						System.out.println("Product " + (i+1));
						sarr[i].display();
						System.out.println();
						
					}
					break;
					
				}
				case 2 :
				{
					for(int i = 0; i < scnt; i++)
					{
						System.out.println("Product " + (i+1));
						sarr[i].display();
						System.out.println();
						
					}
					
					cart();
					break;
				}
				case 3 :
				{
					System.out.println("***** CART *****");
					System.out.println("Product Id\tproduct\t\tPrice\tQuantity\tTotal");
					
					for(int j = 0; j < ccnt; j++)
					{
			
						carr[j].display();
						
					}
					
					break;
				}
				case 4 :
				{
					for(int j = 0; j < ccnt; j++)
					{
						sum += carr[j].total;
						
					}
					super.payment(sum);
					
					
				}
				case 9 : 
				{
					ccnt = 0;
					System.out.println("Returning Main");
					break;
				}
				default :
				{
					System.out.println("Invalid Input");
					break;
				}
			}
		
		}
		while(opt2 != 9);
		
	}
	
	
	Cart_Details carr[] = new Cart_Details[20];
	int ccnt = 0;
	
	public void cart(){
		
		int idc, flag1 = 0,i, flag2 = 0, qty;
		
		
		do{
			System.out.println("-1 To exit....");
			System.out.println("Enter the Product Id : ");
			idc = s2.nextInt();
			s2.nextLine();
			
			if(idc == -1)
			{
				flag1 = 1;
				break;
			}
			
			for(i = 0; i < scnt; i++)
			{
				if(sarr[i].getid() == idc)
				{
					flag2 = 1;
					break;
				}
			}
			
			if(flag2 == 0)
			{
				System.out.println("Invalid Product Id");
				continue;
			}
			
			sarr[i].display();
			
			System.out.println("Enter The Quantity : ");
			qty = s2.nextInt();
			s2.nextLine();
			
			carr[ccnt] = new Cart_Details(sarr[i].getname() ,sarr[i].getid(), qty, sarr[i].getprice());
			ccnt++;
			
			
		}while(flag1 != 1);
		
		
	}
	
}



class Store_Items{
	
	private int product_id;
	private String product_name;
	private int price;
	
	public Store_Items(int product_id, String product_name, int price){
		
		setid(product_id);
		setname(product_name);
		setprice(price);
		
	}
	
	public int getid()
	{
		return product_id;
	}
	
	public void setid(int product_id)
	{
		this.product_id = product_id;
	}
	
	public String getname()
	{
		return product_name;
	}
	
	public void setname(String product_name)
	{
		this.product_name = product_name;
	}
	
	public int getprice()
	{
		return price;
	}
	
	public void setprice(int price)
	{
		this.price = price;
	}
	
	public void display()
	{
		System.out.println("Product Id : " + getid());
		System.out.println("Product Name : " + getname());
		System.out.println("Product Price : " + getprice());
		
	}
	
}

class Cart_Details{
	
	int pro_id;
	String name;
	int qty;
	int price;
	int total;
	
	public Cart_Details(String name, int pro_id, int qty, int price)
	{
		this.name = name;
		this.pro_id = pro_id;
		this.qty = qty;
		this.price = price;
		
		total = qty * price;
		
	}
	
	public void display()
	{
		System.out.println(pro_id + "\t" + name + "\t\t" + price + "\t" + qty + "\t" + total );
	}
	
}


