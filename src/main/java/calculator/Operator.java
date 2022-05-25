package calculator;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {

    PLUS("+", (a, b) -> a + b),
    MINUS("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b);

    private final String operator;
    private final BiFunction<Double, Double, Double> func;

    Operator(String operator, BiFunction<Double, Double, Double> func) {
        this.operator = operator;
        this.func = func;
    }

    public double compute(double a, double b) {
        return this.func.apply(a, b);
    }

    public String getOperator() {
        return operator;
    }

    private static final Map<String, Operator> OPERATOR_MAP = Stream.of(values()).collect(Collectors.toMap(Operator::getOperator, Function.identity()));

    public static Operator find(String operator) {
        return OPERATOR_MAP.get(operator);
    }

    public static boolean contains(String operator) {
        return OPERATOR_MAP.containsKey(operator);
    }

}