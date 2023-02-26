public class Main {
    public static void main(String[] args) {
        Championnat championnat = new Championnat();
        championnat.entrerScore("Bayern",2,0);
        championnat.entrerScore("Bayern",2,2);
        championnat.entrerScore("Montpellier",20,4);
        championnat.entrerScore("Montpellier",15,16);
        championnat.entrerScore("Flamengo",0,5);
        championnat.entrerScore("France",3,1);
        championnat.entrerScore("Toulon",5,0);
        System.out.println(championnat.restituerResChampionnat());
        }
}