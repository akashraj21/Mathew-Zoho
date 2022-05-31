import java.util.*;


public class Guess {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*50 + 1);
		
		Scanner s = new Scanner(System.in);
		
		int cnt = 5, c = 0;
		while(cnt != 0)
		{
			System.out.println("Guess The Number Between 1 - 50. Chance = " + cnt);
			c = s.nextInt();
			
			if(c > a){
				System.out.println("Number is Too High \n");
				cnt--;
			}
			else if(c < a){
				System.out.println("Number is Too Low \n");
				cnt--;
			}
			else if (c == a){
				System.out.println("Your Guess is Right");
				break;
			}
			
			if (cnt == 0)
			{
				System.out.println("You are out of Chances.. Try next Time");
				System.out.println("The Number is : " + a);
				break;
			}
		}
		

	}

}
