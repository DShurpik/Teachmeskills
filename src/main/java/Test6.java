public class Test6 {
    public static void main(String[] args) {

        Fighter1 fighter11 = new Fighter1("Lew", 10, 2);
        Fighter1 fighter22 = new Fighter1("Harry", 5,4);

        System.out.println(declareWinner(fighter11, fighter22, "Lew"));

    }


    public static String declareWinner(Fighter1 fighter11, Fighter1 fighter22, String firstAttacker) {
        // Your code goes here. Have fun!
        while (fighter11.health > 0 && fighter22.health > 0) {
            fighter22.health = fighter22.health - fighter11.damagePerAttack;
            fighter11.health = fighter11.health - fighter22.damagePerAttack;
        }

        if (fighter11.health <= 0 && fighter22.health <= 0)
            return firstAttacker;
        else if (fighter11.health <= 0)
            return fighter22.name;
        else
            return fighter11.name;
    }
}





class Fighter1 {
    public String name;
    public int health, damagePerAttack;
    public Fighter1(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}

