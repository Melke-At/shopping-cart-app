package org.example.shoppingcartapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Default language (English)
        Locale locale = new Locale("en", "US");

        // ✅ FIXED: correct bundle path (NO spaces)
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.MessagesBundle", locale);

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/view.fxml"),
                bundle
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Melke-AT / Shopping Cart App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}