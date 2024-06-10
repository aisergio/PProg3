// /src/main/java/geomate/controller/ChallengesController.java
package geomate.controller;

import geomate.view.ChallengesView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChallengesController {

    @FXML
    private Button botonRegresarInicio;

    @FXML
    private Button botonPistas;

    @FXML
    private Button botonComodines;

    @FXML
    public void initialize() {
        // Configurar los botones para cambiar de escena
        botonRegresarInicio.setOnAction(event -> {
            Stage stage = (Stage) botonRegresarInicio.getScene().getWindow();
            showMainView(stage);
        });

        botonPistas.setOnAction(event -> {
            // Aquí puedes agregar la lógica para la funcionalidad de "Pistas"
            System.out.println("Pistas button clicked");
        });

        botonComodines.setOnAction(event -> {
            // Aquí puedes agregar la lógica para la funcionalidad de "Comodines"
            System.out.println("Comodines button clicked");
        });
    }

    private void showMainView(Stage primaryStage) {
        MainController mainController = new MainController();
        mainController.showMainView(primaryStage);
    }
}
