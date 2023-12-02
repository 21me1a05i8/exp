class Mythread extends Thread
{
Thread th;
String tname;
Mythread(String name)
{
System.out.println("IN CONSTRUCTOR");
tname=name;
Thread th=new Thread(this,name);
System.out.println("about to start"+currentThread());
th.start();
}
public void run()
{
if(tname=="Thread 1")
System.out.println("in run1");
else if(tname=="Thread 2")
System.out.println("in run2");
}
}
class thr
{
public static void main(String a[])
{
new Mythread("Thread 1");
new Mythread("Thread 2");
}
}

