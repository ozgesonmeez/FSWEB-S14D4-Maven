import org.example.rpg.Monster;
import org.example.rpg.Troll;
import org.example.rpg.Werewolf;

public class Main {
    public static void main(String[] args) {


        Monster troll = new Troll("Troll", 150, 30.0);
        Monster werewolf = new Werewolf("Werewolf", 120, 25.0);


        System.out.println(troll.getName() + " Attack Damage: " + troll.attack());
        System.out.println(werewolf.getName() + " Attack Damage: " + werewolf.attack());


        ((Troll) troll).showDetails();
        ((Werewolf) werewolf).showDetails();
    }
}