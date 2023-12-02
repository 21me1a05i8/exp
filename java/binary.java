import java.util.Scanner;
class binary
{
public static void main(String arg[])
{
int n,low,mid,high,search,i;
int arr[]=new int[100];
Scanner b=new Scanner(System.in);
n=b.nextInt();
search=b.nextInt();
System.out.println("search element:"+search);
System.out.println("enter range:"+n);
low=0;
high=n-1;
System.out.println("enter elements");
for(i=0;i<n;i++)
arr[i]=b.nextInt();
while(low<high)
{
mid=(low+high)/2;
if(search>arr[mid])
{
low=mid+1;
}
else if(search<arr[mid])
{
high=mid-1;
}
else
{
System.out.println("element is at index"+mid);
break;
}
}
if(low>high)
{
System.out.println("element not found");
}
}
}


