import java.util.Arrays;
import java.util.Dictionary;

public class Question {
    private final int No;
    private final String type;
    private final String question;
    private final String answer;
    private final String[] candidates;

    /* Used for judging and not used now */
    // private String answer;

    public Question(int No, String type, String question, String right, String[] candidates) {
        this.No = No;
        this.type = type;
        this.question = question;
        this.answer = right;
        this.candidates = candidates;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {

        return "Question " + No +
                " (" + type + "): \n" +
                 question + "\n" +
                "A. " + candidates[0] + "\n" +
                "B. " + candidates[1] + "\n" +
                "C. " + candidates[2] + "\n" +
                "D. " + candidates[3] + "\n" +
                "\nRight answer: " + answer + "\n" +
                "-----------------  Students' Answer  -------------------";
    }
}
