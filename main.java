import javax.swing.JOptionPane;

public class main {
    public static void main(String[]args){
        Hero thor = new Hero();
        Hero wanda = new Hero();

        Villain loki = new Villain();
        Villain hela = new Villain();

        thor.name = "Thor";
        wanda.name = "Wanda";

        loki.name = "Loki";
        hela.name = "Hela";
        
        thor.strength = "Thunder";
        wanda.strength = "Magic";

        wanda.weapon = "Book";

        thor.healthPoint = 500;
        wanda.healthPoint = 500;

        loki.healthPoint = 450;
        hela.healthPoint = 450;
        while((thor.alive == true && loki.alive == true || hela.alive == true) || (wanda.alive == true && loki.alive == true || hela.alive == true)){

        
        thor.guess();
        thor.weapon = "Mjolnir";
        thor.weapon();

        System.out.println("");
        System.out.println("Thor:");
        thor.attack();
        System.out.println("");

        thor.skill = "hammerSpin";
        thor.skill();

        System.out.println("");

        loki.defend(0);
        System.out.println("");

        loki.isAlive();
        System.out.println("");

        System.out.println("Loki:");
        loki.attack();
        System.out.println("");

        System.out.println("Thor: ");
        thor.defend(0);

        thor.isAlive();
        System.out.println("");


        thor.speak("Thor: Dont try to run dude" );
        System.out.println("");

        hela.speak("Hela: I WILL COME TO HELP U Hela AND BREAK THOR WEAPON AGAIN");
        System.out.println("");

        loki.speak("Loki: Hello sister, lets fight Thor together!");
        System.out.println("");

        wanda.speak("Wanda: Dont scared, i come to help you too Thor");
        System.out.println("");

        wanda.weapon();
        System.out.println("");

        System.out.println("Wanda:");
        wanda.attack();
        wanda.skill = "hexes";
        wanda.skill();
        System.out.println("");

        loki.takeDamage (0);
        hela.takeDamage (0);
        System.out.println("");

        System.out.println("Loki:");
        loki.attack();
        System.out.println("");
        
        System.out.println("Hela:");
        hela.attack();
        System.out.println("");

        thor.takeDamage(0);
        wanda.takeDamage(0);
        thor.isAlive();
        wanda.isAlive();

        System.out.println("Thor:");
        thor.attack();
        thor.speak("HERE IS MY THUNDERSTRUCK");
        System.out.println("");

        thor.skill = "thunderStruck";
        thor.skill();

        loki.takeDamage(0);
        hela.takeDamage(0);
        System.out.println("");

        hela.speak("Hela: You quite good Thor. But you have to remember, my name is Hela odin daughter!!!");
        System.out.println("Hela:");
        hela.attack();
        hela.skill = "Necromancy";
        hela.skill();
        System.out.println("");

        thor.defend(0);
        wanda.defend(0);
        System.out.println("");

        wanda.skill = "healing";
        wanda.skill();
        System.out.println("");

        wanda.heal(50);
        thor.heal(50);
        System.out.println("");

        System.out.println("Thor:");
        thor.attack();
        thor.skill = "whirlingUru";
        thor.skill();
        System.out.println("");
        
        System.out.println("Wanda:");
        wanda.attack();
        wanda.skill = "chaosMagic";
        wanda.skill();
        wanda.skill = "teleport";
        wanda.skill();
        wanda.skill = "hexes";
        wanda.skill();
        wanda.skill = "teleport";
        wanda.skill(); 
        wanda.skill = "telekinesis";
        wanda.skill();
        System.out.println("");

        loki.defend(0);
        System.out.println("");

        loki.takeDamage(0);
        hela.takeDamage(0);
        System.out.println("");

        loki.takeDamage(0);
        hela.takeDamage(0);
        System.out.println("");

        hela.defend(0);
        System.out.println("");

        loki.takeDamage(0);
        hela.takeDamage(0);
        System.out.println("");
        
        loki.gainExperience(0);
        hela.gainExperience(0);
        wanda.gainExperience(0);
        thor.gainExperience(0);
        System.out.println("");


        System.out.println(">>RESULT");
        System.out.println("");
        if(loki.healthPoint <= 0){
            System.out.println("WINNER: " + thor.name + " " + wanda.name);
            System.out.println("LOSER: " + loki.name + " " + hela.name);
        }
        else if(hela.healthPoint <= 0){
            System.out.println("WINNER: " + thor.name + " " + wanda.name);
            System.out.println("LOSER: " + loki.name + " " + hela.name);
        }
        else if(thor.healthPoint >= hela.healthPoint){
            System.out.println("WINNER: " + loki.name + " " + hela.name);
            System.out.println("LOSER: " + thor.name + " " + wanda.name);
        }
        else if(thor.healthPoint >= loki.healthPoint){
            System.out.println("WINNER: " + loki.name + " " + hela.name);
            System.out.println("LOSER: " + thor.name + " " + wanda.name);
        }
        else{
            System.out.println("WINNER: " + loki.name + " " + hela.name);
            System.out.println("LOSER: " + thor.name + " " + wanda.name);
        }
        System.exit(0);
        }
    }
}