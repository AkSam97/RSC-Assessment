import java.util.Random;

public class RandomCPUGenerator {

    public static void main(String[] args) {

        String[] myElements = {"rock", "paper", "scissors"};

        Random rocOrPapOrSis = new Random();
        int numberChoice = rocOrPapOrSis.nextInt(myElements.length);
        String move = myElements[numberChoice];

        System.out.println(move);
    }
}