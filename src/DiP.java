import java.util.Scanner;

public class DiP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sp = 0, ele = n;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s < sp; s++) {
				System.out.print("  ");
			}
			for (int j = 0; j < ele; j++) {
				System.out.print("* ");
			}
			if (i < n / 2) {
				sp++;
				ele = ele - 2;
			} else {
				sp--;
				ele = ele + 2;
			}
			System.out.println();
		}
	}

}
