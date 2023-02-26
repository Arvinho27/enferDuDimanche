public class Championnat {
    private EFoot eFoot;
    private EHand eHand;
    private Efutsal eFutsal;
    private EVolley eVolley;
    private ERugby eRugby;
    private  Match match;

    public Championnat() {
        this.eFoot = new EFoot("Bayern",0,0,0,0);
        this.eHand = new EHand("Montpellier",0,0,0,0);
        this.eFutsal = new Efutsal("Flamengo",0,0,0,0);
        this.eVolley = new EVolley("France",0,0,0,0);
        this.eRugby = new ERugby("Toulon",0,0,0,0);
        this.match = new Match(0,0);
    }

    public EHand geteHand() {
        return eHand;
    }

    public void seteHand(EHand eHand) {
        this.eHand = eHand;
    }

    public Efutsal geteFutsal() {
        return eFutsal;
    }

    public void seteFutsal(Efutsal eFutsal) {
        this.eFutsal = eFutsal;
    }

    public EVolley geteVolley() {
        return eVolley;
    }

    public void seteVolley(EVolley eVolley) {
        this.eVolley = eVolley;
    }

    public ERugby geteRugby() {
        return eRugby;
    }

    public void seteRugby(ERugby eRugby) {
        this.eRugby = eRugby;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public EFoot geteFoot() {
        return eFoot;
    }

    public void seteFoot(EFoot eFoot) {
        this.eFoot = eFoot;
    }

    /*public Championnat(EFoot eFoot, EHand eHand, Efutsal e3, EVolley e4, ERugby e5, Match match) {
        this.eFoot = eFoot;
        this.eHand = eHand;
        this.eFutsal = e3;
        this.eVolley = e4;
        this.eRugby = e5;
        this.match = match;
    }*/

    public void entrerScore(String teamName,int scoreEquipe,int scoreAdversaire) {
        match.setScoreEquipe(scoreEquipe);
        match.setScoreAdversaire(scoreAdversaire);
        if (teamName.equals(eFoot.getName())){
            eFoot.majSuiteAUnMatch(match);
            System.out.println("Saisie Score OK");
        }
        else if (teamName.equals(eHand.getName())){
            eHand.majSuiteAUnMatch(match);
            System.out.println("Saisie Score OK");
        }
        else if (teamName.equals(eFutsal.getName())){
            eFutsal.majSuiteAUnMatch(match);
            System.out.println("Saisie Score OK");
        }
        else if (teamName.equals(eVolley.getName())){
            eVolley.majSuiteAUnMatch(match);
            System.out.println("Saisie Score OK");
        }
        else if (teamName.equals(eRugby.getName())){
            eRugby.majSuiteAUnMatch(match);
            System.out.println("Saisie Score OK");
        }
        else {
            System.out.println("PrObLeM BiP bOp");
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
