package pattern;

public class patt28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=4;
		int cnt=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				int cnt1=cnt;
				if(j<=space)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(cnt1);
					cnt1--;
				}
			}
			System.out.println();
			if(i<5)
			{
				space--;
				cnt++;
			}
			else
			{
				space++;
				cnt--;
			}
		}
	}

}
