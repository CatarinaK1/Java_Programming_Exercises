package OOP;

class RunClass {

    public static void main(String[] args) {

        //Cat kissa = new Cat();
        Cat kissa = new Cat("neon blue",3,10.5);
        //katti.setJalkoja(4);
        //katti.setVari("punainen");
        
        opiskelija opiskelija = new opiskelija("sininen",20, 80.5, "Englantia", "OOp");
        
        human ihminen = new human ("green",40, 80.5, "Englantia");
        
        
        System.out.println("Opiskelija on " + opiskelija.getAge() + " vuotta vanha.");
        System.out.println("Opiskelijalla on " + opiskelija.getColor() + " silmät");
        System.out.println("Opiskelija painaa " + opiskelija.getWeight() + " kiloa");
        System.out.println("Opiskelijan puhuu " + opiskelija.getLanguage() + " .");
        System.out.println("Opiskelija opiskelee " + opiskelija.getCourse() + " .");
        

        System.out.println("Ihminen on " + ihminen.getAge() + " vuotta vanha.");
        System.out.println("Ihmisilla on " + ihminen.getColor() + " silmät");
        System.out.println("Ihminen painaa " + ihminen.getWeight() + " kiloa");
        System.out.println("Ihminen puhuu " + ihminen.getLanguage() + " .");
        

        System.out.println("Kissalla on " + kissa.getLegs() + " jalkaa.");
        System.out.println("Kissa on " + kissa.getColor());
        System.out.println("Kissa painaa " + kissa.getWeight() + " kiloa");

        kissa.eat();
        ihminen.eat();

        System.out.println(kissa.isBig());
    }

}
