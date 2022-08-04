package PRATICE;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class removedupl {

	public static class Node {
	    int data;
	    Node next;
	  }

	  public static class LinkedList {
	    Node head;
	    Node tail;
	    int size;
	    
	    public void removeFirst() {
	    	
		      if (size == 0) {
		        System.out.println("List is empty");
		      } else if (size == 1) {
		        head = tail = null;
		        size = 0;
		      } else {
		        head = head.next;
		        size--;
		      }
		    }

	    public int getFirst() {
		      if (size == 0) {
		        System.out.println("List is empty");
		        return -1;
		      } else {
		        return head.data;
		      }
		    }
	 
	    public void display() {
		      for (Node temp = head; temp != null; temp = temp.next) {
		        System.out.print(temp.data + " ");
		      }
		      System.out.println();
		    }
	    
	    public int size() {
		      return size;
		    }


	    void addLast(int val) {
	    	
	      Node temp = new Node();
	      temp.data = val;
	      temp.next = null;

	      if (size == 0) {
	        head = tail = temp;
	      } else {
	        tail.next = temp;
	        tail = temp;
	      }

	      size++;
	    }
	    
	    public void removeDuplicates() {
	        
	    	LinkedList result = new LinkedList();
	    	
	    	while(this.size > 0) {
	    		
	    		int val = this.getFirst();
	    		this.removeFirst();
	    		
	    		if(result.size() == 0 || result.tail.data != val) {
	    			
	    			result.addLast(val);
	    		}
	    	}
	    	this.head = result.head;
	    	this.tail = result.tail;
	    	this.size = result.size;
	    }
	  }
	

	  
	  



	public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int n1 = Integer.parseInt(br.readLine());
		    LinkedList l1 = new LinkedList();
		    String[] values1 = br.readLine().split(" ");
		    for (int i = 0; i < n1; i++) {
		      int d = Integer.parseInt(values1[i]);
		      l1.addLast(d);
		    }

		    l1.display();
		    l1.removeDuplicates();
		    l1.display();
		  }
		}
