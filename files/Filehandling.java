package files;

import java.io.*;
import java.util.Scanner;

public class Filehandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream f = new  FileOutputStream("C:\\Users\\Administrator\\Desktop\\student\\sample.txt");
			
			String s = "Mathew 101 98 97 99";
			byte b[] = s.getBytes();
			
			try {
				f.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner s = new Scanner(System.in);
		BufferedWriter Wr = new BufferedWriter(new FileWriter("D:Sample.txt", true));
		int n;
		System.out.println("Enter the Number of Students : ");
		n = s.nextInt();
		s.nextLine();

		for(int i = 0; i < n; i++)
		{
		    String Name;
		    String R_No;
		    String c;
		    String cpp;
		    String java;
		    System.out.print("\nEnter the Student NAme : ");
		    Name = s.nextLine();
		    System.out.print("\nENter the Roll Number : ");
		    R_No = s.nextLine();
		    System.out.print("\nEnter the C : ");
		    c = s.nextLine();
		    System.out.print("\nEnter the Cpp : ");
		    cpp  = s.nextLine();
		    System.out.print("\nEnter the  : ");
		    java= s.nextLine();
		    String data =Name+" "+R_No+" "+c+" "+cpp+" "+java+"\n";
		    Wr.append(data);
		}
		Wr.close();
		System.out.println("Added SuccessFully");
		
		String b = "";
		b.ind
	}

}

String arr[] = a.split("-");




