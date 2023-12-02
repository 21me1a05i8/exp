class add
{
int s;
void sum(int a,int b)
{
s=a+b;
}
void sum(int a,int b,int c,int d)
{
s=a+b+c+d;
}
void show()
{
System.out.println("Sum is"+s);
}
class add1
{
public static void main(String arg[])
{
add s1=new add();
add s2=new add();
s1.sum(10,20);
s2.sum(1,2,3,4);
s1.show();
s2.show();
}
}
}

