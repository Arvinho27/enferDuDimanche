public class Equipe {
    String name;
    int nbMatch;
    int nbButsEncaisses;
    int nbButsMarques;
    int calculNbPoints(Match match){
        return 0;
    }

    public Equipe(String name) {
        this.name = name;
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
