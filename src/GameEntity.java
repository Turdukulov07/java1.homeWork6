public class GameEntity {
    private int health;
    private int domage;

    public GameEntity(int health, int domage) {
        this.health = health;
        this.domage = domage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDomage() {
        return domage;
    }

    public void setDomage(int domage) {
        this.domage = domage;
    }
}
