package tf.qa.automation;


public class Bard extends Mage implements MageInterface {
  public String name = "Bard";
  public int hp = 150;
  public String specialization;

    public Bard(String name, int hp) {
        super(name, hp);
        this.specialization = MageInterface.specialization;

    }
    @Override
    public void run() {
        System.out.println(name +  "пытается бежать");
    }

    @Override
    public String toString() {
        return "На поле быитвы выходит: "
                + name + ","
                + "специализация: " + specialization;
    }

}
