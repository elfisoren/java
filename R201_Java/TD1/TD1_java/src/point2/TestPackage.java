package point2;
import point.Point;

public class TestPackage {
	public static void main(String[] args) {
		Point p1= new Point(5,6);
		Point p2= new Point(3,2);
		p1.afficher();
		p2.afficher();
		System.out.println(p1.getDistance(p2));
		p1.projX();
		p1.projY();
		System.out.println(p1.toString());
		System.out.println(p1.toString2());
	}
}
