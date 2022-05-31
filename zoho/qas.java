package zoho;

public class qas {

	/**
	 * @param args
	 * 
	 * 
	 */
	
	static int carr[][] = new int[30][2];
	static int c = 0;
	
	public static void main(String[] args) {
		
		int mat[][] = {{1,1,0,0,0},
					   {0,1,0,0,1},
					   {1,0,0,1,1},
					   {0,0,0,0,0},
					   {1,0,1,0,1}};
		
		for(int i = 0; i < mat.length;i++)
		{
			for(int j = 0; j < mat[0].length;j++)
			{
				if(mat[i][j] == 0)
				{
					continue;
				}
				else
				{
					if( (i == 0 && j == 0) || (i == 0 && j == 4) || (i == 4 && j == 0) || (i == 4 && j == 4))
					{
						for(int k = 0; k < 3; k++)
						{
							check(i,j,mat);
						}
					}
				}
			}
		}
	}

	
	static void check(int i, int j,int mat[][])
	{
		for(int q = 0; q < c; q++)
		{
			if(carr[q][0] == i && carr[q][1] == j )
			{
				
			}
		}
		
		
	}

}
