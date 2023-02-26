public abstract class Equipe {
    private String name;
    private int nbMatch;
    private int nbButsEncaisses;
    private int nbButsMarques;
    private int pointsEquipe;
    abstract int calculNbPoints(Match match);
    void calculNbButsEncaisses(){
        
    }

    public Equipe(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        this.name = name;
        this.nbMatch = nbMatch;
        this.nbButsEncaisses = nbButsEncaisses;
        this.nbButsMarques = nbButsMarques;
        this.pointsEquipe = pointsEquipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbMatch() {
        return nbMatch;
    }

    public void setNbMatch(int nbMatch) {
        this.nbMatch = nbMatch;
    }

    public int getNbButsEncaisses() {
        return nbButsEncaisses;
    }

    public void setNbButsEncaisses(int nbButsEncaisses) {
        this.nbButsEncaisses = nbButsEncaisses;
    }

    public int getNbButsMarques() {
        return nbButsMarques;
    }

    public void setNbButsMarques(int nbButsMarques) {
        this.nbButsMarques = nbButsMarques;
    }

    public int getPointsEquipe() {
        return pointsEquipe;
    }

    public void setPointsEquipe(int pointsEquipe) {
        this.pointsEquipe = pointsEquipe;
    }

    float calculMoyenneEncaisses(){
        float res = (float) getNbButsEncaisses() / getNbMatch();
        return res;
    }
    float calculMoyenneMarques(){
        float res = (float) getNbButsMarques() / getNbMatch();
        return res;
    }
    public void majSuiteAUnMatch(Match match){
        int ancienNbPoints = getPointsEquipe();
        int nbPointsMatch = calculNbPoints(match);
        setPointsEquipe(ancienNbPoints + nbPointsMatch);
        setNbMatch(getNbMatch()+1);
        setNbButsEncaisses(getNbButsEncaisses()+match.getScoreAdversaire());
        setNbButsMarques(getNbButsMarques()+match.getScoreEquipe());
    }
    public String restituerResultat(){
        String res = getName()+" nbPoints : "+getPointsEquipe()+
                " moyEncaissee :"+calculMoyenneEncaisses()+
                " moyMarques : "+calculMoyenneMarques();
        return res;
    }
}
