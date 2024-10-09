package pattern;

public class K_pattern {
	public static void main(String[] args)
	{
		//first nested loop to handle upper triangle
		for(int i=5;i>=0;i--)
		{
			int alpha=65;
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+"");
			}
			System.out.println();
		}
		//second nested loop to handle lower triangle
		for(int i=0;i<=5;i++)
		{
			int alpha=65;
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+"");
			}
			System.out.println();
		}
	}

}
