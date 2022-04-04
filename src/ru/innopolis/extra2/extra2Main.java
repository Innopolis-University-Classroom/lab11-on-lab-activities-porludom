package ru.innopolis.extra2;

public class extra2Main {

}

class BirdToToyDuckAdapter extends ToyDuck{
    private Bird bird;
    @Override
    public void squeak() {
        bird.makeSound();
    }

    public BirdToToyDuckAdapter(Bird bird) {
        this.bird = bird;
    }
}
class Bird{
    public void fly(){

    }
    public void makeSound(){

    }
}

class ToyDuck{
    public void squeak(){

    }
}
