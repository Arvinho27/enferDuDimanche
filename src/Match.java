public class Match {
    private int scoreEquipe;
    private int scoreAdversaire;

    public Match(int scoreEquipe, int scoreAdversaire) {
        this.scoreEquipe = scoreEquipe;
        this.scoreAdversaire = scoreAdversaire;
    }

    public int getScoreEquipe() {
        return scoreEquipe;
    }

    public int getScoreAdversaire() {
        return scoreAdversaire;
    }

    public void setScoreEquipe(int scoreEquipe) {
        this.scoreEquipe = scoreEquipe;
    }

    public void setScoreAdversaire(int scoreAdversaire) {
        this.scoreAdversaire = scoreAdversaire;
    }
}
