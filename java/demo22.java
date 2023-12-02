import java.util.*;
class constr
{
int x;
int y;
constr()
{
x=12;
y=13;
}
constr(int a,int b)
{
x=a;
y=b;
}
constr(constr c)
{
x=c.x;
y=c.y;

}
class demo22
{
public static void main(String arg[])
{
constr c1=new constr();
constr c2=new constr(4,6);
constr c3=new constr(c1);
}
}
}
