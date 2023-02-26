public class Championnat {
    private EFoot eFoot;
    private EHand eHand;
    private EFutsal eFutsal;
    private EVolley eVolley;
    private ERugby eRugby;
    private  Match match;

    //TODO: mettre les notions de nom d'equipe en dehors de Championnat => utiliser le Constructeur complet ...
    public Championnat() {
        this.eFoot = new EFoot("Bayern",0,0,0,0);
        this.eHand = new EHand("Montpellier",0,0,0,0);
        this.eFutsal = new EFutsal("Flamengo",0,0,0,0);
        this.eVolley = new EVolley("France",0,0,0,0);
        this.eRugby = new ERugby("Toulon",0,0,0,0);
        this.match = new Match();
    }
    public void entrerScore(String teamName,int scoreEquipe,int scoreAdversaire) {
        match.majScore(scoreEquipe, scoreAdversaire);
        if (teamName.equals(eFoot.getName())){
            eFoot.majSuiteAUnMatch(match);
        }
        else if (teamName.equals(eHand.getName())){
            eHand.majSuiteAUnMatch(match);
        }
        else if (teamName.equals(eFutsal.getName())){
            eFutsal.majSuiteAUnMatch(match);
        }
        else if (teamName.equals(eVolley.getName())){
            eVolley.majSuiteAUnMatch(match);
        }
        else if (teamName.equals(eRugby.getName())){
            eRugby.majSuiteAUnMatch(match);
        }
        else {
            System.out.println("Saisie Score KO : equipe inconnue");
        }

    }
    public String restituerResChampionnat(){
        return  eFoot.restituerResultat() + "\n" +
                eHand.restituerResultat() + "\n" +
                eFutsal.restituerResultat() + "\n" +
                eVolley.restituerResultat() + "\n" +
                eRugby.restituerResultat();
    }
}
