package pattern;

public class patt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int end=1;
for(int i=1;i<=9;i++)
{
	for(int j=1;j<=end;j++)
	{
		
	
	System.out.print("*");
	}
System.out.println();
	
	if(i<5)
		end++;
	else
		end--;
}
	}

}
