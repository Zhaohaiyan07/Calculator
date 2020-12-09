package com.case03.controller;

import com.case03.model.Calculate;

public class CalculateController {

    private boolean isDecimalPointClicked = false;
    private boolean isOperatorClicked = false;
    Calculate calculate = new Calculate();
    StringBuilder numberDisplayOnLabel = new StringBuilder();
    StringBuilder equation = new StringBuilder();


    public String handle(String button) {
        if (button.equals("+") || button.equals("-") || button.equals("*") || button.equals("/")) {
            concatEquation(button);
            setOperatorClicked(true);
            return "";

        } else if (button.equals(".")) {
            char[] chars = numberDisplayOnLabel.toString().toCharArray();
            char lastChar = chars[chars.length - 1];
            if (lastChar == '.') {
                return numberDisplayOnLabel.toString();
            }
            concatEquation(button);
            setDecimalPointClicked(true);
            return displayOnLabel(button);

        } else if (button.equals("C")) {
            return clearDisplay();

        } else if (button.equals("=")) {
            if (isDecimalPointClicked == false) {
                int calculatedResult = (int) calculate.separateNumberAndOperator(equation.toString());
                return Integer.toString(calculatedResult);
            } else {
                double calculatedResult = calculate.separateNumberAndOperator(equation.toString());
                isDecimalPointClicked = false;
                return Double.toString(calculatedResult);
            }
        } else { //if clicked on button 0-9

            if (isOperatorClicked == true) {
                concatEquation(button);
                numberDisplayOnLabel.delete(0, numberDisplayOnLabel.length()); //clear the content show on label
                setOperatorClicked(false); //set the isOperatorClicked to false,so when the next number is clicked,it will show on the label and append to the equation
                return displayOnLabel(button);
            } else {
                if (button.equals("0")) {
                    if (numberDisplayOnLabel.toString().equals("0")) {
                        return numberDisplayOnLabel.toString();
                    }
                }
                concatEquation(button);
                return displayOnLabel(button);
            }
        }
    }

    public void concatEquation(String s) {
        equation.append(s);
        System.out.println(equation);
    }

    public String displayOnLabel(String s) {
        numberDisplayOnLabel.append(s);
        return numberDisplayOnLabel.toString();
    }

    public String clearDisplay() {
        equation.delete(0, equation.length());
        numberDisplayOnLabel.delete(0, numberDisplayOnLabel.length());
        return numberDisplayOnLabel.toString();
    }


    public boolean isDecimalPointClicked() {
        return isDecimalPointClicked;
    }

    public void setDecimalPointClicked(boolean decimalPointClicked) {
        isDecimalPointClicked = decimalPointClicked;
    }

    public boolean isOperatorClicked() {
        return isOperatorClicked;
    }

    public void setOperatorClicked(boolean operatorClicked) {
        isOperatorClicked = operatorClicked;
    }


}
