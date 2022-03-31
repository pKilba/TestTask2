module com.example.demo9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo9 to javafx.fxml;

    opens com.example.demo9.task2 to javafx.fxml;
    exports com.example.demo9.task2;
}