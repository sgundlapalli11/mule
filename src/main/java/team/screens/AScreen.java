package team.screens;

import javafx.fxml.Initializable;

public abstract class AScreen implements Initializable, IScreen {

    ScreenMaster parent;

    public void setParent(ScreenMaster controller) {
        parent = controller;
    }
}
