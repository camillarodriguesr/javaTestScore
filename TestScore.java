/*Name: Camilla Rodrigues dos Santos 
CS IS 112 #1032

This program will ask the user to input the score for five tests and, then will calculate 
the average grade of the five testes and which grade the user will have. Lastly, the program output 
all the five scores values, the average score and the average grade.

Create 
Display"Please enter test score number 1"
Ask score1
Display"Please enter test score number 2"
Ask score2
Display"Please enter test score number 3"
Ask score3
Display"Please enter test score number 4"
Ask score4
Display "Please enter test score number 5"
Ask score5

CALL METHOD printAverage()

-----------------------------------------------------------------------------------------------------------

Method calcAverage()
Create average;
average = (score1 + score2+ score3 + score4 + score5) / 5;

Method determineGrade()
Create gradeLetter;
if (score >=90)
gradeLetter = "A"
else if( score >= 80)
gradeLetter = "B"
else if (score >=70)
gradeLetter = "C"
else if (score >= 60)
gradeLetter = "D"
else if (score < 60)
gradeLetter = "F"

Method printAverage()
Display"Average score is ",calcAverage()
Display"Average grade is ",determineGrade()
*/

import java.util.Scanner;

public class TestScore
{
   public static void main (String [] args)
    {
      int score1, score2, score3, score4, score5;
      double average;
      String gradeLetter;
            
      Scanner keyboard = new Scanner (System.in);
    
      System.out.print("Please enter test score number 1\n");
      score1 = keyboard.nextInt();
      System.out.print("Please enter test score number 2\n");
      score2 = keyboard.nextInt();
      System.out.print("Please enter test score number 3\n");
      score3 = keyboard.nextInt();
      System.out.print("Please enter test score number 4\n");
      score4 = keyboard.nextInt();
      System.out.print("Please enter test score number 5\n");
      score5 = keyboard.nextInt();
    
      System.out.print("Test 1 grade is "+ determineGrade(score1)+ "\n"+
                       "Test 2 grade is "+ determineGrade(score2)+ "\n" +
                       "Test 3 grade is "+ determineGrade(score3)+ "\n" +
                       "Test 4 grade is "+ determineGrade(score4)+ "\n" +
                       "Test 5 grade is "+ determineGrade(score5)+ "\n");
    
      printAverage(score1, score2, score3, score4, score5);
    }
  
   public static double calcAverage(int score1, int score2, int score3, int score4, int score5)
    {
      double average;
      average = (score1 + score2 + score3 + score4 + score5) / 5.0;
      return average;
    }
    
   public static String determineGrade(int score)
    {
      String gradeLetter = "";
      if (score >= 90)
       {
         gradeLetter = "A";
       }
      else if (score >=80)
       {
         gradeLetter = "B";
       }
      else if (score >=70)
       {
         gradeLetter = "C";
       }
      else if (score >=60)
       {
         gradeLetter = "D";
       }
      else if (score < 60)
       {
         gradeLetter = "F";
       }
    return gradeLetter;
    }
    
    public static void printAverage(int score1, int score2, int score3, int score4, int score5)
     {
         double average = calcAverage(score1, score2, score3, score4, score5);
         System.out.print("Average score is " + average + "\n");
         System.out.print("Average grade is " + determineGrade((int)average));
     }
    
    

    
}