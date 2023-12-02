class constructor
{
int x,y;
constructor()
{
x=12;
y=13;
System.out.println("In default constructor");
}
constructor(int a,int b)
{
x=a;
y=b;
System.out.println("In parametarized constructor");
}
constructor(constructor c)
{
x=c.x;
y=c.y;
System.out.println("In copied constructor");
}
class const
{
public static void main(String arg[])
{
constructor c1=new constructor();
constructor c2=new constructor(4,6);
constructor c3=new constructor(c1);
}
}
}

