import java.util.*;

public class homework5{
	public static void main(String [] args){
		long before = System.currentTimeMillis();
		final long fourBillion = 4000000000L;
		long inside = 0L;
		Random random = new Random();
		double pi = 0;
		for (long i = fourBillion; i <= fourBillion; i++){
			double x = random.nextDouble();
			double y = random.nextDouble();

			if ((Math.pow(x,2) + Math.pow(y,2)) < 1){
				inside++;
			}
			if (i % 4000000000L == 0)
				System.out.println("in " + i + " dots "+ ": " + inside + " dots inside");
		}
	
		System.out.println(System.currentTimeMillis()-before);

	}
}