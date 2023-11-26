public class EnhancedPlayer {
    private String fullName;
    private int healthPercent;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int healthPercent, String weapon) {
        this.fullName = fullName;
        if (healthPercent <= 0) {
            this.healthPercent = 100;
        } else this.healthPercent = Math.min(healthPercent, 100);

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.healthPercent = this.healthPercent - damage;

        if(this.healthPercent <= 0){
            System.out.println("Player knocked out of game");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.healthPercent;
    }

    public void restoreHealth(int extraHealth){
        healthPercent = this.healthPercent + extraHealth;

        if(this.healthPercent > 100){
            System.out.println("Health cannot be greater than 100%");
            healthPercent = 100;
        }
    }
}
