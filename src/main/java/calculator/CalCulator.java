package calculator;

import java.util.Iterator;

public class CalCulator {

    private final ExpressionParser expressionParser = new ExpressionParser();
    private Operator operator;

    public double calculate(String expr) {

        Iterator<String> iterator = expressionParser.parseExpr(expr).getIterator();

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
