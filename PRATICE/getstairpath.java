package PRATICE;

import java.util.*;

import jdk.incubator.vector.IntVector;

public class getstairpath {
	
	public static void floodfill(int[][] maze,int row,int col,String ans,boolean visited[][]) {
		
		if(row < 0 || col < 0 || row == maze.length || col == maze[0].length || 
			maze[row][col] == 1 || visited[row][col] == true) {
			return;
		}
		if(row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}
		visited[row][col] = true; // backtracking.
		floodfill(maze,row + 1,col,ans + "down" + " ",visited); 
		floodfill(maze,row - 1,col,ans + "top" + " ",visited);
		floodfill(maze,row,col - 1,ans + "left" + " ",visited);
		floodfill(maze,row,col + 1,ans + "right" + " ",visited);
		visited[row][col] = false; // backtracking.
	}
	
	public static void printpermute(String str,String ans) {
		
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
			
			String strleft = str.substring(0,i);
			String strright = str.substring(i + 1);
			
			String ros = strleft + strright;
			
			printpermute(ros,ans + ch);
		}
	}
	
	public static void printmazepathwithjump(int sr,int sc,int dr,int dc,String ans) {
		
		if(sr == dr && sc == dc) {
			System.out.println(ans);
			return;
		}
	//	if(sr < dr || sc < dc) {
	//		return;
	//	}
		for(int h = 1; h <= dc - sc; h++) {
		 printmazepathwithjump(sr,sc + h,dr,dc,ans + "h" + h);
		}
		for(int v = 1; v <= dr - sr; v++) {
		 printmazepathwithjump(sr + v,sc,dr,dc,ans + "v" + v);
		}
		for(int d = 1; d <= dc - sc && d <= dr - sc; d++) {
		 printmazepathwithjump(sr + d,sc + d,dr,dc,ans + "d" + d);
		}
		}
	
	public static void printmazepath(int sr,int sc,int dr,int dc,String ans) {
		
		if(sr == dr && sc == dc) {
			System.out.println(ans);
			return;
		}
		if(sr > dr || sc > dc) {
			return;
		}
		printmazepath(sr,sc + 1,dr,dc,ans + "h");
		printmazepath(sr + 1,sc,dr,dc,ans + "v");
	}
	
	public static void printStarpath(int n,String path) {
		
		if(n == 0) {
			System.out.println(path);
			return;
		}
		if(n < 0) {
			return;
		}
		printStarpath(n - 1,path + "1");
		printStarpath(n - 2,path + "2");
		printStarpath(n - 3,path + "3");
	}

	public static void printNqueens(int[][] chess,String ans,int row) {
		
		if(row == ans.length()) {
			System.out.println(ans);
			return;
		}
		for(int col = 0; col < chess.length; col++) {
			if(isitSafe(chess,row,col) == true) {
				
			}
		}
	}
	public static boolean isitSafe(int[][] chess,int row,int col) {
		
		for(int i = row - 1,j = col; i >= 0; i--) {
			if(chess[i][j] == 1) {
				return false;
			}
		}
		for(int i = row - 1,j = col - 1; i >= 0 && j >= 0; i--,j--) {
			if(chess[i][j] == 1) {
				return false;
			}
		}
		for(int i =  row - 1,j = col + 1; i >= 0 && j < chess.length; i--,j++) {
			if(chess[i][j] == 1) {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int arr[][] = new int[m][n];
		  for(int i = 0; i < arr.length; i++) {
			  for(int j = 0; j <arr[0].length; j++) {
				  arr[i][j] = sc.nextInt();
			  }
		  }
		  boolean visited[][] = new boolean[m][n];
		  floodfill(arr,0,0,"",visited);
		  
	}
    
}
