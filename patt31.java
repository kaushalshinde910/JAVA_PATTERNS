package pattern;

public class patt31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		int cnt=1;
		for(int i=1;i<=9;i++)
		{
			int cnt1=cnt;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt1);
				cnt1--;
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
