public class SimulationDriver {
    public static void main(String[] args)
    {
        VotingService vs = new VotingService();
        Student[] students = getStudents();
        Question[] questions = getQuestions();
        for (Question question : questions) {
            vs.statics(question, students);
        }
    }
    public static Student[] getStudents() {
        Student[] students = new Student[Data.num_of_students];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
        return students;
    }
    public static Question[] getQuestions() {
        Question[] questions = new Question[Data.num_of_questions];
        int i = 0;
        String[] ques1 = {"Yes", "No", "Yes to all", "No to All"};
        String[] ques2 = {"Yes", "No", "Yes to all", "No to All"};
        String[] ques3 = {"A A B B", "A A", "B B", "A B B A"};
        String[] ques4 = {"Inheritance", "Polymorphism ", "Encapsulation", "Abstract"};
        String[] ques5 = {"Variables", "Abstract Method ", "Public Methods", "Virtual Method"};
        questions[i++] = new Question(1, "Single", "Is every class own a constructor?", "A", ques1);
        questions[i++] = new Question(2, "Single", "Do all classes have to define a constructor?", "D", ques2);
        questions[i++] = new Question(3, "Single", "A is the base class of B, what is the order of their constructor and destructor calls?", "D", ques3);
        questions[i++] = new Question(4, "Multiple", "Which of the following are object-oriented features?", "ABC", ques4);
        questions[i] = new Question(5, "Multiple", "Which of the following interfaces cannot be included?", "AD",ques5);
        return questions;
    }
}