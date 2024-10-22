module com.example.banking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.banking to javafx.fxml;
    exports com.example.banking;
}