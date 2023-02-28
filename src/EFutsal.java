public class EFutsal extends EFoot{


    public EFutsal(Sport sport, String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(sport, name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res = super.calculNbPoints(match);
        if (match.getScoreEquipe() >= 5){
            res += 1;
        }
        return res;
    }
}
