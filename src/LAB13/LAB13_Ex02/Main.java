package LAB13.LAB13_Ex02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Cipher");

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 300);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);


        Label labelTextArea1 = new Label("Input string:");
        TextArea textArea1 = new TextArea();
        Label labelTextField = new Label("Input offset:");
        TextField textField = new TextField();
        Button button = new Button("Submit");
        Label labelTextArea2 = new Label("Result string:");
        TextArea textArea2 = new TextArea();
        textArea2.setEditable(false);

        button.setOnAction(event -> {
            String inputText = textArea1.getText();
            String inputOffset = textField.getText();

            if(inputOffset != null && !inputOffset.isEmpty() && CaesarCipher.isInt(inputOffset)) {
                String result = CaesarCipher.caesarCipher(inputText, Integer.parseInt(inputOffset));
                textArea2.setText(result);
            } else {
                alert.setTitle("Offset error");
                textField.setText(null);
                alert.setHeaderText("Provided offset must be an integer.");
                alert.show();
            }
        });
        vbox.getChildren().addAll(labelTextArea1, textArea1, labelTextField, textField, button, labelTextArea2, textArea2);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
