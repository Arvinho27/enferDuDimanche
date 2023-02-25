public class ERugby extends EFoot{

    public ERugby(String name) {
        super(name);
    }
    @Override
    int calculNbPoints(Match match){
        int res = super.calculNbPoints(match);
        if (match.scoreEquipe >= 30){
            res += 1;
        }
        if (match.ScoreAdversaire <= 10){
            res += 1;
        }
        return res;
    }
}
