import java.util.Random;
import java.lang.*;


public class FlickerPhrase
{
	public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<1000000; i++ )
		{
			r = 1 + rng.nextInt(5);

			if (r == 1)
				first();
			if (r == 2)
				second();
			if (r == 3)
				third();
			if (r == 4)
				fourth();
			if (r == 5) 
				fifth();
			

		}

		try {
            	Thread.sleep(1000);
         	} catch (Exception e) {
            	System.out.println(e);
         	}
		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print(" I                               \r");
	}

	public static void second()
	{
		System.out.print("   pledge                        \r");
	}

	public static void third()
	{
		System.out.print("          allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                     to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                            flag.\r");
	}
}