public class Efutsal extends EFoot{

    public Efutsal(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res = super.calculNbPoints(match);
        if (match.scoreEquipe >= 5){
            res += 1;
        }
        return res;
    }
}
