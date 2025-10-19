package duckstrategy;

import duckstrategy.ducks.*;
import duckstrategy.flybehaviors.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck(); // variable's type is Duck
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();

		Duck model = new ModelDuck(); // variable's type is Duck
		model.display();
		model.swim();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		System.out.println();

		Duck redhead = new RedheadDuck(); // variable's type is Duck
		redhead.display();
		redhead.performFly();
		redhead.performQuack();
		System.out.println();

		Duck rubber = new RubberDuck(); // variable's type is Duck
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		System.out.println();

		Duck decoy = new DecoyDuck(); // variable's type is Duck
		decoy.display();
		decoy.performFly();
		decoy.performQuack();
		System.out.println();
	}
}
