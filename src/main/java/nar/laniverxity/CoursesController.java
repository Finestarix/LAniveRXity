package nar.laniverxity;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class CoursesController implements Initializable {
    @FXML
    private ComboBox<String> semesterList;

    @FXML
    private void dashboardAction() {
        MainApplication.getInstance().renderDashboardPage();
    }

    @FXML
    private void forumAction() {
        MainApplication.getInstance().renderForumPage();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        semesterList.getItems().setAll("2021, Odd Semester", "2020, Compact Semester", "2020, Even Semester", "2020, Odd Semester");
    }
}
