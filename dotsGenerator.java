import java.util.*;

class v2_Dots{
	public static void main(String[] arg){
		long before = System.currentTimeMillis();
		long inside = 0L;
		Random random = new Random();
		double pi = 0;
		for (long i = 1; i <= 4000000000L; i++){
			double x = random.nextDouble();
			double y = random.nextDouble();

			if (x*x + y*y < 1){
				inside++;
			}
		}
		System.out.println(System.currentTimeMillis()-before);
	}
	
}