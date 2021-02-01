package designpatterns.creationalpatterns.abstractfactory;

/**
 * The client code works with factories and products only through abstract types:
 * GUIFactory, Button and Checkbox. This lets you pass any factory or product subclass to
 * the client code without breaking it.
 * @author mahmoud.ghandour
 *
 */
public class Application {

	
	
	private GUIFactory guiFactory;
    private Button button;
    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }
    
    void createUI() {
    	this.button = guiFactory.createButton();
    }
    
    void paint() {
        button.paint();
    }

	public static void main(String[] args) {

	}
}
