package com.case03.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculate {

    public double separateNumberAndOperator(String equation) {

        //Initialize the variable
        double[] numbers = new double[10];
        String[] groups = new String[10];
        double result = 0;
        int i = 0;
        int j = 0;

        // matchers
        Pattern patternNumber = Pattern.compile("[0-9\\.]+");
        Matcher matcherNumber = patternNumber.matcher(equation);
        Pattern pattern = Pattern.compile("[\\+\\-\\*\\/]+");
        Matcher matcher = pattern.matcher(equation);


        //separately store the numbers and operator to different arrays
        while (matcherNumber.find()) {
            double number = Double.parseDouble(matcherNumber.group());
            numbers[i] = number;
            i++;
        }

        while (matcher.find()) {
            String group = matcher.group();
            groups[j] = group;
            j++;
        }
        double calculatedResult = this.calculate(numbers, groups);
        return calculatedResult;
    }


    private double calculate(double[]numbers, String[] groups) {
        double result = 0;
        //calculate the result
        for (int k = 0; k < groups.length; k++) {
            if (k == 0) {
                result += numbers[k];
            }
            if (groups[k] == null) {
                continue;
            }
            if (groups[k].equals("+")) {
                result += numbers[k + 1];
            } else if (groups[k].equals("-")) {
                result -= numbers[k + 1];
            } else if (groups[k].equals("*")) {
                result *= numbers[k + 1];
            } else {
                result /= numbers[k + 1];
            }
        }
        return result;
    }

}
