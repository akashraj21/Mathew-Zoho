package files;

import java.util.Scanner;
import java.io.*;

public class Result {

	
	
	
	public static void main(String[] args) throws IOException {
		
		
		Scanner s = new Scanner(System.in);
		int ch;
		do{
			System.out.println("Result Management System");
			System.out.println("[1]. Add Student and Marks");
			System.out.println("[2]. Display Students and Marks");
			System.out.println("[3]. Update Student Details");
			System.out.println("[4]. Delete Student Details");
			System.out.println("[9]. Exit");
			ch = s.nextInt();
			s.nextLine();
			switch(ch)
			{
			case 1 :
			{
				add();
				break;
			}
			case 2 :
			{
				read();
				break;
			}
			case 3 :
			{
				update();
				break;
				
			}
			case 4 :
			{
				delete();
				break;
			}
			case 9 :
			{
				System.out.println("Thank You");
				break;
			}
			default :
				System.out.println("");
			}
			
		}
		while(ch != 9);
		
		
		

	}
	
	public static void add() throws IOException
	{
		Scanner s = new Scanner(System.in);
		
		File f = new File("C:\\Users\\Administrator\\Desktop\\student\\sample.txt");
		
		//FileWriter fw = new FileWriter(f);

        PrintWriter pw = new PrintWriter(f);
		
		int n;
		System.out.println("Enter the Number of Students : ");
		n = s.nextInt();
		s.nextLine();

		for(int i = 0; i < n; i++)
		{
		    String Name, R_No, c, cpp, java;
		    
		    System.out.print("\nEnter the Student NAme : ");
		    Name = s.nextLine();
		    
		    System.out.print("\nENter the Roll Number : ");
		    R_No = s.nextLine();
		    
		    System.out.print("\nEnter the C : ");
		    c = s.nextLine();
		    
		    System.out.print("\nEnter the Cpp : ");
		    cpp  = s.nextLine();
		    
		    System.out.print("\nEnter the Java : ");
		    java= s.nextLine();
		    
		    pw.println(Name+" "+R_No+" "+c+" "+cpp+" "+java);
		    
		}
		
		 pw.close();
		
		System.out.println("Added SuccessFully");

		
	}
	
	public static void read() throws IOException
	{
		FileReader filereader = new FileReader("C:\\Users\\Administrator\\Desktop\\student\\sample.txt");
        int i;
        while ((i = filereader.read()) != -1)
            System.out.print((char)i);
	}
	
	public static void update()
	{
		
	}
	
	public static void delete()
	{
		
	}

}
