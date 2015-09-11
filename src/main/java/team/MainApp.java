package team;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import team.screens.ScreenMaster;

public class MainApp extends Application {

    public static final String MAIN_SCREEN = "main";
    public static final String MAIN_SCREEN_FXML = "main.fxml";

    public void start(Stage stage) throws Exception {
      ScreenMaster main = new ScreenMaster();
      main.loadScreen(MAIN_SCREEN, MAIN_SCREEN_FXML);
    	main.displayScreen(MAIN_SCREEN);

      Group root = new Group();
      root.getChildren().addAll(main);
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
}
