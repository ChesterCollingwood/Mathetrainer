import controller.Controller;
import view.View;

public class Main {

	public static void main(String[] args) {
		View view = new View();
		new Controller(view);
	}
}
