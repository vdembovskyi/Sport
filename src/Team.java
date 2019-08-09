public abstract class Team implements Comparable<Team> {
    private String name;
    private int numberOfPoints;
    private boolean isLeague;

    public Team(String name, int numberOfPoints, boolean isLeague) {
        this.name = name;
        this.numberOfPoints = numberOfPoints;
        this.isLeague = isLeague;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public boolean isLeague() {
        return isLeague;
    }

    public void setLeague(boolean league) {
        isLeague = league;
    }

    @Override
    public int compareTo(Team tTeam) {
        if (tTeam.getNumberOfPoints() < this.numberOfPoints) {
            return 0;
        } else {
            return -1;
        }
    }

}
