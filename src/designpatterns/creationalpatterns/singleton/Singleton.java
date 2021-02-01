package designpatterns.creationalpatterns.singleton;

public class Singleton {

	private static volatile Singleton instance;
	private static Object mutex = new Object();

	public static Singleton getInstance() {

		Singleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null) {
					instance = result = new Singleton();
				}
			}
		}
		return result;
	}

	/*
	 * The local variable result seems unnecessary.
	 * But, it’s there to improve the performance of our code.
	 * In cases where the instance is already initialized (most of the time),
	 * the volatile field is only accessed once (due to “return result;” instead of “return instance;”).
	 * This can improve the method’s overall performance by as much as 25 percent.
	 */
}
