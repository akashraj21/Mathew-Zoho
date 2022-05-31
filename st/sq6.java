package st;

public class sq6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String arr[] = {"LEFT", "FORWARD", "BACKWARD", "RIGHT"};
		//String arr[] = {"LEFT","FORWARD", "BACKWARD","RIGHT", "BACKWARD", "BACKWARD"};
		//String arr[] = {"LEFT", "FORWARD", "FORWARD", "RIGHT","BACKWARD", "RIGHT", "BACKWARD", "LEFT"};
		//String arr[] = {"LEFT", "FORWARD", "FORWARD", "RIGHT","BACKWARD", "RIGHT", "BACKWARD", "BACKWARD", "LEFT", "BACKWARD","LEFT","FORWARD","FORWARD"};
		String arr[] = {"LEFT","RIGHT","FORWARD","FORWARD","FORWARD","BACKWARD","BACKWARD","LEFT","RIGHT","RIGHT","RIGHT","BACKWARD"};
		int l = 0, r = 0, f = 0, b = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals("LEFT"))
			{
				l++;
			}
			else if(arr[i].equals("RIGHT"))
			{
				r++;
			}
			else if(arr[i].equals("FORWARD"))
			{
				f++;
			}
			else if(arr[i].equals("BACKWARD"))
			{
				b++;
			}
		}
		
		if(l > r)
		{
			l = l -r;
			for(int i = 0; i < l ; i++)
			{
				System.out.println("left");
			}
		}
		else
		{
			r = r - l;
			for(int i = 0; i < r ; i++)
			{
				System.out.println("right");
			}
		}
		
		if(f > b)
		{
			f = f - b;
			for(int i = 0; i <  f; i++)
			{
				System.out.println("forward");
			}
		}
		else
		{
			b = b - f;
			for(int i = 0; i < b ; i++)
			{
				System.out.println("backward");
			}
		}

	}

}
