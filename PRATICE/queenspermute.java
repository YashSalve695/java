package PRATICE;

import java.util.Scanner;

public class queenspermute {
	
	public static void queenpermute(int qsf,int tq,int chess[][]) {
		
		 if(qsf == tq) {
			for(int i = 0; i < chess.length; i++) {
				for(int j = 0; j < chess[0].length; j++) {
					if(chess[i][j] == 0) {
						System.out.print("-");
					} else {
						System.out.print("q" + chess[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < chess.length; i++) {
			for(int j = 0; j < chess[0].length; j++) {
				if(chess[i][j] == 0) {
					chess[i][j] = (qsf + 1);
					queenpermute(qsf + 1,tq,chess);
					chess[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int chess[][] = new int[n][n];
		queenpermute(0,n,chess);
	}

}
