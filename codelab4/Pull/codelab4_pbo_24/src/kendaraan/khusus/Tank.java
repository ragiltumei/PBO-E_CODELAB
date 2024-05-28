package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble {
    @Override
    public void Start() {
        System.out.println("Tank " + this.getName() + " dinyalakan.");
    }

    @Override
    public void Stop() {
        System.out.println("Tank " + this.getName() + " dimatikan.");
    }

    @Override
    public void Brake() {
        System.out.println("Tank " + this.getName() + " berhenti.");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank " + this.getName() + " menembak " + vehicle + ".");
    }
}
