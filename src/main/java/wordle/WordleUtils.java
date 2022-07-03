package wordle;

public class WordleUtils {
    private static final int MIN_NO = 1;
    private static final int MAX_NO = 9;

    public static boolean validateRange(int num) {
        return num >= MIN_NO && num <= MAX_NO;
    }
}
