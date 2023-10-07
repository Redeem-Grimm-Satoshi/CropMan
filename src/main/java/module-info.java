module com.zolix.cropman {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.zolix.cropman to javafx.fxml;
    exports com.zolix.cropman;
    exports com.zolix.cropman.Controller;
    opens com.zolix.cropman.Controller to javafx.fxml;
}