import java.util.*;

public class Championnat {
    Equipe equipe;

    int nbPointsEquipe;

    public Championnat(Equipe equipe, int nbPointsEquipe) {
        this.equipe = equipe;
        this.nbPointsEquipe = nbPointsEquipe;
    }
    int calculPointsChampionnat(Match match){
        int res=0;
        res += equipe.calculNbPoints(match);
        return res;
    }


}
