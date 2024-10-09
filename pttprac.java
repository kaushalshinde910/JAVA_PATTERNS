package pattern;

public class pttprac {
	public static void main(String[] args)
	{
		//5
		//54
		//543
		//5432
		//54321

		int start=1;

		for(int i=1;i<=5;i++)
		{
			int cnt=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(cnt);
				cnt--;
				
			}
			System.out.println();
			
		}
	}
}