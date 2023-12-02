class Area
{
double r,a;
void getdata(double p)
{
r=p;
}
void calc()
{
a=3.14*r*r;
}
void display()
{
System.out.println("Area:"+a);
}
}
class circlearea
{
public static void main(String arg[])
{
Area a1=new Area();
a1.getdata(3);
a1.calc();
a1.display();
}
}
