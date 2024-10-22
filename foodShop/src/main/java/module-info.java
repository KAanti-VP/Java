module com.example.foodshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foodshop to javafx.fxml;
    exports com.example.foodshop;
}