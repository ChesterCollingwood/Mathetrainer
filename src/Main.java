import controller.Controller;
import view.Preloader;

public class Main {

	public static void main(String[] args) {
		Preloader menu = new Preloader();
		new Controller(menu);
	}
}
