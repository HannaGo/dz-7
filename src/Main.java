// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Planets planets = Planets.valueOf("EARTH" );

        System.out.println(planets.getDistSun());


        Planets planet = Planets.valueOf("EARTH" );

        System.out.println(planet.getSequenceNumber());


    }
//        Planets planets = Planets.MERCURY;
//
//        for (Planets planet : Planets.values()) {
//            System.out.println(planet);
//        }
//    }

//    public static void main(String[] args) {
//        Earth details = Earth.DISTANCE_FROM_SUN;
//
//        for (Earth det : Earth.values()) {
//            System.out.println(det);
//        }
//    }

}
