package interfaceactivities;

public class AustralianFootBallGames implements TeamSport{

    private String firstTeamName;
    private String secondTeamName;
    private int firstTeamGoal = 0;
    private int secondTeamGoal = 0;
    private int firstTeamBehind = 0;
    private int secondTeamBehind = 0;

    public AustralianFootBallGames(String firstTeamName, String secondTeamName){
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
        this.firstTeamGoal = firstTeamGoal;
        this.secondTeamGoal = secondTeamGoal;
        this.firstTeamBehind = firstTeamBehind;
        this.secondTeamBehind = secondTeamBehind;
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
        this.firstTeamGoal += 1;
    }

    public void secondTeamGetGoal(){
        this.secondTeamGoal += 1;
    }

    public void firstTeamGetBehind(){
        this.firstTeamBehind += 1;
    }

    public void secondTeamGetBehind(){
        this.secondTeamBehind += 1;
    }

    @Override
    public int getFirstTeamScore(){
        return this.firstTeamGoal*6+ firstTeamBehind;
    }

    @Override
    public int getSecondTeamScore(){
        return this.secondTeamGoal*6+ secondTeamBehind;
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
