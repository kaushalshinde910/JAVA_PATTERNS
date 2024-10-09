package pattern;

public class patt32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		int cnt=1;
		for(int i=1;i<=6;i++)
		{
			int cnt1=cnt;
			for(int j=1;j<=end;j++)
			{
				System.out.print((char)( cnt1 + 64 ));
				cnt1=cnt1+5;
			}
			System.out.println();
			cnt++;
			end++;
		}
			}
	}

