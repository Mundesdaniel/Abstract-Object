public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void workout() {

            }
        };
        Animal dog = new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void workout() {

            }
        };
        Animal cat = new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void sleep() {

            }

            @Override
            public void workout() {

            }
        };

        lion.makeSound();
        lion.action();
        lion.eat();

        dog.makeSound();
        dog.action();
        dog.eat();

        cat.makeSound();
        cat.action();
        cat.eat();
    }
}
