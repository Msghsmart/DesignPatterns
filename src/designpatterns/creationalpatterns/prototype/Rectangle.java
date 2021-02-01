package designpatterns.creationalpatterns.prototype;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(Rectangle rectangle) {

		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	@Override
	protected Shape clone() {
		return new Rectangle(this);
	}

}
