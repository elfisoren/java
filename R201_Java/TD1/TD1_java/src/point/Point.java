package point;

public class Point {
	private double px;
	public double getPx() {
		return px;
	}
	public void setPx(double px) {
		this.px = px;
	}
	public double getPy() {
		return py;
	}
	public void setPy(double py) {
		this.py = py;
	}
	private double py;
	

	public Point getLocation() {
		Point copie = new Point(px,py);
		return copie;
	}
/*
	public void  setLocation(double x, double y) {
		p.setLocation(x.getX(),y.getY());	
	}
*/
	
	public void projX() {
		System.out.println(px);
	}
	public void projY() { 
		System.out.println(py);
	}
	
	public String toString() {
		return("La coordonnée de x1 est "+px+"");
	}
	public String toString2() {
		return("La coordonnée de y1 est "+py+"");
	}
	public Point() {
		px=0;
		py=0;
	}
	public Point(double x, double y) {
		px=x;
		py=y;
	}
	public double getDistance(Point p) {
		return Math.sqrt((px-p.px)*(px-p.px)+(py-p.py)*(py-p.py));
	}
	public void afficher() {
		System.out.println("[" + this.px + "," + this.py + "]");
	}
	public double getX() {
		return px;
	}
	public double getY() {
		return py;
	}
}