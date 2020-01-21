import java.util.Scanner;

public class P86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < n - i; s++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (i == n - 1 || j == 0 || j == 2 * i)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
	}

}
