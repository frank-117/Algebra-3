package Guia7;

public abstract class CalculatorAbstract {

    protected Calculator calculator = new Calculator() {
        @Override
        public double sum(double a, double b) {
            return a + b;
        }

        @Override
        public double subtraction(double a, double b) {
            return a - b;
        }

        @Override
        public double multiplication(double a, double b) {
            return a * b;
        }

        @Override
        public double division(double a, double b) {
            return a / b;
        }
    };
}
