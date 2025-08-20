public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   int randomNumber = (int) (Math.random() * 10) + 1;
   int attempts = 0;
   
   System.out.println("Welcome to the Number Guessing Game!");
   System.out.println("I have selected a number between 1 and 10.");
   System.out.println("Can you guess what it is?");
   
   int guess = scanner.nextInt();
   attempts++;

   while (guess != randomNumber) {
      if (guess < randomNumber) {
         System.out.println("Too low! Try a higher number:");
      } else {
         System.out.println("Too high! Try a lower number:");
      }
      guess = scanner.nextInt();
      attempts++;
   }
   
   if (guess == randomNumber) {
      System.out.println("Congratulations! You guessed correctly!");
      System.out.println("It took you " + attempts + " attempts to guess the number.");
      if (attempts == 1) {
         System.out.println("Amazing! You got it on your first try!");
      } else if (attempts <= 3) {
         System.out.println("Great job! That was quick!");
      } else {
         System.out.println("Keep practicing to improve your guessing skills!");
      }
   }

   scanner.close();
}