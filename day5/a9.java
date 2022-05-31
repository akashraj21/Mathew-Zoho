package day5;

public class a9 {

	
	public static void main(String[] args) {
		
		
		int[] A={1, 5, 6, 7, 8, 10};
        int[] B={2, 4, 9};
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]>B[j]){
                    temp=A[i];
                    A[i]=B[j];
                    B[j]=temp;
                }
            }
           
        }
        
        for(int i = 0; i < B.length; i++)
        {
        	for(int j = i+1; j < B.length; j++)
        	{
        		if(B[i] > B[j])
        		{
        			int t = B[i];
        			B[i] = B[j];
        			B[j] = t;
        		}
        	}
        }
        
        for(int x : A)
        {
        	System.out.println(x);
        }
        for(int x : B)
        {
        	System.out.println(x);
        }
		
		
	}

}
