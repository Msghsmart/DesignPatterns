package designpatterns.creationalpatterns.abstractfactory;

public class MacButton implements Button {

	@Override
	public void paint() {
		System.out.println("Mac button design.");
	}

}
