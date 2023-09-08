package week7;

public class MoveableCircle extends Circle implements Moveable {

	public MoveableCircle(double x, double y, double radius) {
		super(x, y, radius);
	}

	@Override
	public void move(double x, double y) {
		super.setX(getX() + x);
		super.setY(getY() + y);

	}

}
