public class EHand extends Equipe{

    public EHand(String name, int nbMatch, int nbButsEncaisses, int nbButsMarques, int pointsEquipe) {
        super(name, nbMatch, nbButsEncaisses, nbButsMarques, pointsEquipe);
    }

    @Override
    int calculNbPoints(Match match){
        int res;
        if (match.getScoreAdversaire() > match.getScoreEquipe()){
            res = 0;
        }
        else if (match.getScoreEquipe() == match.getScoreEquipe()){
            res = 1;
        }
        else {
            res = 2;
        }
        return res;
    }
}
