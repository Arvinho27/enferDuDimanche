public class ERugby extends EFoot{

    public ERugby(Sport sport, String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(sport, name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res = super.calculNbPoints(match);
        if (match.getScoreEquipe() >= 30){
            res += 1;
        }
        if (match.getScoreAdversaire() <= 10){
            res += 1;
        }
        return res;
    }
}
