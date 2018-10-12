package com.bank;

import java.util.LinkedList;
import java.util.Queue;

public class Josephus {

	 public static void main(String[] args) {
	        int m = 2;
	        int n = 7;

	        // initialize the queue
	        Queue queue =  new LinkedList(); 
	        for (int i = 0; i < n; i++)
	        {
	            queue.add(i);
	        }

	        while (!queue.isEmpty()) 
	        {
	            for (int i = 0; i < m-1; i++) 
	            {
	                queue.add(queue.remove());
	            }
	            System.out.print(queue.remove() + " ");
	        } 
	        System.out.println();
	    }

}
