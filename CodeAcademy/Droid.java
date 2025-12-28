public class Droid {
  private String name;
  private int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
    }

  public String toString() {
      return "Hello, I'm the droid: " + name;
    }

    public void energyReport() {
      System.out.println("Battery Level: " + batteryLevel + "%");
    }

    public void performTask(String task) {
      System.out.println("Codey is performing task: " + task);
      batteryLevel -= 10;
    }

  public static void main(String[] args) {
    Droid droid1 = new Droid("Codey");

    System.out.println(droid1);
    droid1.performTask("Cleaning floor");
    droid1.energyReport();
  }
}

