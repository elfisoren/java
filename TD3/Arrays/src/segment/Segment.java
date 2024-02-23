package segment;
import point.Point;

public class Segment {
	private Point origine;
	private Point extremite;

	public Segment() {
		this.origine=new Point(0,0);
		this.extremite=new Point(1,2);
	}
	public Segment(Point origine,Point extremite) throws Exception{
		this.origine=origine;
		this.extremite=extremite;
		if (confondu(origine,extremite)==true) {
			throw new Exception("Les points sont confondus");
		}

	}
	public double longeur() {
		return origine.getDistance(extremite);
	}
	public Point getOrigine() {
		return origine;
	}

	public Point getExtremite() {
		return extremite;
	}

	public String toString() {
		return "Segment [origine=" + origine + ", extremite=" + extremite + "]";
	}
	public Segment projetX() throws Exception {
		Segment Newsegment= new Segment();
		return Newsegment;
	}
	public Segment projetY()throws Exception {
		Segment Newsegment= new Segment();
		return Newsegment;
	}
	public boolean confondu(Point origine, Point extremite) {
		if(longeur() == 0)
		return true;
	else {
		return false;
	}
}}
