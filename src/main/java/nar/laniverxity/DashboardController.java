package nar.laniverxity;

import javafx.fxml.FXML;

public class DashboardController {
    @FXML
    private void coursesAction() {
        MainApplication.getInstance().renderCoursesPage();
    }

    @FXML
    private void forumAction() {

    }
}
