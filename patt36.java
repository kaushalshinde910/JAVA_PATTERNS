package pattern;

public class patt36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=3;
		for(int i=2;i<=6;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==j)
					System.out.print(" ");
				else
				System.out.print("*");
				
			}
			System.out.println();
			end=end+2;
		}

	}

}
