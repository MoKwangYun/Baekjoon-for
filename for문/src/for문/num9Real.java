package for��;
import java.util.Scanner;

public class num9Real {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int j = 0; j < n;j++) {
			if(arr[j] < x)
				System.out.print(arr[j] + " ");
		}
	}
}
