public class EVolley extends Equipe {
    public EVolley(Sport sport, String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(sport, name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res;
        res = match.getScoreEquipe();
        return res;
    }
}
