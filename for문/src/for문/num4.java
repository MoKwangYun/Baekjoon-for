package for��;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class num4 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int a = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		int arr[] = new int[a];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			arr[i] = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			
			if(i == a-1) {
				for(int j = 0; j < a;j++) {
					bw.write(Integer.toString(arr[j]));
					bw.write("\n");
				}
			}
		}
		
		
		bw.flush();
		bw.close();
	}
}
