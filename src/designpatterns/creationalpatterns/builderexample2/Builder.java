package designpatterns.creationalpatterns.builderexample2;

public interface Builder {

	void reset();
	void setSeats(int seatsCount);
	void setEngine(SportEngine engine);
	void setTripComputer(boolean hasTripComputer);
	void setGPS(boolean hasGPS);
}
