package segment;

import point.Point;

public class TestSegment {
	public static void main(String arg[]) {
		Point origine = new Point(0,1);
		Point extremite = new Point(0,0);
		try {
			Segment p = new Segment(origine,extremite);
			System.out.println(p.longeur());
					}	
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("test n°3");
		
	}
}
