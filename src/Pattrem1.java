import java.util.Scanner;

public class Pattrem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sp = n / 2, ele = 1;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < sp; s++) {
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
			if (i < n / 2) {
				sp--;
				ele += 2;
			} else {
				sp++;
				ele -= 2;
			}
			System.out.println();
		}
	}

}
