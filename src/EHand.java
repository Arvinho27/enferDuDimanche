public class EHand extends Equipe{

    public EHand(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res;
        if (match.ScoreAdversaire > match.scoreEquipe){
            res = 0;
        }
        else if (match.ScoreAdversaire == match.scoreEquipe){
            res = 1;
        }
        else res = 2;
        return res;
    }
}
