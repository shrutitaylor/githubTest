package week7;

abstract class Shape
{
	private double x;
	private double y;
	
	protected Shape(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public void setX(double x) { this.x = x;}
	public void setY(double y) { this.y = y;}

	public double getX() { return this.x; }
	public double getY() { return this.y; }
	
public abstract double computeArea();
public abstract double computePeri();
public abstract void print();

}