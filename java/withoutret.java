class withargore
{
void display(int a,int b)
{
System.out.println(a);
System.out.println(b);
}
class withoutret
{
public static void main(String arg[])
{
withargore ob=new withargore();
ob.display(17,4);
}
}
}