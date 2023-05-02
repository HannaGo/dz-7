public enum Planets {
    MERCURY(100, 0, 111111, 123000e6, "Sun", "Venus"),
    VENUS(300, 1, 222222, 234000e45, "Mercury", "Earth"),
    EARTH(500, 2,333333,3458e7, "Venus", "Mars"),
    MARS(600,3,444444, 456001e4, "Earth", "Jupiter"),
    JUPITER(700, 4,555555, 56778e9,"Mars", "Saturn"),
    SATURN(800, 5,666666,1300e7, "jupiter", "Uranus"),
    URANUS(900, 6,777777, 315545e45, "Saturn", "Neptune"),
    NEPTUNE(1000, 7,888888, 450001e2, "Uranus", "this is the latest planet in Solar System.");

    public final Integer distSun(){
        Double distSunSum = 0;
        for(Planets p = Planets.values()){
            distSunSum = getDistFromPrevPlanet() + getPlanetRadius();
        }
        System.out.println(distSunSum);

    }

    private final Integer sequenceNumber;
    private final Integer distFromPrevPlanet;
    private final Double planetRadius;
    private final String prevPlanet;
    private final String nextPlanet;


    Planets(Integer distSun, Integer sequenceNumber, Integer distFromPrevPlanet, Double planetRadius, String prevPlanet, String nextPlanet){
        this.distSun = distSun;
        this.sequenceNumber = sequenceNumber;
        this.distFromPrevPlanet = distFromPrevPlanet;
        this.planetRadius = planetRadius;
        this.prevPlanet = prevPlanet;
        this.nextPlanet = nextPlanet;

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





}
