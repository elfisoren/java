package point;

public class TestPoint {
	public static void main(String[] args) {
		Point p1= new Point(12,4);
		Point p2= new Point(0,2);
		p1.afficher();
		p2.afficher();	
		System.out.println(p1.toString());
		System.out.println(p1.toString2());
		System.out.println(p1.getLocation());
		//System.out.println(p1.setLocation(p));
	}
}
