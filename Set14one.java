package hunter;

import java.util.Scanner;

public class Set14one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j;
for(int i=1;i<=n;i++){
    for(j=1;j<=n-i;j++){
        System.out.print("*");
    }
    for(j=1;j<=n-i;j++){
        System.out.print("*");
    }
    System.out.println();
}
	}

}
