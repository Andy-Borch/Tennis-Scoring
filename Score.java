import java.util.Scanner;

public class Score {

    public static void print() {
        //All print statements for program

        //Creating both players
        Player home = new Player("");
        Player away = new Player("");

        System.out.println("Welcome to Tennis Score Keeper!" +"\n");

        //Getting player names from input
        System.out.println("Enter home player's name");
        home.setName();

        System.out.println("Enter away player's name");
        away.setName();
        System.out.println();

        //Formatting scoreboard
        String homeName = String.format("%-12s", home.getName());
        String awayName = String.format("%-12s", away.getName());

        System.out.println("H: " + homeName + " " + home.getMatchScore() +
                " " + home.getSetScore() + " " + home.getGameScore());

        System.out.println("A: " + awayName + " " + away.getMatchScore() +
                " " + away.getSetScore() + " " + away.getGameScore());

        //Prompt user for who won each point
        System.out.println("Press 'H' if the home player won the point, or 'A' if the away player won the point");
        Scanner pointScnr = new Scanner(System.in);
        
        if(pointScnr.next() == "a" || pointScnr.next() == "A"){
            if(home.getGameScore() == 0){
                home.setGameScore(15);
            }
            //away.setGameScore();
        } else if(pointScnr.next() == "H" || pointScnr.next() == "h"){
            //home.setGameScore();
        }
        System.out.println("H: " + homeName + " " + home.getMatchScore() +
                " " + home.getSetScore() + " " + home.getGameScore());
        System.out.println("A: " + awayName + " " + away.getMatchScore() +
                " " + away.getSetScore() + " " + away.getGameScore());

    }
}
