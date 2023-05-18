// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        Planets planets = Planets.EARTH;
//
//        for (Planets planet : Planets.values()){
//            System.out.println(planet);
//        }
//    }
    public static void main(String[] args) {

        Planets planetes = Planets.valueOf("EARTH" );
        System.out.println(planetes.getSequenceNumber());

//        Planets planets = Planets.valueOf("EARTH" );
//        System.out.println(planets.getDistanceFromSun());
//
//        Planets planet = Planets.valueOf("EARTH" );
//        System.out.println(planet.getSequenceNumber());
    }

}


//    public static void main(String[] args) {
//        Planets planets = Planets.valueOf("EARTH" );
//        System.out.println(planets.getDistSun());
//        Planets planet = Planets.valueOf("EARTH" );
//        System.out.println(planet.getSequenceNumber());
//    }