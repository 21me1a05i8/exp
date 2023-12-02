class tryblock
{
public static void main(String args[])
{
try
{
int divideByZero=5/0;
}
catch(Arithmetic Exception e)
{
system.out.println("aruthmetic Expression=>"e.getMessage());
}
finally
{
system.out.println("This is finally block");
}
}
}
