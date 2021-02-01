package designpatterns.creationalpatterns.prototype;

public abstract class Shape {

	private int x;
	private int y;
	private String color;

	public Shape() {

	}

	public Shape(Shape shape) {

		this();
		this.x = shape.x;
		this.y = shape.y;
		this.color = shape.color;
	}

	
	protected abstract Shape clone();
}
