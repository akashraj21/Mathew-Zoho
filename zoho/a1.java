package zoho;

import java.util.*;


public class a1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int arr[] = {10,36,54,89,12};
		
		Weight w[] = new Weight[5];
		int wcnt = 0;
		
		for(int i = 0; i < 5; i++)
		{
			double sqrt = Math.sqrt(arr[i]);
			
			
			if(sqrt - Math.floor(sqrt) == 0)
			{
				w[wcnt] = new Weight(arr[i], 5);
				
				wcnt++;
			}
			else if((arr[i]%4 == 0) && (arr[i]%6==0))
			{
				w[wcnt] = new Weight(arr[i], 4);
				
				wcnt++;
			}
			else if(arr[i] % 2 == 0)
			{
				w[wcnt] = new Weight(arr[i], 3);
				
				wcnt++;
			}
		}
			
			
			for(int j = 0; j < wcnt; j++)
			{
				for(int k = j; k < wcnt; k++)
				{
					if(w[j].weight > w[k].weight)
					{
						Weight temp = w[j];
						w[j] = w[k];
						w[k] = temp;
					}
				}
				
			}
			
			for(int j = wcnt-1; j >= 0; j--)
			{
				w[j].display();
			}
			
		}
		
		

	}

class Weight{
	
	int data;
	int weight;
	
	public Weight(int data, int weight)
	{
		this.data = data;
		this.weight = weight;
	}
	
	public void display(){
		
		System.out.println(data + "  " + weight);
	}
}
