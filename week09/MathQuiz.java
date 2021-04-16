public class MathQuiz {    
    public static void main(String[] args) {

        int numTurns = 5;
        int numCorrect = 0;
        for (int i = 0; i < numTurns; i++) {
            int value1 = (int) (Math.random()*10 + 1);
            int value2 = (int) (Math.random()*10 + 1);

            System.out.printf("%d + %d = ?\n", value1, value2);
            System.out.print("Answer: ");
            int userAnswer = Integer.parseInt(System.console().readLine());

            int answer = value1 + value2;
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
