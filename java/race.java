import java.util.Scanner;
class race
{
public static void main(String arg[])
{
double r1,r2,r3,r4,r5,avg;
Scanner o=new Scanner(System.in);
r1=o.nextDouble();
r2=o.nextDouble();
r3=o.nextDouble();
r4=o.nextDouble();
r5=o.nextDouble();
avg=(r1+r2+r3+r4+r5)/5;
if (r1>avg)
{
System.out.println("r1 racer qualify:");
}
else if(r2>avg)
{
System.out.println("r2 racer qualify:");
}
else if(r3>avg)
{
System.out.println("r3 racer qualify:");
}
else if(r4>avg)
{
System.out.println("r4 racer qualify:");
}
else if(r5>avg)
{
System.out.println("r5 racer qualify:");
}
}
}