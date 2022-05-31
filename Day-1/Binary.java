import java.util.*;

public class Binary{
	public static void main(String args[]){
			
		long num1 , num2;
		
		int i = 0, rem = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Binary Number 1 : ");
		num1 = s.nextLong();
		
		System.out.println("Enter Binary Number 2 : ");
		num2 = s.nextLong();
		
		int arr[] = new int[20];
		
		while(num1 != 0 && num2 != 0){
			
			arr[i] = (int)( ( (num1 % 10) + (num2 % 10) + rem ) % 2);
			rem = (int)( ( (num1 % 10) + (num2 % 10) + rem ) / 2);
			num1 = num1 / 10;
			num2 = num2 / 10;
			i++;
		}
		
		if (rem != 0) {
			
			arr[i] = rem;
		}
		
		System.out.print("Output: ");
		
		
		while (i >= 0) {
			System.out.print(arr[i--]);
		}  
	}
}