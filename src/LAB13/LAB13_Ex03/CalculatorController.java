package LAB13.LAB13_Ex03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

public class CalculatorController {
    private String operation;
    Alert alert = new Alert(Alert.AlertType.ERROR);


    @FXML
    public TextField textFieldo;

    @FXML
    private void buttonClick(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        String buttonText = clickedButton.getText();

        switch(buttonText) {
            case "1" -> textFieldo.setText(textFieldo.getText() + "1");
            case "2" -> textFieldo.setText(textFieldo.getText() + "2");
            case "3" -> textFieldo.setText(textFieldo.getText() + "3");
            case "4" -> textFieldo.setText(textFieldo.getText() + "4");
            case "5" -> textFieldo.setText(textFieldo.getText() + "5");
            case "6" -> textFieldo.setText(textFieldo.getText() + "6");
            case "7" -> textFieldo.setText(textFieldo.getText() + "7");
            case "8" -> textFieldo.setText(textFieldo.getText() + "8");
            case "9" -> textFieldo.setText(textFieldo.getText() + "9");
            case "0" -> textFieldo.setText(textFieldo.getText() + "0");
            case "." -> textFieldo.setText(textFieldo.getText() + ".");
            case "+" -> {
                textFieldo.setText(textFieldo.getText() + "+");
                operation = "+";
            }
            case "-" -> {
                textFieldo.setText(textFieldo.getText() + "-");
                operation = "-";
            }
            case "/" -> {
                textFieldo.setText(textFieldo.getText() + "/");
                operation = "/";
            }
            case "*" -> {
                textFieldo.setText(textFieldo.getText() + "*");
                operation = "*";
            }
        }
    }

    @FXML
    private void buttonClear(ActionEvent actionEvent) {
        textFieldo.setText("");
    }

    @FXML
    private void buttonEquals(ActionEvent actionEvent) {
        String inputText = textFieldo.getText();

        String[] splitText = inputText.split("[+\\-*/]");

        if (splitText.length != 2) {
            buttonClear(actionEvent);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wrong amount of operations.");
            alert.show();
        }
        else if (Objects.equals(splitText[0], ".") || Objects.equals(splitText[1], ".")) {
            buttonClear(actionEvent);
            alert.setTitle("ERROR");
            alert.setHeaderText("Incorrect usage of periods.");
            alert.show();
        }
        else {
        switch(operation) {
            case "+" -> {
                float num1 = Float.parseFloat(splitText[0]);
                float num2 = Float.parseFloat(splitText[1]);
                float result = num1 + num2;
                textFieldo.setText(String.valueOf(result));
            }
            case "-" -> {
                float num1 = Float.parseFloat(splitText[0]);
                float num2 = Float.parseFloat(splitText[1]);
                float result = num1 - num2;
                textFieldo.setText(String.valueOf(result));

            }
            case "*" -> {
                float num1 = Float.parseFloat(splitText[0]);
                float num2 = Float.parseFloat(splitText[1]);
                float result = num1 * num2;
                textFieldo.setText(String.valueOf(result));
            }
            case "/" -> {
                float num1 = Float.parseFloat(splitText[0]);
                float num2 = Float.parseFloat(splitText[1]);

                if (num2 == 0) {
                    buttonClear(actionEvent);
                    alert.setTitle("ERROR");
                    alert.setHeaderText("Cannot divide by zero");
                    alert.show();
                } else {
                    float result = num1 / num2;
                    textFieldo.setText(String.valueOf(result));

                }
            }
            }
        }

    }

}

