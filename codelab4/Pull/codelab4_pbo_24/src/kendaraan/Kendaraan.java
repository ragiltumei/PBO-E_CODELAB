package kendaraan;

public class Kendaraan {
    private String name;
    private String model;
    private String warna;
    private int tahun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void Start() {
        System.out.println("Kendaraan " + this.name + " dinyalakan.");
    }

    public void Brake() {
        System.out.println("Kendaraan " + this.name + " berhenti.");
    }

    public void Stop() {
        System.out.println("Kendaraan " + this.name + " dimatikan.");
    }

    public void getInfo() {
        System.out.println("Informasi Kendaraan:");
        System.out.println("Nama: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);
    }
}
