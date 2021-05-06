package Exercises.Java;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){ return firstNumber;}
    public double getSecondNumber(){ return secondNumber;}
    public void setFirstNumber(double d){ firstNumber = d;}
    public void setSecondNumber(double d){ secondNumber = d;}

    public double getAdditionResult(){ return firstNumber + secondNumber;}
    public double getSubtractionResult(){return firstNumber - secondNumber;}
    public double getMultiplicationResult(){return firstNumber * secondNumber;}
    public double getDivisionResult(){return (secondNumber == 0) ? 0 : firstNumber/secondNumber;}
}
