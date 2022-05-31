import java.util.*;

public class a1{
    public static void main(String[] args){
        
		Scanner s1 = new Scanner(System.in);
		
		String name = "Mathew";
        
		System.out.println("Enter the Index : (from name len)" + name.length());
		int a = s1.nextInt();
		
		
		System.out.println(name.charAt(a));
		
        }
    }
}