public class Player {
    public String firstName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;

        if(this.health <= 0){
            System.out.println("Player knocked out of game");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

    public void restoreHealth(int extraHealth){
        health = this.health + extraHealth;

        if(this.health > 100){
            System.out.println("Health cannot be greater than 100%");
            health = 100;
        }
    }
}



























