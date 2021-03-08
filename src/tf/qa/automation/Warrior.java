package tf.qa.automation;

public abstract class Warrior {

    public Warrior(String name, int hp) {
    }

    public void dead(String name) {
        System.out.println(name + " погибает");
    }

    public abstract void run();
}