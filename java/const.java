class con
{
int x,y;
con()
{
x=12;
y=13;
System.out.println("In default constructor");
}
con(int a,int b)
{
x=a;
y=b;
System.out.println("In parametarized constructor");
}
con(con c)
{
x=c.x;
y=c.y;
System.out.println("In copied constructor");
}
class demo12
{
public static void main(String arg[])
{
conc1=new con();
con c2=new con(4,6);
con c3=new con(c1);
}
}
}

