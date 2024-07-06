package uas;


public class Sepatu {
    // atribut dan enkapsulasi
    private String merk;
    private String kodeSepatu;

    // constructor
    public Sepatu(String merk, String kodeSepatu) {
        this.merk = merk;
        this.kodeSepatu = kodeSepatu;
    }

    // mutator (setter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKodeSepatu(String kodeSepatu) {
        this.kodeSepatu = kodeSepatu;
    }

    // accessor (getter)
    public String getMerk() {
        return merk;
    }

    public String getKodeSepatu() {
        return kodeSepatu;
    }

    public String displayInfo() {
        return "Merk: " + getMerk() +
                "\nKode Sepatu: " + getKodeSepatu();
    }

    // polymorphism overloading
    public String displayInfo(String warna) {
        return displayInfo() + "\nWarna: " + warna;
    }
}

