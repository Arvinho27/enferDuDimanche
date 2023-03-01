public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore(Sport.FOOT,0,2);
        championnat.entrerScore(Sport.FOOT,0,2);
        championnat.entrerScore(Sport.RUGBY,15,2);
        System.out.println(championnat.restituerResChampionnat());
        }
}