package for¹®;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import  java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String token = st.nextToken();
			String token1 = st.nextToken();
			arr[i] = Integer.parseInt(token)+ Integer.parseInt(token1);
			
			bw.write("Case #" + (i+1) + ": "+token+" + " +token1 + " = " +Integer.toString(arr[i]) + "\n");
			
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
