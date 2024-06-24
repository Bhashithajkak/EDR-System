module com.example.edrsystem {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.edrsystem to javafx.fxml;
    exports com.example.edrsystem;
}