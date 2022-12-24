public class Car {
    public void Start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("[CAR] Started fuel system");
    }

    private void startCommand() { System.out.println("[CAR] Started command"); }

    private void startElectricity() {
        System.out.println("[CAR] Started electricity");
    }

}
