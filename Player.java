public class Player extends Entity {
    public Player() {
        super("DefaultPlayer", 100);  // Викликаємо конструктор з батьківського класу
    }
    public Player(String name, double health) {
        super(name, health);  // Викликаємо конструктор з батьківського класу
    }

    private String name;// перевизначила конструктор щоб модна було давати змогу вибирати нік
    private double health;


    public Player(String name) {
        this(name, 100);
    }

    public Player(double health) {
        this("Alfa", health);
    }


    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }


    // Метод з типізованим поверненням
    public void takeDamage(String damage) {
        health -= Double.parseDouble(damage);
        System.out.println("\u001B[32m" + " Урон по гравцю " + "\u001B[33m" + name +"." + "\n" + name + "\u001B[32m" + " втратив " + "\u001B[31m" + damage + "\u001B[32m" + " здоров'я. \n Загальне здоров'я гравця: " +"\u001B[31m" +  health);
    }

    // Метод без типізованого повернення (void)
    public void move(String direction) {
        System.out.println("\u001B[33m"+name + "\u001B[32m" + " рухається у напрямку " + "\u001B[31m" +  direction);
    }

    public static void performAction(String action, String target, int value) {
        switch (action) {
            case "Attack":
                System.out.println(target + " атакує з " + value + " пошкодженням.");
                break;
            case "Move":
                System.out.println(target + " рухається в напрямку " + value);
                break;
            default:
                System.out.println("Недопустима дія для гравця.");
        }
    }
    public static void doSomething(Player player) {
        player.takeDamage("15");// Виклик методу takeDamage()
        System.out.println("Здоров'я гравця: " + player.health);}


    //МЕТОДИ НАСЛІВАННЯ
    public void specialMove() {
        System.out.println(name + "виконує спеціальний рух!");
    }
}


