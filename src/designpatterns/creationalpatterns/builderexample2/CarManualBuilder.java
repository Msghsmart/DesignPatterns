package designpatterns.creationalpatterns.builderexample2;

public class CarManualBuilder implements Builder {

	Manual manual;
	
	public CarManualBuilder() {
		this.reset();
	}
	
	@Override
	public void reset() {
		this.manual = new Manual();
	}

	public Manual getProduct() {
		
		Manual product = this.manual;
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
