package onboarding;

public class Problem4 {

    public static final int A = 65;
    public static final int a = 97;

    public static String solution(String word) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char digit = word.charAt(i);

            if (isBlank(digit)) {
                stringBuilder.append(" ");
                continue;
            }

            if (isLowerCase(digit)) {
                stringBuilder.append((char) (219 - digit));
            } else if (isUpperCase(digit)) {
                stringBuilder.append((char) (155 - digit));
            }
        }

        return stringBuilder.toString();
    }

    private static boolean isBlank(char digit) {
        return digit == ' ';
    }

    private static boolean isLowerCase(char digit) {
        return digit >= a;
    }

    private static boolean isUpperCase(char digit) {
        return digit >= A;
    }
}
