module org.example.shoppingcartapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.shoppingcartapp to javafx.fxml;
    exports org.example.shoppingcartapp;
}