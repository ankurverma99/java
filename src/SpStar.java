import java.util.Scanner;

public class SpStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int k = 1;
		for (int i = 0; i < n; i++) {//2
			for (int s = n - 1; s > i; s--) {//4,3,2
				System.out.print("  ");
			}				//3
			for (int j = 0; j < 2 * i + 1; j++) {//0,1,2
				if (j % 2 == 1)
					System.out.print("* ");
				else {
					System.out.print(k + " ");
					k++;
				}

			}
			k=1;
			System.out.println();

		}
	}

}
