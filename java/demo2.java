class A
{
int mark1,mark2;
A(int a,int b)
{
mark1=a;
mark2=b;
}
void show()
{
System.out.println("m1 is:"+mark1);
System.out.println("m2 is:"+mark2);
}
}
class B extends A
{
int mark3;
B(int a,int b,int c)
{
super(a,b);
mark3=c;
}
void show()
{
super.show();
System.out.println("m3 is:"+mark3);
}
}
class demo2
{
public static void main(String a[])
{
B b=new B(20,11,23);
b.show();
}
}