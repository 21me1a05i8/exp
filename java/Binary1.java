class Binary1
{
public static void main(String args[])
{
int a[]={1,5,12,14,15,64,86,97};
int i,j,key=2,low,high,mid,temp;
low=0;
high=6;
mid=(low+high)/2;
while(high>=low)
{
if(a[mid]==key)
{
break;
}
else if(key<a[mid])
{
high=mid-1;
}
else 
{
low = mid+1;
}
mid=(low+high)/2;
}
if(a[mid]==key)
{
System.out.println(key+" found at postion : "+(mid+1));
}
else 
{
System.out.println(key+ " not found");
}
}
}
