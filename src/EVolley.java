public class EVolley extends Equipe {
    public EVolley(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res;
        res = match.scoreEquipe;
        return res;
    }
}
