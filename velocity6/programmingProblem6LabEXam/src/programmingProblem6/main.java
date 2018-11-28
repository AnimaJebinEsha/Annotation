package programmingProblem6;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		double m;
		double r=3;
		Scanner scan = new Scanner(System.in);
		m=scan.nextDouble();
		scan.close();
		int result=0;
		int v=1;
		while(v<=40)
		{
			double t=(m*(double)Math.pow(v,2))/r;
			if(t<60.0 || Math.abs(t-60)<=0.0000000001) result=v;
			else break;
			
			if(v==1) v=10;
			else if(v==10) v=20;
			else if(v==20) v=40;
			else break;
		}
		System.out.println(result);
		
	}

}
