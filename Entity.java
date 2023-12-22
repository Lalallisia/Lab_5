public abstract class Entity {
    protected String name;
    protected double health;

    public Entity(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void takeDamage(double damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining health: " + health);
    }

    public void move(String direction) {
        System.out.println(name + " is moving " + direction);
    }

    public void attack(String target) {
        System.out.println();
    }
}