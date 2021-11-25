package nar.laniverxity;

import javafx.fxml.FXML;

public class ForumController {
    @FXML
    private void dashboardAction() {
        MainApplication.getInstance().renderDashboardPage();
    }

    @FXML
    private void coursesAction() {
        MainApplication.getInstance().renderCoursesPage();
    }
}
