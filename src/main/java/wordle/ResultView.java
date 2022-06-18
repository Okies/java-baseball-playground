package wordle;

public class ResultView {

    private static StringBuilder sb = new StringBuilder();

    public ResultView(String s) {
        sb = new StringBuilder(s);
    }

    public static ResultView append(String sb2) {
        return new ResultView(sb.append(sb2).toString());
    }

    public void print() {
        System.out.println(sb.toString());
        sb.setLength(0);
    }
}
