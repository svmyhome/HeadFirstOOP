package Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallrd = new MallarDuck();
        mallrd.performQuack();
        mallrd.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
