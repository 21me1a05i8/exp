import java.util.Scanner;
class method
{
int a;
int b;
int c;
void read()
{
Scanner v=new Scanner(System.in);
a=v.nextInt();
b=v.nextInt();
}
void read(int x,int y)
{
a=x;
b=y;
}
void show()
{
System.out.println("a is:"+a+"b is:"+b);
}
}
class meth1
{
public static void main(String a[])
{
method ab=new method();
ab.read();
ab.read(12,23);
ab.show();
method ba=new method();
ba.read();
ba.show();
}
}