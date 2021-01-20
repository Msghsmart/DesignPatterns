package designpatterns.creationalpatterns.builderexample2;

public class Application {

	public static void main(String[] args) {
		
		Director director = new Director();
		CarBuilder builder = new CarBuilder();
		director.constructSportCar(builder);
		
		// The final product is often retrieved from a builder object
		// since the director isn't aware of and not dependent on concrete builders and products.
		Car car = builder.getProduct();
		System.out.println(car);
	}
}
