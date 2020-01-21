import java.util.Scanner;

public class p66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sp = n / 2 + 1, ele = 1;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s <= sp; s++) {
				System.out.print("  ");
			}
			int k = 1;
			for (int j = 0; j < ele; j++) {
				System.out.print(k + " ");
				if (j < ele / 2)
					k++;
				else
					k--;
			}
			if (i < n - 1) {
				sp--;
				ele = ele + 2;
			}
			System.out.println();

		}
	}
}
