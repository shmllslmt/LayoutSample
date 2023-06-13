module com.example.layoutsample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.layoutsample to javafx.fxml;
    exports com.example.layoutsample;
}