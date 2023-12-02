import java.util.*;
class Bubble
{
public static void main(String args[])
{
int a[]=new int[5];
int i,j,n,temp;
Scanner s = new Scanner(System.in);
System.out.println("enter no of elements in an array");
n=s.nextInt();
System.out.println("enter elements in an array");
for(i=0;i<n;i++)
{
System.out.println("enter element no "+(i+1)+":");
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=1;j<n;j++)
{
if(a[j]<a[j-1])
{
temp=a[j];
a[j]=a[j-1];
a[j-1]=temp;
System.out.println("The sorted array is:");
}
}
}
