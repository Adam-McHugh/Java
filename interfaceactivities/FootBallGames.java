package interfaceactivities;

public class FootBallGames implements TeamSport{

    private String firstTeamName;
    private String secondTeamName;
    private int firstTeamScore = 0;
    private int secondTeamScore = 0;

    public FootBallGames(String firstTeamName, String secondTeamName){
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    @Override
    public String getFirstTeamName(){
        return  this.firstTeamName;
    }

    @Override
    public String getSecondTeamName(){
        return this.secondTeamName;
    }

    public void firstTeamGetGoal(){
        this.firstTeamScore += 1;
    }

    public void secondTeamGetGoal(){
        this.secondTeamScore += 1;
    }


    @Override
    public int getFirstTeamScore(){
        return this.firstTeamScore;
    }

    @Override
    public int getSecondTeamScore(){
        return this.secondTeamScore;
    }

    @Override
    public String getWinner(){
        if (getFirstTeamScore() > getSecondTeamScore()){
            return getFirstTeamName();
        }
        else if (getFirstTeamScore() == getSecondTeamScore()) {
            return "draw";
        }
        else{
            return getSecondTeamName();
        }
    }

    public void toStringCurrent(){
        System.out.printf("%s\'s score is %d and %s\'s score is %d.%n" , getFirstTeamName(), getFirstTeamScore(), getSecondTeamName(), getSecondTeamScore());
    }

    public void toStringFinal(){
        System.out.printf("%s\'s score is %d and %s\'s score is %d. " , getFirstTeamName(), getFirstTeamScore(), getSecondTeamName(), getSecondTeamScore());
        if (getWinner() == "draw"){
            System.out.println("The game ends in a draw.");
        }
        else{
            System.out.printf("The winner is %s.%n", getWinner());
        }
    }

}
