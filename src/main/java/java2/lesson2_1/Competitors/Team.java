package java2.lesson2_1.Competitors;

public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4];


    public Team(String teamName, Competitor[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public Competitor[] getTeamMembers() {
        return teamMembers;
    }

    public void showResults(){
        for (Competitor competitor: teamMembers){
            competitor.info();
        }
    }
    public void showMembersFinishedCourse(){
        for (Competitor competitor: teamMembers){
            if(competitor.isOnDistant())
                competitor.info();
        }
    }

}
