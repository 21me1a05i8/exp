import java.util.Scanner;
class quadratic
{
static double a,b,c,dis;
static double r1,r2;
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
a=s.nextDouble();
b=s.nextDouble();
c=s.nextDouble();
dis=(b*b)-4*a*c;
if (dis>0)
{
r1=(-b+Math.sqrt(dis)/2*a);
r2=(-b-Math.sqrt(dis)/2*a);
System.out.println("REAL AND UNEQUAL"+r1+""+r2);
}
else if(dis==0)
{
r1=(-b+Math.sqrt(dis)/2*a);
System.out.println("REAL AND EQUAL"+r1);
}
else
{
System.out.println("imaginary");
}
}
}





