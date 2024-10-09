package pattern;
public class patt38
{
//StartOfMainMethod
public static void main(String[] args)
{
int irange=6;
int jrange=6;
myCode(irange,jrange);
}
//EndOfMainMethod
public static void myCode(int irange,int jrange)
{
//Write code here
int n=6;
for(int i=n;i>=1;i--)
{
for(int j=0;j<i;j++)
{
System.out.print((char)('F'-j));
}
System.out.println();
}
}
}
