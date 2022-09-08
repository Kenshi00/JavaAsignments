package Homework;

import java.util.Arrays;

public class homework6_1{
	public static void main(String arg[]) {
		// 2차원 배열 선언
		int[][] a=new int[5][5];
		int[][] b=new int[5][5];
		// 2차원 배열 랜덤 초기화
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=(int)(Math.random()*10);
			}
		}
		// 2차원 배열 출력
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		int result[][]=addition(a,b);
		// addition 적용 후 결과값 출력
		System.out.println(Arrays.deepToString(result));
		
	}
	// 주어진 행렬 연산을 하는 static 함수
	static int[][] addition(int[][] a, int[][] b) {
		int[][] result=new int[a.length][a[0].length];
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				result[i][j]=a[i][j]+b[i][j];
			}
		}
		return result;
		
	}
}


