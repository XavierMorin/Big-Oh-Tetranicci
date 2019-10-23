
import java.io.*;
public class Tetranacci {
	public static int exponentialTera(int k) {
		if(k==0)
			return 0;
		if(k==1)
			return 0;
		if(k==2)
			return 0;
		if(k==3)
			return 1;
		return exponentialTera(k-4)+exponentialTera(k-3)+exponentialTera(k-2)+exponentialTera(k-1);
				
	}
	
	public static long[] TRTetranacci(int k,long[]j) {
		if(k==0) {
			long[]i = {0};
			return i;
		}
		if(k==1) {
			long[]i = {0,0};
			return i;
		}
		if(k==2) {
			long[]i = {0,0,0};
			return i;
		}
		if(k==3) {
			
			return j;
		}
		long sum = j[0]+j[1]+j[2]+j[3];
		long y[] = {sum,j[0],j[1],j[2]};
		return TRTetranacci(k-1,y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start;
		long end;
		PrintWriter pw= null;
		try {
			pw=new PrintWriter(new FileOutputStream("TRTetra.txt"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		long[] base= {1,0,0,0};
		for(int i = 5; i<=100; i+=5) {
			start = System.nanoTime();
			System.out.println(i+"   "+TRTetranacci(i,base)[0]);
			end = System.nanoTime();
			pw.println("the time for Tetranacci("+i+"): "+(end - start)+" nanoseconds");
			pw.flush();
		}
		pw.close();
		try {
			pw=new PrintWriter(new FileOutputStream("expoential.txt"));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		for(int i = 5; i<=100; i+=5) {
			start = System.nanoTime();
			System.out.println(i+"   "+exponentialTera(i));
			end = System.nanoTime();
			pw.println("the time for ExponentialTetranacci("+i+"): "+(end - start)+" nanoseconds");
			pw.flush();
		}
		pw.close();
		
		
		}
		
		
}



