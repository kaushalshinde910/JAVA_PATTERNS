package pattern;

public class RevPyr1 {
	int irange=5;
	int jrange=9;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int i=0;i<=5;i++)
         {
        	 for(int s=1;s<i;s++)
        	 {
        		 System.out.print(" ");
        	 }
        		 for(int j=1;j<=(9-(i-1)*2);j++)
        		 {
        			System.out.print("*");
        			
        		 }
        		
        	 
        	 System.out.println();
         }
	}
}

