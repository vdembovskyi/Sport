public class Main {

    public static void main(String[] args) {
        Team1 team1 = new Team1("name1", 45, true);
        Team1 team2 = new Team1("name2", 30, true);
        League<Team1> league = new League<>("Name");
        league.addTeam(team1);

        league.addTeam(team2);
        league.printInOrder();

    }
}
