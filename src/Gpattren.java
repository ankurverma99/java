import java.util.Scanner;

public class Gpattren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j <= n / 2 || j == 0 || i == n - 1 && j <= n / 2 || j == n / 2 && i >= n / 2
						|| i == n / 2 && j >= n / 2 || j == n - 1 && i >= n / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
