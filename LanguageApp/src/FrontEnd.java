import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FrontEnd extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
	BorderPane root = new BorderPane();		
	Scene scene = new Scene(root, 500, 500);
	
	
	root.setTop(createMenu());
	root.setRight(createVBox());
		
	
	primaryStage.setTitle("Language Application");
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	
	/** Creates menu bar */	
	public MenuBar createMenu(){
		MenuBar menu = new MenuBar();
		Menu file = new Menu("File");
		Menu practice = new Menu ();
		Label pLabel = new Label("Practice");
		Menu test = new Menu("Test");
		Menu toggle = new Menu();
		Label tLabel = new Label("DE/EN");
			
		Menu settings = new Menu("Settings");
		MenuItem exit = new MenuItem("Exit");

		MenuItem gerEng = new MenuItem("German-English");
		MenuItem engGer = new MenuItem("English-German");

		MenuItem language = new MenuItem ("Language");
		MenuItem colorScheme = new MenuItem ("Color Scheme");
		
		menu.getMenus().addAll(file, practice, test, toggle);
		file.getItems().addAll(settings, exit);
		test.getItems().addAll(gerEng, engGer);
		
		settings.getItems().addAll(language, colorScheme);
		practice.setGraphic(pLabel);
		toggle.setGraphic(tLabel);
		
		return menu;
	}
	
	public VBox createVBox(){
		VBox vbox = new VBox();
		return vbox;
	}
	
	public static void main (String [] args){
		Application.launch(args);
	}
}
