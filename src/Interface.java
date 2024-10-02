public class Interface {



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

        lion.eat();
        lion.drink();
        lion.sleep();
        lion.workout();

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.workout();

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.workout();
    }
}

class lion extends Animal {
    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {
        System.out.println("Lion is eating.");
    }

    @Override
    public void drink() {
        System.out.println("Lion is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("Lion is running.");
    }
}

class dog extends Animal {
    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("Dog is fetching a ball.");
    }
}

class cat extends Animal {
    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println("Cat is climbing.");
    }
}
