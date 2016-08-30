import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FrontEnd extends Application {
	Boolean English = true;
	Menu file;
	Label pLabel;
	Menu test;
	Label tLabel;
	Menu settings;
	MenuItem exit;
	MenuItem gerEng;
	MenuItem engGer;
	MenuItem language;
	MenuItem colorScheme;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
	BorderPane root = new BorderPane();	
	GridPane grid = new GridPane();
	Scene scene = new Scene(root, 800, 500);
		
	Button prev = new Button("Previous");
	Button next = new Button("Next");
	
	Text tGrammar = new Text("Grammar");//TODO replace with values
	Text tWord = new Text("Word");//TODO replace with values
	Text tDescription = new Text("Description");//TODO replace with values
	
	VBox rVbox = new VBox();
	VBox lVbox = new VBox();

	Button b50 = new Button("1-50 most common words");
	Button b100 = new Button ("51-100 most common words");
	Button b150 = new Button ("101-150 most common words");
	Button b200 = new Button ("151-200 most common words");
	Button b250 = new Button ("201-250 most common words");
	Button b300 = new Button ("251-300 most common words");
	
	rVbox.getChildren().addAll(b50, b100, b150, b200, b250, b300);

	
	
	grid.add(tGrammar, 0, 0, 5, 1); //column, row, column span, row span
	grid.add(tWord, 0, 1, 5, 1);
	grid.add(tDescription, 0, 2, 5, 2);
	grid.add(prev, 0, 4, 1, 1);
	grid.add(next, 4, 4, 1, 1);
	
	
	root.setTop(createMenu());
	root.setCenter(grid);
	root.setLeft(lVbox);
	root.setRight(rVbox);
		
	
	tLabel.setOnMouseClicked(new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent event) {
			toggleLanguage();			
		}
	});
	
	primaryStage.setTitle("Language Application");
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	
	/** Creates menu bar */	
	public MenuBar createMenu(){
		MenuBar menu = new MenuBar();
		file = new Menu("File");
		Menu practice = new Menu ();
		pLabel = new Label("Practice");
		test = new Menu("Test");
		Menu toggle = new Menu();
		tLabel = new Label("DE/EN");
			
		settings = new Menu("Settings");
		exit = new MenuItem("Exit");

		gerEng = new MenuItem("German-English");
		engGer = new MenuItem("English-German");

		language = new MenuItem ("Language");
		colorScheme = new MenuItem ("Color Scheme");
		
		menu.getMenus().addAll(file, practice, test, toggle);
		file.getItems().addAll(settings, exit);
		test.getItems().addAll(gerEng, engGer);
		
		settings.getItems().addAll(language, colorScheme);
		practice.setGraphic(pLabel);
		toggle.setGraphic(tLabel);
		
		return menu;
	}
	/** Toggles the language settings for the UI */
	public void toggleLanguage(){
		if (English == true){
			file.setText("Datei");
			pLabel.setText("Üben");
			test.setText("Test");;
			tLabel.setText("GER/ENG");
			settings.setText("Einstellungen");
			exit.setText("Schließen");
			gerEng.setText("Deutsch-Englisch");
			engGer.setText("Englisch-Deutsch");
			language.setText("Sprache");
			colorScheme.setText("Farbthema");
			English = false;
		}
		else {
			file.setText("File");
			pLabel.setText("Practice");
			test.setText("Test");;
			tLabel.setText("EN/GER");
			settings.setText("Settings");
			exit.setText("Exit");
			gerEng.setText("German-English");
			engGer.setText("English-German");
			language.setText("Language");
			colorScheme.setText("Color Scheme");
		}
	}
	
//	public VBox createVBox(){
//		VBox vbox = new VBox();
//		return vbox;
//	}
	
	public static void main (String [] args){
		Application.launch(args);
	}
}
