public class sort{
	public static void main(String args[]){
		
		String arr[][] = {{"jake", "paul"}, {"prince", "Luther"}, {"paul","ronaldo"},{"wiz","paul"}};
		
		String grandfather = "ronaldo";
		
		String son = "";
		
		for(int i = 0; i < 4; i++)
		{
			if((arr[i][1]).equals(grandfather))
			{
				son = arr[i][0];
				break;
			}
				
		}
		
		int grandchild = 0;
		
		for(int j = 0; j < 4; j++)
		{
			if((arr[j][1]).equals(son))
			{
				grandchild++;
		
			}
		}
		
		System.out.println(grandchild);
	
}