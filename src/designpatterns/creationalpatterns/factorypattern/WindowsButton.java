package designpatterns.creationalpatterns.factorypattern;

/**
 * Concrete products provide various implementations of the product interface.
 * @author mahmoud.ghandour
 *
 */
public class WindowsButton implements Button {

	@Override
	public void onClick() {
		System.out.print("windows button was clicked");
	}

	@Override
	public void render() {
		System.out.println("windows button was rendered");
	}

}
