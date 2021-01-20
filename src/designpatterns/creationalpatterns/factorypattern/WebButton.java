package designpatterns.creationalpatterns.factorypattern;

/**
 * Concrete products provide various implementations of the product interface.
 * @author mahmoud.ghandour
 *
 */
public class WebButton implements Button {

	@Override
	public void onClick() {
		System.out.print("web button was clicked");
	}

	@Override
	public void render() {
		System.out.println("web button was rendered");
	}

}
