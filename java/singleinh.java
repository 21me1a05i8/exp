import java.util.Scanner;
class single
{
int x;
int y;
int z;
}
class sub extends single
{
int m;
void read2()
{
Scanner t=new Scanner(System.in);
x=t.nextInt();
y=t.nextInt();
m=t.nextInt();
}
void mul2()
{
z=x*y*m;
}
void show2()
{
System.out.println("Multiplication is:"+z);
}
}
class singleinh
{
public static void main(String a[])
{
sub n=new sub();
n.read2();
n.mul2();
n.show2();
}
} 