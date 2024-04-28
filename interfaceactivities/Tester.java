package interfaceactivities;

public class Tester {
    public static void main(String[] args){

        // test FootballGames
        FootBallGames today_game_1 = new FootBallGames("Melbourne", "Tasmania");
        System.out.printf("Welcome to the game today. Our two teams are %s and %s. %n",
                today_game_1.getFirstTeamName(), today_game_1.getSecondTeamName());
        System.out.print("The current result is: ");
        today_game_1.toStringCurrent();

        today_game_1.firstTeamGetGoal();
        System.out.printf("%s just scores 1 goal.%n", today_game_1.getFirstTeamName());
        System.out.print("The current result is: ");
        today_game_1.toStringCurrent();

//        today_game_1.firstTeamGetGoal();
//        System.out.printf("%s just scores 1 goal.%n", today_game_1.getFirstTeamName());
//        System.out.print("The current result is: ");
//        today_game_1.toStringCurrent();

        today_game_1.secondTeamGetGoal();
        System.out.printf("%s just scores 1 goal.%n", today_game_1.getSecondTeamName());
        System.out.print("The current result is: ");
        today_game_1.toStringCurrent();


        System.out.print("The final result is: ");
        today_game_1.toStringFinal();



        // test AustralianFootballGames
        AustralianFootBallGames today_game_2 = new AustralianFootBallGames("Melbourne", "Tasmania");
        System.out.printf("Welcome to the game today. Our two teams are %s and %s. %n",
                today_game_2.getFirstTeamName(), today_game_2.getSecondTeamName());
        System.out.print("The current result is: ");
        today_game_2.toStringCurrent();

        today_game_2.firstTeamGetGoal();
        System.out.printf("%s just scores 1 goal.%n", today_game_2.getFirstTeamName());
        System.out.print("The current result is: ");
        today_game_2.toStringCurrent();

        today_game_2.firstTeamGetGoal();
        System.out.printf("%s just scores 1 goal.%n", today_game_2.getFirstTeamName());
        System.out.print("The current result is: ");
        today_game_2.toStringCurrent();

        today_game_2.secondTeamGetGoal();
        System.out.printf("%s just scores 1 goal.%n", today_game_2.getSecondTeamName());
        System.out.print("The current result is: ");
        today_game_2.toStringCurrent();


        today_game_2.secondTeamGetBehind();
        System.out.printf("%s just scores 1 goal.%n", today_game_2.getSecondTeamName());
        System.out.print("The current result is: ");
        today_game_2.toStringCurrent();

        System.out.print("The final result is: ");
        today_game_2.toStringFinal();
    }
}

