module com.example.demo3434 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo3434 to javafx.fxml;
    exports com.example.demo3434;
}