import java.util.Scanner;

public class revSp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int s = 0; s <= i; s++) {
				System.out.print("  ");
			}

			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}
