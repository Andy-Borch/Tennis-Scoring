import java.util.Scanner;

public class Player {
    String name;
    int gameScore;
    int setScore = 0;
    int matchScore = 0;

    public Player(String name, int gameScore, int setScore, int matchScore ){
        this.name = name;
        this.gameScore = gameScore;
        this.setScore = setScore;
        this. matchScore = matchScore;
    }

    public Player(String name){
        //Probably will use this one the most
        // user will input name and home an away
        //score is defaulted to 0-0, 0-0 love all
        this.name = name;

    }

    public String getName(){
        return name;
    }

    /*public String getLocation(){
        return location;
    }*/

    public int getGameScore(){
        return gameScore;
    }

    public int getSetScore(){
        return setScore;
    }

    public int getMatchScore() {
        return matchScore;
    }

    public void setName(){
        Scanner nameScnr = new Scanner(System.in);
        name = nameScnr.nextLine();
    }

   /* public void setLocation(){
        Scanner locScnr = new Scanner(System.in);
        String loc = locScnr.next().toLowerCase();
        if(loc == "a"){
            loc = "away";
        }
        else if(loc == "h"){
            loc = " at home";
        }
        //System.out.println(loc);
        location = loc;

    }*/

    public void setGameScore(int score){
        gameScore = score;
        /*if(gameScore == 0){
            gameScore += 15;
        } else if(gameScore == 15){
            gameScore += 15;
        } else if (gameScore == 30){
            gameScore = 40;
        } else if (gameScore == 40){
            gameScore = 0;
            setScore = 1;
        }*/

    }

    public void setSetScore(){

    }

    public void setMatchScore(){

    }


}
