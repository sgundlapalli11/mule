package team.screens;

import javafx.scene.layout.StackPane;
import javafx.scene.Node;

public class ScreenMaster extends StackPane {

    /**
     * Displays a given Screen, looked up by name (key)
     * @param name Name of screen (key)
     * @return Success
     */
    public boolean displayScreen(String name) {
        return false;
    }

    /**
     * Adds a Screen and Node pair into our holding structure.
     * Invoked by this::loadScreen()
     * @param name Name of the screen (key)
     * @param screen Root node of the screen
     */
    public void addScreen(String name, Node screen) {

    }

    /**
     * Loads a screen from an FXML file.
     * @param name Name of the screen (key)
     * @resources File location of the FXML file
     * @return Success
     */
    public boolean loadScreen(String name, String resource) {
        addScreen(name, null);
        return false;
    }

    /**
     * Removes a screen from the data structure, making it unavailable.
     * It must be re-added to be used again.
     * @param name Name of the screen to remove (key)
     * @return Success
     */
    public boolean removeScreen(String name) {
        return false;
    }
}
