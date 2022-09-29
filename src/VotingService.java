public class VotingService {
    public void statics(Question question, Student[] students) {
        int[] calc = {0, 0, 0, 0};
        System.out.println(question);
        for (Student student : students) {
            String[] ans = student.generateAnswer(question);
            System.out.print(student);
            System.out.print("  Answer: ");
            for (String an : ans) {
                System.out.print(an);
                switch (an) {
                    case "A" -> calc[0]++;
                    case "B" -> calc[1]++;
                    case "C" -> calc[2]++;
                    case "D" -> calc[3]++;
                }

            }
            System.out.println("]");
        }
        System.out.println("--------------------  Polls  --------------------------");
        System.out.println("Number of A: " + calc[0]);
        System.out.println("Number of B: " + calc[1]);
        System.out.println("Number of C: " + calc[2]);
        System.out.println("Number of D: " + calc[3]);
        System.out.println("=======================================================");
    }
}
