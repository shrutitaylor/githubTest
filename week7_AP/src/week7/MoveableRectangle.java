package week7;

public class MoveableRectangle extends Rectangle implements Moveable {

	public MoveableRectangle(double x, double y, double width, double height) {
		super(x, y, width, height);
		
	}

	@Override
	public void move(double x, double y) {
		super.setX(getX() + x);
		super.setY(getY() + y);
		
	}

}
