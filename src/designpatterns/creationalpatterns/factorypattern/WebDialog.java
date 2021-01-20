package designpatterns.creationalpatterns.factorypattern;

/**
 * Concrete creators override the factory method to change the resulting product's type.
 * @author mahmoud.ghandour
 *
 */
public class WebDialog extends Dialog {

	@Override
	Button createButton() {
		return new WebButton();
	}

}
