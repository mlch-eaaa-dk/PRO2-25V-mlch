package duckstrategy.ducks;

import duckstrategy.flybehaviors.FlyWithWings;
import duckstrategy.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
