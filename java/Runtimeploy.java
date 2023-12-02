class parents
{
public void showcase()
{
system.out.println("I am Parent");
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
Public static void main(String a[])
{
parents p1=new parents();
p1.showcase();
parents p2=new children();
p2.Showcase();
children c=new children();
c.showcase();
}
}