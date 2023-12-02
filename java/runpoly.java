class parents
{
public void showcase()
{
System.out.println("I am Parent");
}
}
class children extends parents
{
public void showcase()
{
System.out.println("I am children");
}
}
class runpoly
{
public static void main(String a[])
{
parents p1=new parents();
p1.showcase();
parents p2=new children();
p2.showcase();
children c=new children();
c.showcase();\
}
}