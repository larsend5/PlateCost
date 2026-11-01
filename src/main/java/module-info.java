module com.larsen {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.larsen to javafx.fxml;
    exports com.larsen;
}
