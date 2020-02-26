package br.edu.ifpb;

public class PlugTwoPins {

    public int VCC;
    public int GND;

    protected void  ConnectTwoPins() {
        System.out.println("Connected with 2 Pins!");
    }

    public PlugTwoPins(int VCC, int GND) {
        this.VCC = VCC;
        this.GND = GND;
    }

    public int getVCC() {
        return VCC;
    }

    public void setVCC(int VCC) {
        this.VCC = VCC;
    }

    public int getGND() {
        return GND;
    }

    public void setGND(int GND) {
        this.GND = GND;
    }
}
