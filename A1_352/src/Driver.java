import java.io.* ;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		
		PrintWriter pw=null;
		try {
			pw=new PrintWriter(new FileOutputStream("Tetranacci.txt"));
			
		}
		catch(Exception e) {}
		for(int k=5;k<=50;k=k+5) {
		long TetraStart=System.nanoTime();
		int n=Tetranacci.exponentialTera(k);
		long TetraEnd=System.nanoTime();
		
		pw.println(k+" Time: "+(TetraEnd-TetraStart));}
		 pw.close();
	}
  
}
