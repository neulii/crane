package Main;

public class Point {
	
	int x = 0;
	int y = 0;
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
		
		
	}
	

	@Override
	public String toString()
	{
		String s;
		
		s = "Point: x = " + Integer.toString(x) + " y = " + Integer.toString(y);
		
		
		return s;
		
		
		
	}
	
	

}
