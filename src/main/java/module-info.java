module nar.laniverxity.laniverxity {
    requires javafx.controls;
    requires javafx.fxml;


    opens nar.laniverxity to javafx.fxml;
    exports nar.laniverxity;
}