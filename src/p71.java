import java.util.Scanner;

public class p71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int k = 1;
		for (int i = 0; i < n; i++) {
			k = k + i;
			for (int s = n - 1; s > i; s--) {
				System.out.print("  ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print(k + " ");
				k--;

			}
			k = 1;
			System.out.println();

		}
	}

}
