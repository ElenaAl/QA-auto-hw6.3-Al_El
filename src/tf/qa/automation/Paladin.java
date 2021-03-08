package tf.qa.automation;


public class Paladin extends Warrior implements WarriorInterface, MageInterface {
    public String name = "Paladin";
    public int hp = 180;
    public String specialization1;
    public String specialization2;

    public Paladin(String name, int hp) {
        super(name, hp);
        this.specialization1 = WarriorInterface.specialization;
        this.specialization2 = MageInterface.specialization;
    }

    @Override
    public void run() {
        System.out.println(name + " убегает, гремя латами");
    }

    @Override
    public String toString() {
        return "На поле быитвы выходит: "
                + name + ","
                + "специализация: " + specialization1 + " & " + specialization2;
    }
}
