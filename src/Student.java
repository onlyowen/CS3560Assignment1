import java.util.Arrays;
import java.util.Dictionary;
import java.util.Random;

public class Student {
    Random random = new Random();
    private final String ID;
    private final String name;

    public Student() {
        this.name = Data.names[random.nextInt(0, 569)];
        this.ID = String.valueOf(random.nextInt(10000, 30000));
    }

    public String[] generateAnswer(Question question) {
        if (question.getType().equals("Single")) {
            return new String[]{Data.candidates[random.nextInt(0,4)]};
        }
        else if (question.getType().equals("Multiple")) {
            int num_of_ans = random.nextInt(1,5);
            String[] ans = new String[num_of_ans];
            for (int i = 0; i < num_of_ans; i++) {
                String one = Data.candidates[random.nextInt(0,4)];
                while (Data.contained(ans, one)) {
                    one = Data.candidates[random.nextInt(0,4)];
                }
                ans[i] = one;
            }
            Arrays.sort(ans);
            return ans;
        }
        return new String[0];
    }

    @Override
    public String toString() {
        return "Student[" +
                "ID:" + ID + " \t" +
                "Name:" + name + " \t";
    }
}
