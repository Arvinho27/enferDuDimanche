public class Equipe {
    String name;
    int nbMatch;
    int nbButsEncaisses;
    int nbButsMarques;
    int PointsEquipe;
    int calculNbPoints(Match match){
        return 0;
    }
    void calculNbButsEncaisses(){
        
    }

    public Equipe(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        this.name = name;
        this.nbMatch = nbMatch;
        this.nbButsEncaisses = nbButsEncaisses;
        this.nbButsMarques = nbButsMarques;
        PointsEquipe = pointsEquipe;
    }

    float calculMoyenneEncaisses(int nbMatch, int nbButsEncaisses){
        float res = (float) nbMatch / nbButsEncaisses;
        return res;
    }
    float calculMoyenneMarques(int nbMatch, int nbButsMarques){
        float res = (float) nbMatch / nbButsMarques;
        return res;
    }
}
