package for��;

import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int arr[] = new int[a];
		for(int i = 0; i < a; i++) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			arr[i] = b + c;
			
			if(i == a-1) {
				for(int j = 0; j < a;j++) {
					System.out.println(arr[j]);
				}
			}
		}
		
		
	}
}
