// create interface and push codes to github
//
//a. Create Animal interface and it should have eat, drink,
// sleep, workout functions in the interface.
//
//b. create a Github repo and send all your codes to there.
//
//Note: You can use Chatgpt but before chat gpt I
// suggest you to use other tools and understand better


import Animalininterface.Animalinterface;

class Lion extends Animalinterface {
    @Override
    public void makeSound() {
        System.out.println("The lion roars.");
    }

    @Override
    public void action() {
        System.out.println("The lion is  chasing a man.");
    }
    @Override
    public void eat(){
        System.out.println("\nThe lion is eating a buffalo");
    }
}

class Dog extends Animalinterface {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void action() {
        System.out.println("The dog is playing.");
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating meat");
    }
}

class Cat extends Animalinterface {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void action() {
        System.out.println("The cat is chasing a rat.");
    }
    @Override
    public void eat(){
        System.out.println("The cat is eating a rat");
    }
}
