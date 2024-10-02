abstract class Animal {
    public abstract void makeSound();

    public void eat() {
        System.out.println("This animal is eating.");
    }

    public void action() {
        System.out.println("    This animal is performing an action.");
    }

    public abstract void drink();

    public abstract void sleep();

    public abstract void workout();
}
