package st;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	static ArrayList<Question> qarr = new ArrayList<Question>();

	static ArrayList<Score> sarr = new ArrayList<Score>();
	
	
	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		int ch = 0;
		
		String a = "Capital of India?";
		String o1[] = {"New Delhi", "Tamil Nadu", "Karnataka", "Assam"};
		int ans = 1;
		Question q1 = new Question(a,o1,ans);
		
		
		a = "Who Founded Zoho?";
		String o2[] = {"Bill Gates", "Steve Jobs", "Sridhar Vembu", "Elon Musk"};
		ans = 3;
		
		Question q2 = new Question(a,o2,ans);
		
		a = "'OS' computer abbreviation usually means ?";
		String o3[] = {"Order of Significance", "Open Software", "Operating System", "Optical Sensor"};
		ans = 3;
		
		Question q3 = new Question(a,o3,ans);
		
		qarr.add(q1);
		qarr.add(q2);
		qarr.add(q3);
		
		do{
			System.out.println("***** QUIZ *****");
			System.out.println("[1]. Start Test");
			System.out.println("[2]. Scores");
			System.out.println("[3]. Admin");
			System.out.println("[9]. Exit");
			ch = s1.nextInt();
			s1.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				start();
				break;
			}
			case 2 :
			{
				System.out.println("Name \t Scores");
				for(int i = 0; i < sarr.size(); i++)
				{
					sarr.get(i).display();
				}
				break;
			}
			case 3 :
			{
				admin();
				break;
			}
			case 9 :
			{
				System.out.println("Thank You...");
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
	
	public static void admin()
	{
		Scanner s1 = new Scanner(System.in);
		int ch = 0;
		
		do
		{
			System.out.println("***** ADMIN *****");
			System.out.println("[1]. Add Questions");
			System.out.println("[2]. Display Questions");
			System.out.println("[3]. Delete Questions");
			System.out.println("[9]. Exit");
			ch = s1.nextInt();
			s1.nextLine();
			
			switch(ch)
			{
			case 1 :
			{
				String q;
				String opt[] = new String[4];
				int ans;
				
				System.out.println("Enter Question : ");
				q = s1.nextLine();
				
				for(int i = 0; i < 4; i++)
				{
					System.out.println("Enter option " + (i+1));
					opt[i] = s1.nextLine();
				}
				
				System.out.println("Enter Answer option :");
				ans = s1.nextInt();
				s1.nextLine();
				
				Question qo = new Question(q,opt,ans);
				
				qarr.add(qo);
				 
				break;
			}
			case 2 :
			{
				
				for(int i = 0; i < qarr.size(); i++)
				{
					System.out.println("Question : " + (i+1) + "\n");
					qarr.get(i).display_que();
				}
				break;
			}
			case 3 :
			{
				for(int i = 0; i < qarr.size(); i++)
				{
					System.out.println("Question : " + (i+1) + "\n");
					qarr.get(i).display_que();
				}
				
				System.out.println("Enter the Number Question Number to be Deleted : ");
				int d = s1.nextInt();
				s1.nextLine();
				
				qarr.remove(d-1);
				
				break;
			}
			case 9 :
			{
				System.out.println("Thank You...");
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
	
	public static void start()
	{
		int crct = 0;
		
		Scanner s1 = new Scanner(System.in);
		
		int n = qarr.size();
		if(n == 0)
		{
			System.out.println("Questions not Available");
			return;
		}
		String name;
		
		
		System.out.println("Enter Your Name : ");
		name = s1.nextLine();
		
		
		int i = 0;
		
		ArrayList<Integer> qa = new ArrayList<Integer>();
		
		while(i != n)
		{
			int m = (int) (Math.random() * n + 0);
			
			if(qa.contains(m))
			{
				continue;
			}
			
			qa.add(m);
			
			crct = crct + qarr.get(m).display();
			i++;
		}
		
		Score s = new Score(name, crct, qa.size());
		sarr.add(s);
		
	}	

}

class Question{
	
	String q;
	String opt[] = new String[4];
	int ans;
	
	public Question(String q, String opt[], int ans)
	{
		this.q = q;
		for(int i = 0; i < 4; i ++)
		{
			this.opt[i] = opt[i];
		}
		this.ans = ans;
	}
	
	public int display()
	{
		Scanner s1 = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag){		
			System.out.println(q);
			System.out.println("Option : ");
			for(int i = 0; i < 4; i++)
			{
				System.out.println("[" + (i+1)+ "]. " + opt[i]);
			}
			
			int op = s1.nextInt();
			s1.nextLine();
		
			if(op > 4 && op > 0)
			{
				System.out.println("Invalid Input... Choose Correct Option");
				continue;
			}
			else 
			{
				if(op == ans)
				{
					flag = false;
					System.out.println("Correct Answer.\n");
					return 1;
				}
				else
				{
					flag = false;
					System.out.println("Wrong Answer.");
					System.out.println("Correct Answer is : " + opt[ans-1] + "\n");
					return 0;
				}
				
			}
		
		}
		return 0;
	}
	
	public void display_que()
	{
		
		System.out.println(q);
		
		System.out.println("Option : ");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(opt[i]);
		}
		
		System.out.println("\nAnswer : ");
		System.out.println(opt[ans-1]+ "\n\n");
	}
	
}


class Score{
	
	String name;
	int scores;
	int outof;
	
	public Score(String name,int scores, int outof)
	{
		this.name = name;
		this.scores = scores;
		this.outof = outof;
	}
	
	public void display()
	{
		System.out.println(name + "\t" + scores + "/" + outof);
	}
	

}
