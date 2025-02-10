package java2.lesson2_1.Competitors;

public class Team {
    private String nameTeam;

    private Competitor[] teams;

    public Competitor[] getTeams() {
        return teams;
    }

    public Team(String nameTeam, Competitor... teams) {
        this.nameTeam = nameTeam;
        this.teams = teams;
    }
    public void showWinners(){
        for (Competitor c : teams){
            if (!c.isOnDistant()){
                c.info();
            }
        }
    }



}
