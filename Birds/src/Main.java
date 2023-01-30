public class Main {
    public static void main(String[] args) {
        System.out.println("This is an application of birds!");
        Bird eagle = new Bird();
        eagle.setDiet("Waterfowl, turtles, rabbits, snakes, and other small animals and carrion");
        eagle.setHabitat("Within two and a half miles of the coast, bays, rivers, lakes, or other bodies of water");
        eagle.setMinSpeed(77);
        eagle.setMaxSpeed(99);
        eagle.setMinWingspan(5.9);
        eagle.setMaxWingspan(7.5);
        eagle.describeBird();
    }
}