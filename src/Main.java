import controller.Controller;
import view.Preloader;

public class Main {

	//erstellt die Preloader-View und übergibt sie dem erstellen Controller
	public static void main(String[] args) {
		Preloader menu = new Preloader();
		new Controller(menu);
	}
}
