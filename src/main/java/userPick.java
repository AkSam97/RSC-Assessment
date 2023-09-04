import java.util.Scanner;

public class userPick {

    private String userPick;
    Scanner user_input = new Scanner(System.in);

    public void setUser_input() {
        System.out.println("Rock, Paper, Scissors?");
        this.userPick = user_input.next();
    }
    public String getUserPick (){
        return userPick;
    }
}

