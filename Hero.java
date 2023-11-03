import java.util.Scanner;
class Hero {
    String name;
    double healthPoint;
    double experiencePoint;
    String strength;
    String weapon;
    int level;
    String skill;
    String guess;
    boolean alive = true;

    void hello(){
        System.out.println("HEHEHEI Hello dude, its time to shine !");
    }

    void attack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("attack or run?");
        String namee = scanner.nextLine();
        if(namee.equals("run")){
        System.out.println("");
        System.out.println("VILLAIN WIN");
        System.out.println("AVANGERS LOSE");
        System.exit(0);}
        
        System.out.println("Attack the villain!!!!");
        double damage = Utility.randomNumber(); // Random damage 
        System.out.println(name + " attacks villain for " + damage + " damage.");
        

}

    String correctWeapon = "Mjolnir";
    boolean correct = false;

    void guess(){
        while(!correct){
            String guess = Utility.readLine("What is thor favourite weapon?");

        if(guess.equalsIgnoreCase(correctWeapon)){
            System.out.println("Congratulation! You guessed the correct weapon " + correctWeapon);
            correct = true;
        }
        else{
            System.out.println("Wrong answer. Try again!");
        }
    }
}
    void weapon(){
        if(weapon.equals("Mjolnir")){
            System.out.println("I use my favourite weapon " + weapon);
        }
        else if(weapon.equals("Stormbreaker")){
            System.out.println("This is my new weapon " + weapon);
        }
        else if(weapon.equals("Book")){
            System.out.println("I will fight you with my " + weapon);
        }
    }
    void takeDamage(double damage){
        System.out.println("HealthPoint: " + healthPoint);
        System.out.println("Damage:" + damage);
        healthPoint += damage;
        System.out.println("The " + name + " has now remaining " + healthPoint + " hp.");
    }
    void defend(double damage) {
        System.out.println("You got ATTACKED!!!");
        double shield = Utility.randomNumber() * level;
        System.out.println("Your defense blocked " + (damage - shield) + " damage.");
        healthPoint -= (damage - shield);
        takeDamage(damage - shield);
    }
    void skill(){
        if(skill.equals("flight")){
            System.out.println("FLIGHT");
        }
        else if(skill.equals("teleport")){
            System.out.println("Teleport...");
        }
        else if(skill.equals("telekinesis")){
            System.out.println("TELEKENESIS");
        }
        else if(skill.equals("hexes")){
            System.out.println("HEXESS");
        }
        else if(skill.equals("healing")){
            System.out.println("Done be scared, i will heal you!");
        }
        else if(skill.equals("telepathy")){
            System.out.println("HELLO TELL ME WHAT IN YOUR MIND");
        }
        else if(skill.equals("chaosMagic")){
            System.out.println("MAGICC");
        }
        else if(skill.equals("realityWarping")){
            System.out.println("REALITYWARPING");
        }
        else if(skill.equals("nexusBeing")){
            System.out.println("NEXUSBEING");
        }
        else if(skill.equals("hammerSpin")){
            System.out.println("HAMMERSPINNNNNN");
        }
        else if(skill.equals("whirlingUru")){
            System.out.println("WHIRLINGURU");
        }
        else if(skill.equals("mjolnirClone")){
            System.out.println("MJOLNIRCLONEE");
        }
        else if(skill.equals("slideSmash")){
            System.out.println("SLIDEEESMASHHH");
        }
        else if(skill.equals("thunderStruck")){
            System.out.println("THUNDERSTRUCK");
        }
        else if(skill.equals("divineChaos")){
            System.out.println("DIVINECHAOSS");
        }
        
        
    }
    void heal(double amount){
        healthPoint += amount;
        System.out.println(name + "'s health has been restored!");
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

