package nar.laniverxity;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class MainApplication extends Application {

    private static final String FXML_LOGIN_URL = "login.fxml";
    private static final String FXML_DASHBOARD_URL = "dashboard.fxml";
    private static final String FXML_COURSES_URL = "courses.fxml";

    private static final String ICON_URL = "src/main/resources/assets/favicon.png";

    private Stage _stage;
    private static MainApplication _instance;

    public static MainApplication getInstance() {
        return _instance;
    }

    @Override
    public void start(Stage stage) {
        _instance = this;
        _stage = stage;
        _stage.setTitle("LAniveRXity");
        _stage.getIcons().add(new Image("file:" + ICON_URL));
        _stage.setResizable(false);
        renderLoginPage();
        _stage.show();
    }

    public void renderLoginPage() {
        try{
            changeScene(FXML_LOGIN_URL, 750, 500);
        } catch (Exception ignored) {
        }
    }

    public void renderDashboardPage() {
        try{
            changeScene(FXML_DASHBOARD_URL, 933, 700);
        } catch (Exception ignored) {
        }
    }

    public void renderCoursesPage() {
        try{
            changeScene(FXML_COURSES_URL, 933, 700);
        } catch (Exception ignored) {
        }
    }

    private void changeScene(String fxml, Integer width, Integer height) throws Exception {
        Parent page = FXMLLoader.load(
                Objects.requireNonNull(MainApplication.class.getResource(fxml)),
                null,
                new JavaFXBuilderFactory());
        Scene scene = new Scene(page, width, height);
        _stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}