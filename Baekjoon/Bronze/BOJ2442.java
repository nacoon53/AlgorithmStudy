import java.util.Scanner;

public class BOJ2442 {
	/* 
	 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
	 * 별은 가운데를 기준으로 대칭이어야 한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			int j = (n-i) + (i*2-1);
			
			for(int k=1; j>=k; k++) {
				if(k<=n-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
