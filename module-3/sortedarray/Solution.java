package module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Solution
{
public static void main(String args[]) throws NumberFormatException, IOException
{
int k=0,m=0,i;
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//System.out.println("size of array-1");
int n1=Integer.parseInt(br.readLine());
//System.out.println("size of array-2");
int n2=Integer.parseInt(br.readLine());
String s=br.readLine();
String s1=br.readLine();
String s2[]=s.split("[,.]");
String s3[]=s1.split("[,.]");
int []a=new int[n1];
int []b=new int[n2];
int []c=new int[n1+n2];


       for(i=0;i<n1;i++)
	    {
	      //System.out.println("enter the elments of an array1");
	      a[i]=Integer.parseInt(s2[i]);
	     }
       for(i=0;i<n2;i++)
	    {
              //System.out.println("enter the elments of an array2");
	      b[i]=Integer.parseInt(s3[i]);
	    }
		//System.out.println(n1+n2);
for(i=0;k<a.length&&m<b.length;i++)
	{
	 if(a[k]>=b[m])
	 {
	 	c[i]=b[m];
	 	m++;
	 	 
	 }
	 else
	 {
	 	c[i]=a[k];
	 	k++;
		
	 }
   }
   while(k<a.length)
	{
	   c[i++]=a[k++];
	}
	while(m<b.length)
	{
	   c[i++]=b[m++];
	}
   int g=i;
     for(i=0;i<g;i++)
     {
    	 if(i<g-1)
	   System.out.print(c[i]+",");
    	 else
    		 System.out.println(c[i]);
     }
}
}
