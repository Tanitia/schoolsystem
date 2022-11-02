module com.example.schoolsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schoolsystem to javafx.fxml;
    exports com.example.schoolsystem;
}