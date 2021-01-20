package designpatterns.creationalpatterns.abstractfactory;

public class WinButton implements Button {

	@Override
	public void paint() {
		System.out.println("Win button design.");
	}

}
