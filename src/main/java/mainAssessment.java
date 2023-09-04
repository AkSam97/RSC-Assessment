public class mainAssessment {

    public static void main(String[] args) {

        userPick user = new userPick();
        game game = new game();

        user.setUser_input();

        game.playGame(user);
    }
}








