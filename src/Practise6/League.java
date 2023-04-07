package Practise6;


public abstract class League {
    String leagueName;

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }
}

class LeagueYouth extends League {

    public LeagueYouth(String leagueName) {
        super(leagueName);
    }

    @Override
    public String toString() {
        return leagueName;
    }

}

class LeagueAdult extends League {

    public LeagueAdult(String leagueName) {
        super(leagueName);
    }

    @Override
    public String toString() {
        return leagueName;
    }
}

class LeagueVeterans extends League {

    public LeagueVeterans(String leagueName) {
        super(leagueName);
    }

    @Override
    public String toString() {
        return leagueName;
    }
}