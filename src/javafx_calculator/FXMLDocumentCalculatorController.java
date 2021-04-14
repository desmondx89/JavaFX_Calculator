/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Desmond
 */
public class FXMLDocumentCalculatorController implements Initializable {

    @FXML
    private Button btnNine;
    @FXML
    private Button btnEight;
    @FXML
    private Button btnSeven;
    @FXML
    private Button btnSix;
    @FXML
    private Button btnFive;
    @FXML
    private Button btnFour;
    @FXML
    private Button btnThree;
    @FXML
    private Button btnTwo;
    @FXML
    private Button btnOne;
    @FXML
    private Button btnZero;

    @FXML
    private Button btnPlus;
    @FXML
    private Button btnMinus;
    @FXML
    private Button btnMultiply;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnDecimal;

    @FXML
    private Button btnEqual;
    @FXML
    private Button btnClear;

    @FXML
    private TextField dispArea;

    private float firstInput = 0;
    private float secondInput = 0;
    private float calculatedValue;
    private String value = "";

    private char count;

    //Mouse Click Functions
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnNine) {
            getNine();
        }

        if (event.getSource() == btnEight) {
            getEight();
        }

        if (event.getSource() == btnSeven) {
            getSeven();
        }

        if (event.getSource() == btnSix) {
            getSix();
        }

        if (event.getSource() == btnFive) {
            getFive();
        }

        if (event.getSource() == btnFour) {
            getFour();
        }

        if (event.getSource() == btnThree) {
            getThree();
        }
        if (event.getSource() == btnTwo) {
            getTwo();
        }

        if (event.getSource() == btnOne) {
            getOne();
        }

        if (event.getSource() == btnZero) {
            getZero();
        }

        if (event.getSource() == btnDecimal) {
            value = dispArea.getText();
            if (value.equals("") || value == null) {
                value = "0.";
                dispArea.setText(value);
            } else {
                if (value.contains(".") == true) {
                    dispArea.setText(value);
                } else {
                    value = value + ".";
                    dispArea.setText(value);
                }
            }
        }

        //Plus button function
        if (event.getSource() == btnPlus) {

            value = dispArea.getText();
            count = '+';

            if (firstInput == 0) {
                firstInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            } else {
                secondInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            }

            if (firstInput != 0 && secondInput != 0) {
                calculatedValue = firstInput + secondInput;
                dispArea.setText(String.valueOf(calculatedValue));
                firstInput = calculatedValue;
                secondInput = 0;
                value = "";
            } else {
                System.out.println("ran up till here!(plus)");
            }

        }

        //Minus button function
        if (event.getSource() == btnMinus) {
            value = dispArea.getText();
            count = '-';
            if (firstInput == 0) {
                firstInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            } else {
                secondInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            }

            if (firstInput != 0 && secondInput != 0) {
                calculatedValue = firstInput - secondInput;
                dispArea.setText(String.valueOf(calculatedValue));
                firstInput = calculatedValue;
                secondInput = 0;
                value = "";
            } else {
                System.out.println("ran up till here!(plus)");
            }
        }

        //Multiply button function
        if (event.getSource() == btnMultiply) {
            value = dispArea.getText();
            count = '*';
            if (firstInput == 0) {
                firstInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            } else {
                secondInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            }

            if (firstInput != 0 && secondInput != 0) {
                calculatedValue = firstInput * secondInput;
                dispArea.setText(String.valueOf(calculatedValue));
                firstInput = calculatedValue;
                secondInput = 0;
                value = "";
            } else {
                System.out.println("ran up till here!(plus)");
            }
        }

        //Divide button function
        if (event.getSource() == btnDivide) {
            value = dispArea.getText();
            count = '/';
            if (firstInput == 0) {
                firstInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            } else {
                secondInput = Float.parseFloat(value);
                value = "";
                dispArea.setText(value);
            }

            if (firstInput != 0 && secondInput != 0) {
                calculatedValue = firstInput / secondInput;
                dispArea.setText(String.valueOf(calculatedValue));
                firstInput = calculatedValue;
                secondInput = 0;
                value = "";
            } else {
                System.out.println("ran up till here!(plus)");
            }
        }

        //Protoype clear all function
        if (event.getSource() == btnClear) {
            value = "";
            firstInput = 0;
            secondInput = 0;
            calculatedValue = 0;
            dispArea.setText(value);

        }

        //Equals button function
        if (event.getSource() == btnEqual) {
            value = dispArea.getText();

            if (firstInput != 0 && secondInput != 0) {

                switch (count) {
                    case '+':
                        calculatedValue = firstInput + secondInput;
                        break;
                    case '-':
                        calculatedValue = firstInput - secondInput;
                        break;
                    case '*':
                        calculatedValue = firstInput * secondInput;
                        break;
                    case '/':
                        calculatedValue = firstInput / secondInput;
                        break;
                    default:
                        break;
                }

                dispArea.setText(String.format("%.2f", calculatedValue));
                value = "";
                firstInput = 0;
                secondInput = 0;
            } else {
                if (firstInput == 0) {
                    firstInput = Float.parseFloat(value);
                    value = "";
                    dispArea.setText(value);
                } else {
                    secondInput = Float.parseFloat(value);
                    value = "";
                    dispArea.setText(value);
                }
                switch (count) {
                    case '+':
                        calculatedValue = firstInput + secondInput;
                        break;
                    case '-':
                        calculatedValue = firstInput - secondInput;
                        break;
                    case '*':
                        calculatedValue = firstInput * secondInput;
                        break;
                    case '/':
                        calculatedValue = firstInput / secondInput;
                        break;
                    default:
                        break;
                }
                dispArea.setText(String.format("%.2f", calculatedValue));
                value = "";
                firstInput = 0;
                secondInput = 0;

            }
        }
    }

    @FXML
    private void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.NUMPAD1 || keyEvent.getCode() == KeyCode.DIGIT1) {
            getOne();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD2 || keyEvent.getCode() == KeyCode.DIGIT2) {
            getTwo();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD3 || keyEvent.getCode() == KeyCode.DIGIT3) {
            getThree();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD4 || keyEvent.getCode() == KeyCode.DIGIT4) {
            getFour();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD5 || keyEvent.getCode() == KeyCode.DIGIT5) {
            getFive();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD6 || keyEvent.getCode() == KeyCode.DIGIT6) {
            getSix();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD7 || keyEvent.getCode() == KeyCode.DIGIT7) {
            getSeven();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD8 || keyEvent.getCode() == KeyCode.DIGIT8) {
            getEight();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD9 || keyEvent.getCode() == KeyCode.DIGIT9) {
            getNine();
        }
        if (keyEvent.getCode() == KeyCode.NUMPAD0 || keyEvent.getCode() == KeyCode.DIGIT0) {
            getZero();
        }

        if (keyEvent.getCode() == KeyCode.ENTER) {
            value = dispArea.getText();
            secondInput = Float.parseFloat(value);

            switch (count) {
                case '+':
                    calculatedValue = firstInput + secondInput;
                    break;
                case '-':
                    calculatedValue = firstInput - secondInput;
                    break;
                case '*':
                    calculatedValue = firstInput * secondInput;
                    break;
                case '/':
                    calculatedValue = firstInput / secondInput;
                    break;
                default:
                    break;
            }

            dispArea.setText(String.format("%.2f", calculatedValue));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Methods
    public void getNine() {
        if (value.equals("") || value == null) {
            value = "9";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "9";
            dispArea.setText(value);
        }
    }

    public void getEight() {
        if (value.equals("") || value == null) {
            value = "8";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "8";
            dispArea.setText(value);
        }
    }

    public void getSeven() {
        if (value.equals("") || value == null) {
            value = "7";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "7";
            dispArea.setText(value);
        }
    }

    public void getSix() {
        if (value.equals("") || value == null) {
            value = "6";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "6";
            dispArea.setText(value);
        }
    }

    public void getFive() {
        if (value.equals("") || value == null) {
            value = "5";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "5";
            dispArea.setText(value);
        }
    }

    public void getFour() {
        if (value.equals("") || value == null) {
            value = "4";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "4";
            dispArea.setText(value);
        }
    }

    public void getThree() {
        if (value.equals("") || value == null) {
            value = "3";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "3";
            dispArea.setText(value);
        }
    }

    public void getTwo() {
        if (value.equals("") || value == null) {
            value = "2";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "2";
            dispArea.setText(value);
        }
    }

    public void getOne() {
        if (value.equals("") || value == null) {
            value = "1";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "1";
            dispArea.setText(value);
        }
    }

    public void getZero() {
        if (value.equals("") || value == null) {
            value = "0";
            dispArea.setText(value);
        } else {
            value = dispArea.getText() + "0";
            dispArea.setText(value);
        }
    }

}
