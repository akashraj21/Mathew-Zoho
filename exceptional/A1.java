package exceptional;

import java.util.*;

public class A1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);

        System.out.println ("Enter a 3 digit number: ");
        String line = s.nextLine ();
        
        int digit;
        
        while (true) {
            if (line.length () == 3) {
                try {
                    digit = Integer.parseInt (line);
                    break;
                }
                catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }

            System.out.println ("Error!(" + line + ") Please enter a 3 digit number: ");
            
        }

        System.out.println (digit);
		

	}

}
