package br.edu.ifpb;

public class Adopter extends PlugTwoPins implements PowerPlugThreePins {

    private int neutral = 0;

    public Adopter(int VCC, int GND, int neutral) {
        super(VCC, GND);
        this.neutral = neutral;
        this.powerPlugTheePins();
    }

    public Adopter(int VCC, int GND) {
        super(VCC, GND);
        this.ConnectTwoPins();
    }

    public void powerPlugTheePins() {
        if (neutral != 0)
            System.out.println("You are connected with 3 pins");
        else
            System.err.println("You already connected with 2  pins, " +
                                "you need to set the neutro pin first.");
    }
}
