public class EHand extends Equipe{

    public EHand(Sport sport, String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(sport, name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res;
        if (match.getScoreAdversaire() > match.getScoreEquipe()){
            res = 0;
        }
        else if (match.getScoreEquipe() == match.getScoreAdversaire()){
            res = 1;
        }
        else {
            res = 2;
        }
        return res;
    }
}
