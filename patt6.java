package pattern;

public class patt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int space=4;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<space;j++)
	{
		System.out.print(" ");
		System.out.print("*");
	}
	System.out.println();
	if(i<space)
		space++;
	else
		space--;
	}
}
	}


