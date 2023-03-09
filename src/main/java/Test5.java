public class Test5 {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5,4);

        System.out.println(declareWinner(fighter1, fighter2, "Harry"));
    }


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!

        if(firstAttacker.equals(fighter1.name)){
            fighter2.health = fighter2.health - fighter1.damagePerAttack;
            fighter1.health = fighter1.health - fighter2.damagePerAttack;

            if(fighter2.health <= 0 || fighter1.health <= 0){
                return fighter1.name;
            } else return fighter2.name;
        } else {
            fighter1.health = fighter1.health - fighter2.damagePerAttack;
            fighter2.health = fighter2.health - fighter1.damagePerAttack;

            if(fighter1.health <= 0 || fighter2.health <= 0){
                return fighter2.name;
            } else return fighter1.name;
        }
    }
}





class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}
