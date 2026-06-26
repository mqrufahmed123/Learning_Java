import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What lang?",
                                    "1. Java", "2. Cpp",
                                    "3. python", "4. js",
                                    "1");
        
        questions[1] = new Question(1, "What lang?",
                                    "1. Java", "2. Cpp",
                                    "3. python", "4. js",
                                    "1");
        
        questions[2] = new Question(1, "What lang?",
                                    "1. Java", "2. Cpp",
                                    "3. python", "4. js",
                                    "1");
        
        questions[3] = new Question(1, "What lang?",
                                    "1. Java", "2. Cpp",
                                    "3. python", "4. js",
                                    "1");
        
        questions[4] = new Question(1, "What lang?",
                                    "1. Java", "2. Cpp",
                                    "3. python", "4. js",
                                    "1");
        
    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            
            Scanner sc  = new Scanner(System.in);
            selection[i++] = sc.nextLine();
        }

        // for(String s : selection){
        //     System.out.println(s);
        // }

        printScore();
    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String actualAns = que.getAnswer();
            String usrAns = selection[i];
            if(actualAns.equals(usrAns)){
                score++;
            }
        }
        System.out.println("Your score is: "+  score);
    }
}
