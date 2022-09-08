package java_final;

import java.util.Arrays;

public class final_4 {
	public static void main(String args[]) {
		int[][] a= {
				{4,4},
				{4,4},
				{4,4}
		};
		int[][] b= {
				{1,1},
				{1,1},
				{1,1}
		};
		add(a,b);
	}
	// method 목적이 add니까 add만 시킬것같긴함. 출력은 main에서 하고
	public static void add(int a[][], int b[][]) {
		int[][] result=new int[a.length][a[0].length];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				result[i][j]=a[i][j]-b[i][j]-(i+1);
			}
		}
		// 출력형태 1
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(result[i][j]+" ");;
			}
			System.out.println();
		}
		// 출력형태 2
		System.out.println(Arrays.deepToString(result));
	}
}
