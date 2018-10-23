package pc2;

class LList
{
	Node head;
	
	public LList() 
	{
		
		head=null;
	}
	public void push(int a)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			
		
		Node temp =head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=n;
		}
	}
	public void pushfront(int a)
	{
		Node n=new Node(a);
		//Node temp=head;
		if(head==null)
		{
			head=n;
		}
		else
		{
		n.next=head;
		head=n;
		}
					
	}
	public void pushatmiddle(int a)
	{	
		int count=1;
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
			
		
		Node temp=head;
		while(count!=size()/2)
		{
			temp=temp.next;
			count++;
		}
		n.next=temp.next;
		temp.next=n;
		}
		
	}
	
	public void pushbefore(int a,int b)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
		Node temp=head;
		while(temp.next.data!=b && temp.next!=null)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		}
		
		
	}
	
	public void pushnext(int a,int b)
	{
		Node n=new Node(a);
		if(head==null)
		{
			head=n;
		}
		else
		{
		Node temp=head;
		while(temp.next.data!=b && temp.next!=null)
		{
			temp=temp.next;
		}
		temp=temp.next;
		n.next=temp.next;
		temp.next=n;
		}
		
	}
	public int popatlast()
	{
		Node temp=head;
		Node sec=null;
		if(head==null)
		{
			System.out.println("no node in list");
		}
		 if(head.next==null)
		{
			int ele=head.data;
			head=null;
			return ele;
		}
		else
		{
		while(temp.next!=null)
		{
			sec = temp;
			temp = temp.next;
			
		}
		sec.next = null;
		return temp.data;
		

		}
	}
	
	public int popatfront()
	{
		Node temp=head;
		Node sec=null;
		if(head==null)
		{
			System.out.println("no node in list");
			
		}
		 if(head.next==null)
			{
				int ele=head.data;
				head=null;
				return ele;
			}
		else
		 {	
			 int ele=head.data;
			 head=head.next;
			return ele;
		 }
		
	}
	public int popatmiddle()
	{	
		int count=1;
		Node temp=head;
		Node sec=null;
		System.out.println("size is"+size()/2);
		
		while(count!=size()/2)
		{
			sec=temp;
			temp=temp.next;
			count++;
		}
		
		System.out.println("temp data"+temp.data);
		temp.next=temp.next.next;
	
		return temp.data;
		
		
	}
	
	public void disply()
	{	
		Node temp=head;
		while(temp!=null)
		{	System.out.println(temp.data+" ");
		
			temp=temp.next;
		}
	}
	public int size()
	{	int count=0;
		Node temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count=count+1;
			
		}
		//System.out.println(count);
		return count;
	}
	
	
}
