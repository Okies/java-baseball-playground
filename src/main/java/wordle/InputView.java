package wordle;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public InputView() {
    }

    static int nextInt() {
        return scanner.nextInt();
    }

    public static String getWordle() {
        return scanner.next();
    }

    private int getFlag() {
        return nextInt();
    }
}
