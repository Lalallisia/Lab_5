class Zombie extends Entity {
    public Zombie() {
        super("DefaultZombie", 50);  // Викликаємо конструктор з батьківського класу
    }
    public Zombie(String name, double health) {
        super(name, health);  // Викликаємо конструктор з батьківського класу
    }

        // Урон
        public void takeDamage(double damage) {
            health -= damage;
            System.out.println("\u001B[34m" + name +"\u001B[32m" +  " отримав " + "\u001B[31m" + damage +"\u001B[32m" +  " шкоди. \n Загальне здоров'я противника: " +"\u001B[31m" +  health);
        }

        // void
        public void move(String direction) {
            System.out.println("\u001B[34m" + name + "\u001B[32m" + " рухається у напрямку " + "\u001B[31m" + direction);
        }

    public static void performAction(String action, String target, String value) {
        switch (action) {
            case "Attack":
                System.out.println(target + " атакує гравця.");
                break;
            case "Move":
                System.out.println(target + " рухається в напрямку " + value);
                break;
            default:
                System.out.println("Недопустима дія для зомбі.");
        }
    }
    public static void doSomething(Zombie zombie) {
        System.out.println(zombie.getName() + " щось зробив.");
    }

    //МЕТОДИ НАСЛІВАННЯ
    public void resurrect() {
        System.out.println(name + " is resurrecting!");
    }

    @Override
    public void attack(String target) {
        System.out.println(name + " is attacking " + target);
        super.attack(target);
    }

}