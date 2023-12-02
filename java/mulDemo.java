class multiA
{
multiA()
{
System.out.println("MultiA constructor");
}
}
class multiB extends multiA
{
multiB()
{
System.out.println("MultiB constructor");
}
}
class multiC extends multiB
{
multiC()
{
System.out.println("MutliC constructor");
}
}
class mulDemo
{
public static void main(String a[])
{
multiC c=new multiC();
}
}




