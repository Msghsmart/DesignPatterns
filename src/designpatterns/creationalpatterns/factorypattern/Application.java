package designpatterns.creationalpatterns.factorypattern;

public class Application {

	static Dialog dialog;

	// The application picks a creator's type depending on the current configuration or environment settings.
	private static void initialize() {
		
		String config = "web";
		
		if("web".equals(config)) {
			dialog = new WebDialog();
		} else if("windows".equals(config)) {
			dialog = new WindowsDialog();
		}
	}
	public static void main(String[] args) {
		
		initialize();
		dialog.render();
	}
}
