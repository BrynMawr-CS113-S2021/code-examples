public class MathQuizPoly {
    public static void main(String[] args) {

        int numTurns = 5;
        Question[] questions = new Question[numTurns];
        for (int i = 0; i < numTurns; i++) {
            int dice = (int) (Math.random() * 3);
            if (dice == 0) {
                questions[i] = new AddQuestion();
            }
            else if (dice == 1) {
                questions[i] = new SubQuestion();
            }
            else if (dice == 2) {
                questions[i] = new MulQuestion();
            }
        }

        int numCorrect = 0;
        for (int i = 0; i < numTurns; i++) {
            
            Question question = questions[i];
            System.out.println(question.display());
            System.out.print("Answer: ");
            int userAnswer = Integer.parseInt(System.console().readLine());

            int answer = question.answer();
            if (userAnswer == answer) {
                System.out.println("Correct!");
                numCorrect++;
            }
            else {
                System.out.println("Incorrect!");
            }
        }

        System.out.printf("You got %d out of %d correct!\n", numCorrect, numTurns);
    }
}
