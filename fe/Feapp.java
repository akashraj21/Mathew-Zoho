package fe;

import java.util.*;
import java.util.Scanner;

public class Feapp {
	
	static ArrayList<UserCredentials> tarr = new ArrayList<UserCredentials>();
	static int tarcnt = 0;
	
	static ArrayList<UserCredentials> ararr = new ArrayList<UserCredentials>();
	static ArrayList<UserCredentials> uarr = new ArrayList<UserCredentials> ();
	
	private double zcoinrate = 0;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int ch = 0;
		
		do{
			System.out.println("ZCOIN EXCHANGE");
			System.out.println("[1]. User Login");
			System.out.println("[2]. Agent Login(ZE)");
			System.out.println("[3]. Approval or Rejected List");
			System.out.println("[9]. Exit");
			ch = s.nextInt();
			s.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				userlogin();
				break;
			}
			case 2 :
			{
				String us = "admin";
				String pa = "pass123";
				
				System.out.println("Enter UserName : ");
				String gu = s.nextLine();
				
				System.out.println("Enter Password : ");
				String gp = s.nextLine();
				
				
				if(us.equals(us))
					adminlogin();
				else
					System.out.println("Invalid Login Credentails");
				
				break;
			}
			case 3 :
			{
				
				for(int i = 0; i < ararr.size(); i++)
				{
					System.out.println("User : " + (i+1));
					System.out.println("Name : " + ararr.get(i).getFullName());
					System.out.println("Name : " + ararr.get(i).getEmailid());
				}
				
				System.out.println("To know your Status Enter Password : ");
				int opt;
				System.out.println("Enter Your User No : ");
				opt = s.nextInt();
				s.nextLine();
				opt--;
				
				
				System.out.println("Name : " + ararr.get(opt).getFullName());
				System.out.println("Name : " + ararr.get(opt).getEmailid());
				
				System.out.println("Enter Password : ");
				String p = s.nextLine();
				
				if(p.equals(ararr.get(opt).getPassword()))
				{
					System.out.println(ararr.get(opt).isApproval());
					System.out.println(ararr.get(opt).getZid());
				}
				else
				{
					System.out.println("Password Does not match");
				}
				break;
			}
			case 9 :
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
		while(ch != 9);
	}
	
	
	
	static void userlogin()
	{
		Scanner s = new Scanner(System.in);
		int ch;
		do{
			System.out.println("\nZCOIN EXCHANGE");
			System.out.println("[1]. Signin");
			System.out.println("[2]. Signup");
			System.out.println();
			ch = s.nextInt();
			s.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				System.out.println("Enter Email id : ");
				String email = s.nextLine();
				
				System.out.println("Enter Password : ");
				String pass = s.nextLine();
				
				for(int i = 0; i < uarr.size(); i++)
				{
					if((uarr.get(i).getEmailid()).equals(email))
					{
						if((uarr.get(i).getPassword()).equals(pass))
						{
							System.out.println("Login Success...");
							userdashboard(i);
							break;
						}
						else
						{
							System.out.println("Invalid Password");
						}
					}
					else
					{
						System.out.println("Invalid Email Id");
					}
				}
				
				break;
			}
			case 2 :
			{
				System.out.println("Enter Your Name : ");
				String name = s.nextLine();
				
				System.out.println("Enter Email Id : ");
				String email = s.nextLine();
				
				System.out.println("Enter Mobile Number : ");
				long mb = s.nextLong();
				s.nextLine();
				
				System.out.println("Enter H_id : ");
				String hid = s.nextLine();
				
				System.out.println("Enter Password : ");
				String p = s.nextLine();
				
				System.out.println("Enter Real Currency to Deposit : ");
				int r = s.nextInt();
				s.nextLine();
				
				tarcnt++;
				
				UserCredentials obj = new UserCredentials(name, email, mb, hid, p, r);
				tarr.add(obj);
				
				break;
			}
			case 9 :
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
			
		}while(ch != 9);
		
	}
	
	static void adminlogin()
	{
		Scanner s = new Scanner(System.in);
		int ch;
		do{
			System.out.println("ZE - User Management Panel");
			System.out.println("[1]. Approve or Reject");
			System.out.println("[2]. Users");
			System.out.println("[3]. Zcoin Rate");
			System.out.println("[9]. Exit");
			
			ch = s.nextInt();
			s.nextLine();
			
			switch(ch)
			{
			case 1:
			{
				for(int i = tarcnt-1; i >= 0; i--)
				{
					System.out.println("Name : " + tarr.get(i).getFullName());
					System.out.println("Name : " + tarr.get(i).getEmailid());
					System.out.println("Name : " + tarr.get(i).getPhonenuber());
					System.out.println("Name : " + tarr.get(i).getH_id());
					System.out.println("Name : " + tarr.get(i).getPassword());
					System.out.println("Name : " + tarr.get(i).getRc());
					
					int opt;
					do{
					System.out.println("Do You Want to Approve : ");
					System.out.println("yes[1] --- NO[0]");
					opt = s.nextInt();
					s.nextLine();
					
					if(opt == 1)
					{
						tarr.get(i).setApproval(true);
						String n = tarr.get(i).getFullName();
						String m = tarr.get(i).getH_id();
						String zid = n.substring(0, 3) + m.substring(0, 3);
						tarr.get(i).setZid(zid);
						uarr.add(tarr.get(i));
						ararr.add(tarr.get(i));
						tarr.remove(i);
						break;
					}
					else if(opt == 0)
					{
						System.out.println("User Rejected..");
						ararr.add(tarr.get(i));
						tarr.remove(i);
						break;
					}
					else
					{
						System.out.println("Invalid Option. Choose Correct Option");
					}
					
					tarcnt--;
					}while((opt != 0 || opt != 1));
				}
				
				tarcnt--;
				break;
				
			}
			case 2 :
			{
				for(int i = 0; i < uarr.size(); i++)
				{
					
					System.out.println("User : " + (i+1));
					System.out.println("ZID : " + uarr.get(i).getZid());
					System.out.println("Name : " + uarr.get(i).getFullName());
					System.out.println("Email Id : " + uarr.get(i).getEmailid());
					System.out.println("Phone Number : " + uarr.get(i).getPhonenuber());
					System.out.println("H_Id : " + uarr.get(i).getH_id());
					System.out.println("Password : " + uarr.get(i).getPassword());
					
					System.out.println();
				}
			}
			case 3 :
			{
				System.out.println("Enter the Zcoin ");
			}
			case 9 :
			{
				System.out.println("Logging Out");
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
				break;
			}
			}
		}while(ch != 9);
	}
	
	
	
	static void userdashboard(int i)
	{
		Scanner s = new Scanner(System.in);
		int ch;
		do{
			System.out.println("                Z-VERSE              ");
			System.out.println("***** WELCOME TO ZCOIN EXCHANGE *****");
			System.out.println("[1]. Account Details");
			System.out.println("[2]. Transcation History");
			System.out.println("[3]. Change Password");
			System.out.println("[4]. RC Transcation");
			System.out.println("[5]. ZCOIN Transaction");
			System.out.println("[6]. Logout");
			ch = s.nextInt();
			s.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				
				break;
			}
			case 2 :
			{
				
				break;
			}
			case 3 :
			{
				
				System.out.println("Enter Old Password : ");
				String op = s.nextLine();
				if((uarr.get(i).getPassword()).equals(op))
				{
					boolean flag = true;
					
					while(flag)
					{
						System.out.println("Enter New Password : ");
						String np1 = s.nextLine();
						
						System.out.println("Confirm New Password : ");
						String np2 = s.nextLine();
						
						if(np1.equals(np2))
						{
							uarr.get(i).setPassword(np1);
							System.out.println("Password Changed Successfully");
							flag = false;
						}
						else
						{
							System.out.println("Confirm password Not Matched...Re-enter Password");
						}
					}
				}
				break;
			}
			case 4 :
			{
				int opt;
				
				do{
					System.out.println("RC Transaction");
					System.out.println("[1]. Deposit RC");
					System.out.println("[2]. Withdraw Rc");
					
					opt = s.nextInt();
					s.nextLine();
					
					switch(opt)
					{
					case 1 :
					{
						int rc;
					
						do{
							System.out.println("Enter the Amount of Rc To be Deposit : ");
							rc = s.nextInt();
							
							if(rc < 0)
							{
								System.out.println("Enter Valid Amount...");
							}
						}
							while(rc  < 0);
						
						rc = rc + uarr.get(i).getRc();
						uarr.get(i).setRc(rc);
						
						System.out.println("RC deposited successfully");
						break;
					}
					case 2 :
					{
						int rc;
						
						do{
							System.out.println("Enter the Amount of Rc To be withdraw : ");
							rc = s.nextInt();
							
							if(rc < 0)
							{
								System.out.println("Enter Valid Amount...");
							}
						}
							while(rc < 0 || rc > uarr.get(i).getRc());
						
						rc = rc - uarr.get(i).getRc();
						uarr.get(i).setRc(rc);
						
						System.out.println("RC Withdrawn successfully");
						break;
						
					}
					case 3 :
					{
						
					}
					case 4 :
					{
						System.out.println("Returning Main...");
						break;
					}
					default :
					{
						System.out.println("Invalid Input");
						break;
					}
					}
					
				}while(opt != 4);
				
				break;
			}
			case 5 :
			{
				
				break;
			}
			case 6 :
			{
				System.out.println("Logged Out...");
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
				break;
			}
			}
		}
		while(ch != 6);
		
		
	}
		
	

}

