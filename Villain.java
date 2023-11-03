import java.util.Scanner;
class Villain {
    String name;
    double healthPoint;
    String skills;
    double experiencePoint;
    int level;
    boolean alive = true;
    String skill;

    void hello(){
        System.out.println("I WILL BEAT YOU!");
    }

    void takeDamage(double damage){
        System.out.println("HealthPoint: " + healthPoint);
        System.out.println("Damage:" + damage);
        healthPoint += damage;
        System.out.println("The " + name + " has now remaining " + healthPoint + " hp.");
    }

    void skill(){
        if(skill.equals("Necromancy")){
            System.out.println("GOD OF DEATH");
        }
        else if(skill.equals("portalCreation")){
            System.out.println("Portal");
        }
        else if(skill.equals("Enchanment")){
            System.out.println("ENCHANMENT");
        }
        else if(skill.equals("genericSorcery")){
            System.out.println("GENERICSORCERY");
        }
    }

    void attack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("attack or run?");
        String namee = scanner.nextLine();
        if(namee.equals("run")){
        System.out.println("");
        System.out.println("VILLAIN LOSE");
        System.out.println("AVANGERS WIN");
        System.exit(0);}
        System.out.println("Attack the avangers!!!!");
        double damage = Utility.randomNumber(); // Random damage 
        System.out.println(name + " attacks avangers for " + damage + " damage.");
        }

    void defend(double damage) {
            double shield = Utility.randomNumber();
            System.out.println(name + " defended " + (shield - damage) + " damage.");
            takeDamage(damage - shield);
        }

    void gainExperience(int exp) {
            System.out.println(name + " gained " + exp + " experience points!");
            experiencePoint += exp;
            if(experiencePoint >= 100){
              level++;
              experiencePoint = 0;
              System.out.println(name + " has reached level " + level + "!");
            }
        }
    void isAlive(){
        if(healthPoint > 0) {
          System.out.println(name + " is alive");
        }
        else{
          System.out.println(name + " is dead");
          alive = false;
        }
    }
    void speak(String massage){
        System.out.println(massage);
    }
}