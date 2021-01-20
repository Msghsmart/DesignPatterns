package designpatterns.creationalpatterns.builderexample2;

public class Director {

	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void constructSportCar(Builder builder) {

		builder.reset();
		builder.setSeats(2);
		builder.setEngine(new SportEngine());
		builder.setTripComputer(true);
		builder.setGPS(true);
	}

	public void constructSUVCar(Builder builder) {

		builder.reset();
		builder.setSeats(4);
		// ... etc.
	}
}
