package LAB13.LAB13_Ex01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Age Calculator");

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 300, 200);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        TextField nameField = new TextField();
        nameField.setPromptText("Input name");
        Label nameLabel = new Label("Name:");

        DatePicker datePicker = new DatePicker();
        Label dateLabel = new Label("Date:");
        Button button = new Button("Calculate");

        Label resultLabel = new Label();

        vbox.getChildren().addAll(nameLabel, nameField, dateLabel, datePicker, button, resultLabel);

        button.setOnAction(event -> {
            String name = nameField.getText();
            LocalDate birthDate = datePicker.getValue();
            LocalDate currentDate = LocalDate.now();

            if (birthDate != null && birthDate.isBefore(currentDate)) {
                int age = Period.between(birthDate, currentDate).getYears();
                resultLabel.setText(name + " is " + age + " years old");
            } else if (birthDate != null && birthDate.isAfter(currentDate)) {
                alert.setTitle("Error");
                alert.setHeaderText("Provided date is in the future.");
                datePicker.setValue(null);
                alert.show();
            } else {
                alert.setTitle("Error");
                alert.setHeaderText("Invalid date");
                datePicker.setValue(null);
                alert.show();
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
