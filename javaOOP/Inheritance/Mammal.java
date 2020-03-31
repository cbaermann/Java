class Mammal {
    private boolean sleeping = false;
    public void regulateTemperature() {
        System.out.println("My temperature is just right.");
    }

    public void startSleeping() {
        sleeping = true;
        System.out.println("ZZZzzzzz");
    }

    public boolean isSleeping() {
        return sleeping;
    }
}