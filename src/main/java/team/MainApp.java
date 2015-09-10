import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;

public class MainApp extends Application {
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }
}
