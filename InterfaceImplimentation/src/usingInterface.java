
interface Shape {
	double calculateArea();
}

interface Color {
	void setColor(String color);
	String getColor();
}

class Circle implements Shape, Color {
	private double radius;
	private String color;

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}
}

public class usingInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5.0, "RED");

		System.out.println("Area of the circle: " + circle.calculateArea());

		System.out.println("Color of the circle: " + circle.getColor());

		circle.setColor("BLACK");
		System.out.println("Color of the circle: " + circle.getColor());

	}

}
