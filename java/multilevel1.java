class A
{
A()
{
System.out.println("In A constructor");
}
}
class B extends A
{
B()
{
System.out.println("In B constructor");
}
}
class C extends B
{
C()
{
System.out.println("In C constructor");
}
}
class multilevel1
{
public static void main(String a[])
{
C c=new C();
}
}