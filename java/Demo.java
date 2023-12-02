class A
{
int x,y;
A(int a ,int b)
{
x=a;
y=b;
}
void show()
{
System.out.println("x:"+x+"y:"+y);
}
}
class B extends A
{
int z;
B(int a,int b,int r)
{
super(a,b);
z=r;
}
void show()
{
super.show();
System.out.println("z:"+z);
}
}
class Demo
{
public static void main(String a[])
{
B b=new B(17,4,24);
b.show();
}
}

