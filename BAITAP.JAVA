
import java.util.Scanner;

public class BaiTap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int S = 0;
	for(int i=1; i<=N; i++) {
		String NN=""+i+i;
		S+=Integer.parseInt(NN);
	}
	
	System.out.println("S="+S);
}
}
