class Human extends Mammal {

    // Because human extends mammal,
    //human will have aces to everything written in mammal class.
    // inherited 
    //does not have access to private member variables unless
    //through getters and setters

    //human class is a subclass of the mammal class, where mammal would
    // be the superclass of human
    public void goToWork() {
        System.out.println("I'm going to work, something humans do");
    }
    //overriding from Mammal class
    public void startSleeping() {
        System.out.println("Tossing and turning.");
        //super calls the startSleping() method from the Mammal class
        //or the superclass
        super.startSleeping();
    }
}