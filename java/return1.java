class returnval{
int a=17;
int b=4;
int display()
{
return a*b;
}
}
class return1
{
public static void main(String a[])
{
returnval r=new returnval();
int t=r.display();
System.out.println(t);
}
}
