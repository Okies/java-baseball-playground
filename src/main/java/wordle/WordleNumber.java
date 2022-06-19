package wordle;

import java.util.Random;

public class WordleNumber {

    private String number;

    WordleNumber() {
    }

    WordleNumber(String number) {
        this.number = number;
    }

    public void generateNumber() {

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        while (sb.length() < 3) {
            int a = random.nextInt(8) + 1;

            if (!sb.toString().contains(Integer.toString(a))) {
                sb.append(a);
            }
        }

        this.number = sb.toString();
    }

    public String toString() {
        return this.number;
    }

}
