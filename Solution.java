import java.io.PrintWriter;
import java.util.Scanner;

/*

a[a[j]-1]

4 3 5 1 2
1 2 3 4 5

 */

public class Solution {
	
	public static void main(String[] args) {	
		Scanner fs = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int T = 1;
		//T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i + 1 == a[a[j]-1]) {
						out.println(j + 1);
					}
				}
			}
		}
		fs.close();
		out.close();
	}
}
