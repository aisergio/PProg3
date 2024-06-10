// /src/view/ChallengesView.java
package geomate.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ChallengesView {

    public Scene createChallengesScene(Stage primaryStage) {
        try {
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ChallengesView.fxml"));
            BorderPane root = loader.load();

            // Crear y retornar la escena
            return new Scene(root, 400, 300);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
