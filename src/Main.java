public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore(Sport.FOOT,0,7);
        championnat.entrerScore(Sport.FOOT,1,1);
        championnat.entrerScore(Sport.FOOT,3,1);
        championnat.entrerScore(Sport.RUGBY,30,3);
        System.out.println(championnat.restituerResChampionnat());
        }
}