package m9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     int a[]=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s;
     while((s=br.readLine())!=null)
     {
    	 //System.out.println(s);
    	 String st[]=s.split(",");
    	 //a.length=st.length;
    	 a=new int[st.length];
    	 //System.out.println(Arrays.toString(st));
    	 if(st[0].equals(""))
    	 {
    		 System.exit(0);
    	 }
    	 for(int i=0;i<a.length;i++)
    	 {
    		 a[i]=Integer.parseInt(st[i]);
    	 }
    	 
    	 merge m=new merge();
         m.sort(a, 0, a.length-1);
         m.display(a); 
         System.out.println("");
     }
     
       
	}
}