package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calculatorPlus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String calculatorMinus(int num1, int num2) {
        int min = num1 - num2;
        return num1 + " - " + num2 + " = " + min;
    }

    public String calculatorMultiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    public String calculatorDivide(Integer num1, Integer num2) {
       int divide = num1 / num2;
        return num1 + " / " + num2 + " = " + divide;

    }
}
