class Mthread implements Runnable
{
Thread th;
String tname;
Mthread(String name)
{
tname=name;
th=new Thread(this,tname);
th.start();
}
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("i is:"+i);
th.Sleep(300);
}
}
}
class mthr
{
public static void main(String a[])
{
new Mthread("second thread");
try
{
for(int i=6;i<=10;i++)
{
System.out.println("i is:"+i);
Sleep(300);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}