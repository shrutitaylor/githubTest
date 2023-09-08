package week7;


public class Main{
	public static void main(String[] args) {
		
//		Circle c= new Circle(1,2,3);
//		c.print();
//		
//		Rectangle r = new Rectangle ( 1,2 , 3,4);
//		r.print();
		
		Shape s[] = new Shape[4];
		s[0] = new MoveableCircle(10,20,1);
		s[1] = new MoveableRectangle(12,30,5,6);
		s[2] = new MoveableCircle(13,12,2);
		s[3] = new MoveableRectangle(19,40,3,2);
		System.out.println("Areas are : ");
		for (int i=0; i<4; i++)
		System.out.println(s[i].computeArea());
		System.out.println("Perimeters are : ");
		for (int i=0; i<4; i++)
		System.out.println(s[i].computePeri());
		System.out.println("------------Objects before move : ");
		for (int i=0; i<4; i++)
		s[i].print();
		for (int i=0; i<4; i++)
		((Moveable) s[i]).move(100,200);
		System.out.println("--------------Objects after move : ");
		
		for (int i=0; i<4; i++)		s[i].print();
		}

	
}