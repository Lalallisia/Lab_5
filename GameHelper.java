// Додатковий клас з вкладеним класом
    class GameHelper {
        private ShooterGame outer; // Зовнішній клас

        public GameHelper(ShooterGame outer) {
            this.outer = outer;
        }

        // Вкладений клас
        class HelperDemo {
            void performDemo() {
                System.out.println("HelperDemo: Виклик методу зовнішнього класу");
                outer.player.move("вперед");
            }
        }

        // Метод, що викликає вкладений клас
        void test() {
            HelperDemo helperDemo = new HelperDemo();
            helperDemo.performDemo();
        }


}
