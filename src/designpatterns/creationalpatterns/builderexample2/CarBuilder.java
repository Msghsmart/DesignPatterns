package designpatterns.creationalpatterns.builderexample2;

public class CarBuilder implements Builder {

	private Car car;
	
	public CarBuilder() {
		this.reset();
	}
	
	@Override
	public void reset() {
		this.car = new Car();
	}
	
	public Car getProduct() {
		
		Car product = this.car;
		this.reset();
		return product;
	}

	@Override
	public void setSeats(int seatsCount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEngine(SportEngine engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTripComputer(boolean hasTripComputer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGPS(boolean hasGPS) {
		// TODO Auto-generated method stub
		
	}

}
