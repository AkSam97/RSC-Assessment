public class game {
    public void playGame(userPick inGameUser) {
        String[] myElements = {"rock", "paper", "scissors"};

        String outcome1 = "Winner";
        String outcome2 = "You suck";
        String outcome3 = "Draw Try your luck again";

        for (int i = 0; i < myElements.length; i++) {
            if (i == 0 && get.randomCPUGenerator == "scissors"
                    || i == 1 && get.randomCPUGenerator == "Rock"
                    || i == 2 && get.randomCPUGenerator == "paper") {
                System.out.println(outcome1); //win possibilities
            } else if {
                (i == 0 && get.randomCPUGenerator == "scissors"
                        || i == 1 && get.randomCPUGenerator == "Rock"
                        || i == 2 && get.randomCPUGenerator == "paper") {
                    System.out.println(outcome2); //lose possibilities
                } else if {
                    (i == 0 && get.randomCPUGenerator == "scissors"
                            || i == 1 && get.randomCPUGenerator == "Rock"
                            || i == 2 && get.randomCPUGenerator == "paper") {
                        System.out.println(outcome3); //draw possibilities
                    } else{
                        System.out.println("That input is not valid");

                    }
                }

            }
        }
    }
}