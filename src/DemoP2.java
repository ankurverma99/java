import java.util.Scanner;

public class DemoP2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		char ch = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			ch = 'A';
			System.out.println();
		}
	}

}
