
public enum Planets {
    MERCURY(100, 0, 111111, 123000e6, "This is the first planet in Solar Sytem.", "Venus"),
    VENUS(300, 1, 222222, 234000e45, "Mercury", "Earth"),
    EARTH(500, 2,333333,3458e7, "Venus", "Mars"),
    MARS(600,3,444444, 456001e4, "Earth", "Jupiter"),
    JUPITER(700, 4,555555, 56778e9,"Mars", "Saturn"),
    SATURN(800, 5,666666,1300e7, "jupiter", "Uranus"),
    URANUS(900, 6,777777, 315545e45, "Saturn", "Neptune"),
    NEPTUNE(1000, 7,888888, 450001e2, "Uranus", "this is the latest planet in Solar System.");



    private final Integer sequenceNumber;
    private final Integer distFromPrevPlanet;
    private final Double planetRadius;
    private final String prevPlanet;
    private final  String nextPlanet;
    private final Integer distSun;
    private final Integer distanceFromSun;
    private final Integer distSunSum;


    Planets(Integer distSun, Integer sequenceNumber, Integer distFromPrevPlanet, Double planetRadius, String prevPlanet, String nextPlanet){

        int distSum2 = 0;
        for (Planets p : values()) {
            if (p.ordinal() < this.ordinal()) {
                distSun2 += p.distSun + getDistanceFromSun();
            }
        }

        int distance = 0;
        for (Planets d : values()) {
            if (d.ordinal() < this.ordinal()) {
                distance += d.planetRadius * 2;
            }
        }

        this.distanceFromSun = distance;
        this.distSunSum = distSum2;

        this.distSun = distSun;
        this.sequenceNumber = sequenceNumber;
        this.distFromPrevPlanet = distFromPrevPlanet;
        this.planetRadius = planetRadius;

        this.nextPlanet = nextPlanet;
        this.prevPlanet = prevPlanet;
    }

    public Integer getDistSun(){

        return distSun;
    }
    public Integer getSequenceNumber(){

        return sequenceNumber;
    }

    public Integer getDistFromPrevPlanet(){

        return distFromPrevPlanet;
    }

    public Double getPlanetRadius(){

        return planetRadius;
    }

    public String getPrevPlanet(){
        return prevPlanet;
    }

    public String getNextPlanet(){

        return nextPlanet;
    }
    public Integer getDistanceFromSun() {
        return distanceFromSun;
    }

    public Integer getDistSunSum() {
        return distSunSum;
    }
}
