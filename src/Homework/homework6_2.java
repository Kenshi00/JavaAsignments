package Homework;

import java.util.Arrays;

public class homework6_2 {
	public static void main(String arg[]) {
		// 변수 및 배열 선언
		int m=2;
		int n=3;
		int p=2;
		int[][] a=new int[m][n];
		int[][] b=new int[n][p];
		// 배열 초기화
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[i][j]=(int)(Math.random()*10);
			}
		}
		int[][] result=multiple(a,b);
		// 배열 a,b,c 출력
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		System.out.println(Arrays.deepToString(result));
	}
	// 배열의 곱 함수
	static int[][] multiple(int[][] a,int[][] b) {
		int[][] result=new int[a.length][b[0].length];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				for(int k=0;k<a[0].length;k++) {
					result[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return result;
	}
}
