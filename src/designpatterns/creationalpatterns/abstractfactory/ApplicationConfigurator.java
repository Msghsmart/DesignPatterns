package designpatterns.creationalpatterns.abstractfactory;

public class ApplicationConfigurator {

	public static void main() throws Exception {

		GUIFactory factory;
		String config = "Windows";
		if (config == "Windows") {
			factory = new WinFactory();
		} else if (config == "Mac") {
			factory = new MacFactory();
		} else {
			throw new Exception("Error! Unknown operating system.");
		}

		Application app = new Application(factory);
	}
}
