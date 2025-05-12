import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args) {
        
        String[] questions = {
            "What is the square root of 64?",
            "Which gas do plants absorb from the atmosphere?",
            "Who wrote 'Romeo and Juliet'?",
            "Which organ in the human body is responsible for pumping blood?",
            "What year did World War II end?",
            "What is the currency of Japan?",
            "Which language is primarily spoken in Brazil?",
            "What is H2O commonly known as?",
            "Which planet is known as the Red Planet?",
            "What is the smallest prime number?"
        };
        
        String[][] options = {
            {"A. 6", "B. 7", "C. 8", "D. 9"}, // C
            {"A. Oxygen", "B. Nitrogen", "C. Carbon Dioxide", "D. Hydrogen"}, // C
            {"A. William Wordsworth", "B. Charles Dickens", "C. William Shakespeare", "D. Jane Austen"}, // C
            {"A. Brain", "B. Liver", "C. Heart", "D. Lungs"}, // C
            {"A. 1940", "B. 1945", "C. 1950", "D. 1939"}, // B
            {"A. Dollar", "B. Won", "C. Yen", "D. Peso"}, // C
            {"A. Spanish", "B. Portuguese", "C. French", "D. Italian"}, // B
            {"A. Hydrogen", "B. Salt", "C. Water", "D. Oxygen"}, // C
            {"A. Earth", "B. Venus", "C. Mars", "D. Mercury"}, // C
            {"A. 0", "B. 1", "C. 2", "D. 3"} // C
        };
        

        String[] answers = {"C", "C", "C", "C", "B", "C", "B", "C", "C", "C"};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************************************************");
        System.out.println("Welcome to the Quiz!");
        System.out.println("Please answer the following questions by typing the letter of your choice.\n");
        System.out.println("*************************************************************");
        System.out.println("You will be given 5 questions to answer. Each question has 4 options.");
        System.out.println("You will get 1 point for each correct answer.\n");

        System.out.println("*************************************************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toUpperCase();
            
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".\n");
            }
        }

        System.out.println("*************************************************************");
        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.length);
        System.out.println("Thank you for playing the Quiz!");
        System.out.println("*************************************************************");
        scanner.close();
    }
}
