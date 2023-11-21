module com.example.unijui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unijui to javafx.fxml;
    exports com.example.unijui;
}