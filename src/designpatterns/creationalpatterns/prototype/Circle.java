package designpatterns.creationalpatterns.prototype;

public class Circle extends Shape {

	private int radius;

	public Circle(Circle circle) {

		super(circle);
		this.radius = circle.radius;
	}

	@Override
	protected Shape clone() {
		return new Circle(this);
	}
}
