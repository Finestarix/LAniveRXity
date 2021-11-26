package nar.laniverxity;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private ComboBox<String> universityList;

    @FXML
    private void coursesAction() {
        MainApplication.getInstance().renderCoursesPage();
    }

    @FXML
    private void forumAction() {
        MainApplication.getInstance().renderForumPage();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        universityList.getItems().setAll("Crown Castle Campus", "Land O'Lakes Campus", "Hartzell Propeller Campus");
    }
}
