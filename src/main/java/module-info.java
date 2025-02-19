module com.example.designpattern {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.designpattern to javafx.fxml;
    exports com.example.designpattern;
}