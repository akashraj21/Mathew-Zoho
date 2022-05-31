package basic; 

import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		
		int a = 12;
		
		
		
		int i = 0;
		
		ArrayList<Integer> qa = new ArrayList<Integer>();
		int qc = 0;
		
		while(i != 10)
		{
			int m = (int) (Math.random() * a + 1);
			
			if(qa.contains(m))
			{
				continue;
			}
			
			
			qa.add(m);
			
			System.out.println(m);
			
			i++;
			
		}
		
		System.out.println("\n\n" + qc + "\n\n");
		for(int k = 0; k < 10; k++)
		{
			System.out.println(qa.get(k));
		}
	
	}
	
	
	

}