package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Pesawat " + this.getName() + " dinyalakan.");
    }

    @Override
    public void Stop() {
        System.out.println("Pesawat " + this.getName() + " dimatikan.");
    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas.");
    }
}
