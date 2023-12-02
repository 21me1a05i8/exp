class A
{
int x,y;

A(int a,int b)
{
x=a;
y=b;
}
void show()
{
System.out.println("x:"+x+"y:"+y);
}
}
class b extends A
{
int z;
b(int p,int q,int r)
{
super(p,q);
z=r;
}
void show()
{
super.show();
System.out.println("z:"+z);
}
}
class demo1
{
public static void main(String args[])
{
b e=new b(12,24,32);
e.show();
}
}
