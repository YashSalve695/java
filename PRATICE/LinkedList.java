package PRATICE;

import java.io.*;

public class LinkedList {
	
	  public static class Node {
		    int data;
		    Node next;
		  
	  }
	  
		  public static class Linkedlist {
		    Node head;
		    Node tail;
		    int size;
		  
		 public int size() {
		    	return size;
		}
		
		 public int getfirst() {
			if(size == 0) {
				System.out.println("ip");
				return -1;
			}else {
				return head.data;
			}
		}
		
	     public void removefirst() {
			if(size == 0) {
				System.out.println("INVALID ARGUMENTS");
			}else if(size == 1) {
				head = tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;
			}
		}
	
	     void addlast(int val) {
	    	 
	    	 Node last = new Node();
	    	 last.data = val;
	    	 last.next = null;
	    	 
	    	 if(size == 0) {
	    		 head = tail = null;
	    	 }else {
	    		 tail.next = last;
	    		 tail = last;
	    	 }
	     }
	     
	     public void display() {
		      for (Node temp = head; temp != null; temp = temp.next) {
		        System.out.print(temp.data + " ");
		      }
		      System.out.println();
		    }  
	     
	     public void removedup() {
			
			Linkedlist res = new Linkedlist();
			
			if(size() == 0) {
				int val = this.getfirst();
				this.removefirst();
				
				if(size == 0 || res.tail.data != val) {
					res.addlast(val);
				}
			}
			res.head = this.head;
			res.tail = this.tail;
			res.size = this.size;
			
		}
		     
	     public void oddeven() {
	    	 
	    	 Linkedlist odd = new Linkedlist();
	    	 Linkedlist even = new Linkedlist();
	    	 
	    	 while(this.size > 0) {
	    		 int val = this.getfirst();
	    		 this.removefirst();
	    		 
	    		 if(val % 2 == 0) {
	    			 odd.addlast(val);
	    		 } else {
	    			 even.addlast(val);
	    		 }
	    	 }
	    		 if(odd.size > 0 && even.size > 0) {
	    			 
	    			 odd.tail.next = even.head;
	    			 this.head = odd.head;
	    			 this.tail = even.tail;
	    			 this.size = odd.size + even.size;
	    			 
	    		 } else if(odd.size > 0) {
	    			 this.head = odd.head;
	    			 this.tail = odd.tail;
	    			 this.size = odd.size;
	    			 
	    		 }else if(even.size > 0) {
	    			 this.head = even.head;
	    			 this.tail = even.tail;
	    			 this.size = even.size;
	    		 }
	    	 }
	     
	     
	     }
		  

		         public static void main(String[] args) throws NumberFormatException, IOException {
        	   
        	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       	    int n1 = Integer.parseInt(br.readLine());
       	    Linkedlist l1 = new Linkedlist();
       	    String[] values1 = br.readLine().split(" ");
       	    for (int i = 0; i < n1; i++) {
       	      int d = Integer.parseInt(values1[i]);
       	      l1.addlast(d);
       	    }

       	 //   l1.display();
       	    l1.removedup();
       	    l1.display();
       	    l1.oddeven();
       	    l1.display();
       	  }
       	

		  }
         
