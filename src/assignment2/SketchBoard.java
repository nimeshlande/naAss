package assignment2;

abstract class Shape{
	abstract String draw();
	}

class Line extends Shape{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "Drawing Line";
	}
	
}

class Cube extends Shape{

	@Override
	String draw() {
		// TODO Auto-generated method stub
		return "Drawing Cube";
	}
	
}

public class SketchBoard {
	public static void main(String[] args) {
		Cube c = new Cube();
		Line l = new Line();
		
		System.out.println(c.draw());
		System.out.println(l.draw());
		
	
	}

}
