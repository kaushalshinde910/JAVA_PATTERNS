package pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a
//ab
//abc
//abcd
//abcde
//abcd
//abc
//ab
//a
		int end=1;
		int cnt=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print((char)(cnt+64));
			}
			System.out.println();
			if(i<5)
			{
				end++;
				cnt++;
			}
			else
			{
				end--;
				cnt--;
			}
			
		}
	}

}
