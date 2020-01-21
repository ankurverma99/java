import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int x = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1)
					System.out.print(i + 1 + " ");
				else
					System.out.print(i + " ");
			}

			System.out.println();
		}
	}

}
