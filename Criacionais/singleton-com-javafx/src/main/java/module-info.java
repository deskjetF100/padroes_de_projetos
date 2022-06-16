module com.example.singletoncomjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.singletoncomjavafx to javafx.fxml;
    exports com.example.singletoncomjavafx;
}