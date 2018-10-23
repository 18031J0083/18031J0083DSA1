package pc2;
import java.util.*;
public class Linked 
{
	public static void main(String args[])
	{
		LList l=new LList();
		/*for(int i=1;i<=6;i++)
		{
			l.push(i);
		}
		l.disply();		
		System.out.println(l.pop());
		l.disply();
		l.push(10);
		l.disply();
		*/
		char cha;
		do
		{
		System.out.println("enter your choice: 1.push ,2.pop.3.disply,4.push at middle,5.push a number before certain number,6.pusha number after a certain number,7.pop at middle,8.push at front,9.5 digit number,10.pop at front");
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		
		//	System.out.println("enter your choice: 1.push ,2.pop.3.disply,4.push at middle5.push a number before certain number,6.push a number after a certain number,8.push at front");
		switch(ch)
		{
		case 1:		System.out.println("enter nuber to push");
					
					int n=s.nextInt();
					l.push(n);
					break;
		case 2:		//System.out.println("enter nuber to pop");
						
					//	int n1=s.nextInt();
					l.disply();
						l.popatlast();	
					l.disply();	
						break;
		case 3:		l.disply();
					break;
		case 4:    //int n3= l.size();
					System.out.println("enter nuber to push");
					int n2=s.nextInt();
					l.pushatmiddle(n2);
					l.disply();
					break;
					
			
		case 5:  	l.disply();
					System.out.println("enter a numbe to push");
					int n3=s.nextInt();
					System.out.println("enter at which number before you want to push");
					int n4=s.nextInt();					
					l.pushbefore(n3,n4);
					l.disply();
					break;
		case 6: 	l.disply();
					System.out.println("enter a numbe to push");
					int n5=s.nextInt();
					System.out.println("enter at which number after you want to push");
					int n6=s.nextInt();	
					l.pushnext(n5, n6);
					l.disply();
					break;
		case 7:   	l.disply();
					l.popatmiddle();
					l.disply();
					break;
		case 8:     l.disply();
					System.out.println("enter a number to push");
					int n7=s.nextInt();
					l.pushfront(n7);
					l.disply();
					break;
		case 9: l.disply();
				System.out.println("enter a 5 digit number");
				String se=s.next();
				for (int i=0;i<se.length();i++)
				{
						char c=se.charAt(i);
					//	System.out.println(c);
						int f=c;
						//System.out.println(f);
						l.pushfront(f-48);
						//l.disply();
				}
				l.disply();
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("enter a num to multiply");
				int k=s.nextInt();
				int n10=0;
				int x[]=new int[se.length()];
				for(int i=0;i<x.length;i++)
				{
					x[i]=l.popatfront()*k;
					
				}
				for(int i=0;i<x.length;i++)
				{
					l.pushfront(x[i]);
				}
				l.disply();
				break;
		case 10: l.disply();
				l.popatfront();
				l.disply();
				break;
		
		default : break;
		
		
		}
		
		
		System.out.println("\nDo you want to continue (Type y or n) \n");
        cha = s.next().charAt(0);
		
		
	}while (cha == 'Y'|| cha == 'y');

	}
}