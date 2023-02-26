public class Championnat {
    private EFoot eFoot;
    EHand e2;
    Efutsal e3;
    EVolley e4;
    ERugby e5;
    Match match;

    public Championnat() {
        this.eFoot = new EFoot("Bayern",0,0,0,0);
        this.e2 = new EHand("Montpellier",0,0,0,0);
        this.e3 = new Efutsal("Flamengo",0,0,0,0);
        this.e4 = new EVolley("France",0,0,0,0);
        this.e5 = new ERugby("Toulon",0,0,0,0);
        this.match = new Match(0,0);
    }

    public EFoot geteFoot() {
        return eFoot;
    }

    public void seteFoot(EFoot eFoot) {
        this.eFoot = eFoot;
    }

    public Championnat(EFoot eFoot, EHand e2, Efutsal e3, EVolley e4, ERugby e5, Match match) {
        this.eFoot = eFoot;
        this.e2 = e2;
        this.e3 = e3;
        this.e4 = e4;
        this.e5 = e5;
        this.match = match;
    }

    public void entrerScore(String teamName, int scoreAdversaire, int scoreEquipe) {
        match.setScoreEquipe(scoreEquipe);
        match.setScoreAdversaire(scoreAdversaire);
        if (teamName.equals(eFoot.getName())){
            eFoot.majSuiteAUnMatch(match);
        }
        else {
            System.out.println("Equipe inconnue dans le championnat !");
        }

    }
    public String listerNbPointsParEquipe(){
        return eFoot.restituerResultat() + "\n" + e2.restituerResultat();
    }
}
