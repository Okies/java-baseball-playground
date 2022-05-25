package calculator;

import java.util.Iterator;

public class CalCulator {

    private final ExpressionParser expressionParser;
    private Operator operator;

    public CalCulator() {
        this.expressionParser = new ExpressionParser();
    }

    public double calculate(String expr) {

        Iterator<String> iterator = expressionParser.parseExpr(expr);

        double result = Double.parseDouble(iterator.next());

        while (iterator.hasNext()) {
            String value = iterator.next();

            if (Operator.contains(value))
                operator = Operator.find(value);
            else
                result = operator.compute(result, Double.parseDouble(value));
        }

        return result;
    }

}