class UserCredentials
{
	private String fullName;
	private String emailid;
	private long phonenuber;
	private String h_id;
	private String password;
	private int rc;
	private boolean approval = false;
	private String Zid;
	private int zcoin;


	public UserCredentials(String fullName, String emailid, long phonenumber, String h_id, String password, int rc)
	{
		setFullName(fullName);
		setEmailid(emailid);
		setPhonenuber(phonenumber);
		setH_id(h_id);
		setPassword(password);
		setRc(rc);
	}
	
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhonenuber() {
		return phonenuber;
	}
	public void setPhonenuber(long phonenuber) {
		this.phonenuber = phonenuber;
	}
	public String getH_id() {
		return h_id;
	}
	public void setH_id(String h_id) {
		this.h_id = h_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRc() {
		return rc;
	}
	public void setRc(int rc) {
		this.rc = rc;
	}
	public boolean isApproval() {
		return approval;
	}
	public void setApproval(boolean approval) {
		this.approval = approval;
	}
	public String getZid() {
		return Zid;
	}
	public void setZid(String zid) {
		Zid = zid;
	}
	
	ArrayList<Transcation> transarr = new ArrayList<Transcation>();
	
	
}

class Transcation
{
	private String ctype;
	private String tozid;
	int amt;
	
	public Transcation(String ctype, String tozid, int amt)
	{
		this.ctype = ctype;
		this.tozid = tozid;
		this.amt = amt;
	}
	
}