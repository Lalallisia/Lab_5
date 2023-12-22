class Weapon {
    String name;
    double damage;

    public Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    // Метод для вистрілу зброєю в зомбі
    public void fire(Zombie target) {
        System.out.println("\u001B[35m" + "Зброя " + name + " вистрілила в " + target.getName() + " і завдала " + damage + " шкоди.");
        target.takeDamage(damage);
    }
    // Повністю рекурсивний метод для стрільби зброєю
    public void recursiveFire(Zombie target, int bullets) {
        // Базовий випадок: перевірка, чи кількість куль більше нуля
        if (bullets <= 0) {
            System.out.println("Закінчено патрони.");
            return;
        }

        // Виведення повідомлення про постріл
        System.out.println(name + " вистрілює в " + target.getName() + " і завдає " + damage + " шкоди.");

        // Застосування урону до цілі
        target.takeDamage(damage);

        // Рекурсивний виклик для наступного пострілу
        recursiveFire(target, bullets - 1);
    }


    // Void
    public void reload() {
        System.out.println("\u001B[35m" + "Зброя " + name + " перезаряджена.");
    }

    public static void performAction(String action, String target, int value) {
        switch (action) {
            case "Fire":
                System.out.println(target + " вистрілила з " + value + " пошкодженням.");
                break;
            case "Reload":
                System.out.println(target + " перезаряджена.");
                break;
            default:
                System.out.println("Недопустима дія для зброї.");
        }
    }
    public static void doSomething(Weapon weapon) {
        System.out.println(weapon.getName() + " щось зробила.");
    }

}
