package calculator;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpressionParser {

    private final String EXPRESSION_PATTERN = "^\\d+( [\\+|\\-|\\*|/|] \\d+)+$";
    private final String SPLIT_REGEX = " ";
    private List<String> stringList;

    public boolean valid(String expr) {
        return Pattern.matches(EXPRESSION_PATTERN, expr);
    }

    public ExpressionParser parseExpr(String expr) {
        stringList = Stream.of(expr.split(SPLIT_REGEX)).collect(Collectors.toList());

        return this;
    }

    public Iterator<String> getIterator() {
        return stringList.iterator();
    }

}
