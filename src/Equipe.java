//TODO:ajouter un attribut type de sport(Enum) => possibiliter de faire des switch/case...
public abstract class Equipe {
    private Sport sport;
    private String name;
    private int nbMatch;
    private int nbButsEncaisses;
    private int nbButsMarques;
    private int pointsEquipe;

    public Equipe(Sport sport, String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        this.sport = sport;
        this.name = name;
        this.nbMatch = nbMatch;
        this.nbButsEncaisses = nbButsEncaisses;
        this.nbButsMarques = nbButsMarques;
        this.pointsEquipe = pointsEquipe;
    }
    public String getName() {
        return name;
    }

    abstract int calculNbPoints(Match match);

    private float calculMoyenneEncaisses(){
        return (float) nbButsEncaisses / nbMatch;
    }

    private float calculMoyenneMarques(){
        return (float) nbButsMarques / nbMatch;
    }

    public void majSuiteAUnMatch(Match match){
        pointsEquipe=pointsEquipe + calculNbPoints(match);
        nbMatch=nbMatch+1;
        nbButsEncaisses=nbButsEncaisses+match.getScoreAdversaire();
        nbButsMarques=nbButsMarques+match.getScoreEquipe();
        System.out.println("Match equipe "+name+" score:"+match.getScoreEquipe()+"-"+match.getScoreAdversaire());
    }

    public String restituerResultat(){
        return name+"\t"+"nbPoints : "+pointsEquipe+"\t"+
                "nbButsMarques : "+nbButsMarques+"\t"+
                "moyMarques : "+calculMoyenneMarques()+"\t"+
                "nbButsEncaisses : "+nbButsEncaisses+"\t"+
                "moyEncaissee : "+calculMoyenneEncaisses();
    }

}
