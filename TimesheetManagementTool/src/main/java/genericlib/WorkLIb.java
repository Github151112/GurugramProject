package genericlib;

import java.util.Random;

public class WorkLIb {
	
	public int getRandomNo()
	{
		Random r = new Random();
		return r.nextInt(1000);
	}

}
