package for��;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import  java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class num5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			bw.write(Integer.toString(i));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
