public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore(Sport.FOOT,"Bayern",0,2);
        championnat.entrerScore(Sport.FOOT,"Atl",0,2);
        System.out.println(championnat.restituerResChampionnat());
        }
}