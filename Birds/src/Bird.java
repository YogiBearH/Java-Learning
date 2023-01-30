public class Bird {
    private String diet;
    private double minWingspan;
    private double maxWingspan;
    private String habitat;
    private int minSpeed;
    private int maxSpeed;

    public void describeBird(){
        System.out.println("Diet: " + diet);
        System.out.println("Wingspan: " + minWingspan + "-" + maxWingspan + " ft.");
        System.out.println("Habitat: " + habitat);
        System.out.println("Speed: " + minSpeed + "-" + maxSpeed + "mph");
    }
    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getDiet() {
        return "Diet: " + diet;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMinWingspan(double minWingspan) {
        this.minWingspan = minWingspan;
    }

    public double getMinWingspan() {
        return minWingspan;
    }

    public double getMaxWingspan() {
        return maxWingspan;
    }

    public void setMaxWingspan(double maxWingspan) {
        this.maxWingspan = maxWingspan;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
}
