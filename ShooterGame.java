import javax.swing.event.InternalFrameAdapter;
public class ShooterGame {
    public Player player;
    // Конструктор для ініціалізації гравця
    public ShooterGame() {
        this.player = new Player();  // або інший спосіб ініціалізації гравця
    }

    public static void main(String[] args) {



        Player player1 = new Player();
        // Ініціалізація з одним параметром
        Player player2 = new Player("Bogdan");
        // Ініціалізація з двома параметрами
        Player player3 = new Player(50);

        // Ініціалізація з трьома параметрами
        Player player4 = new Player("Bogdan", 50);
        Zombie zombie1 = new Zombie("Zombie", 50);
        Weapon gun1 = new Weapon("Mini Uzi", 30);


        gun1.recursiveFire(zombie1, 3);// виклик рекурсивного методу

        // Створення екземпляру ShooterGame
        ShooterGame shooterGame = new ShooterGame();

        // Створення екземпляру GameHelper, передавши йому зовнішній клас
        GameHelper gameHelper = new GameHelper(shooterGame);

        // Виклик методу test класу GameHelper
        gameHelper.test();

        System.out.println("Ім'я гравця 1: " + player1.getName());
        System.out.println("Здоров'я гравця 1: " + player1.getHealth());

        Weapon.performAction("Reload", "Mini Uzi", 0);
        Zombie.performAction("Move", "Zombie", "вліво");
        Player.performAction("Left","Player", 15);


        player1.move("вперед");
        zombie1.move("вліво");


        // Створення екземплярів гравця, зомбі, та зброї
        Player player = new Player("John", 100);
        Zombie zombie = new Zombie("Zombie1", 50);
        Weapon weapon = new Weapon("Shotgun", 40);
        // Виклик методів для гравця, зомбі та зброї
        player.specialMove();
        zombie.resurrect();
        weapon.fire(zombie);
        weapon.reload();

        // Використання методу attack() у класі Zombie
        zombie.attack(player.getName());

        // Виклик перевизначених методів
        player.takeDamage("20");
        zombie.takeDamage(30);
        // Виклик методів із головного класу
        doSomething(player);
        doSomething(zombie);
        doSomething(weapon);

        gun1.fire(zombie1);
        gun1.reload();
        zombie1.attack(player1.getName());

        double playerHealth = player1.getHealth();
        String zombieName = zombie1.getName();
        double zombieHealth = zombie1.getHealth();

        System.out.println(player1.getName() + " має " + playerHealth + " здоров'я.");
        System.out.println(zombieName + " має " + zombieHealth + " здоров'я.");


        // Перевизначення методу takeDamage() у класі Player
        player.takeDamage("50");

        // Перевизначення методу attack() у класі Zombie
        zombie.attack("Alfa");

        // Перевизначення методу fire() у класі Weapon
        weapon.fire(zombie);

        // Перевантаження методу doSomething() у класі Player
        doSomething("Alfa");

        // Перевантаження методу doSomething() у класі Zombie
        doSomething("Zombie");

        // Перевантаження методу doSomething() у класі Weapon
        doSomething("Mini Uzi");
    }




    // Метод для виклику doSomething для об'єктів різних класів
    public static void doSomething(Object object) {
        if (object instanceof Player) {
            Player player = (Player) object;
            player.specialMove();
        } else if (object instanceof Zombie) {
            Zombie zombie = (Zombie) object;
            zombie.resurrect();
        } else if (object instanceof Weapon) {
            Weapon weapon = (Weapon) object;
            weapon.fire(new Zombie("TargetZombie", 30));
        } else {
            System.out.println("Unknown object.");
        }
    }
}