import java.util.Random;
import java.util.Scanner;

public class Number_game 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int random_num, guessed_num, attempts_left, rounds_won=0, rounds_played=0;
        String play_again = "y";

        

        while(play_again.equals("y"))
        {
            random_num = r.nextInt(100) + 1;

            rounds_played++;
            System.out.println("\t \t \t \t \t     Round : "+rounds_played);

            attempts_left=10;
            System.out.print("Guess a number between 1 to 100 !! You have 10 attempts available : ");

            while(attempts_left!=0)
            {
                guessed_num = sc.nextInt();
                
                if(guessed_num == random_num)
                {
                    System.out.println(">>>> you won<<<<");
                    rounds_won++;
                    break;
                }
                else if(guessed_num > random_num)
                {
                    System.out.println("guessed number is too high");
                }
                else
                {
                    System.out.println("guessed number is too low");
                }
                attempts_left--;
                if(attempts_left == 0)
                {
                    System.out.println("You Loose");
                }
                else
                {
                    System.out.print("You have "+attempts_left+" attempts left  try again : ");
                }
            }
            System.out.println("rounds played : "+rounds_played+"\t Rounds won : "+rounds_won+"\t rounds loose : "+(rounds_played-rounds_won));
            System.out.print("Do you want to play again? (y/n) : ");
            play_again=sc.next();
        }
        sc.close();
    }
}
