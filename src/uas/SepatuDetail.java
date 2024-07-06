package uas;

public class SepatuDetail extends Sepatu {
    // constructor
    public SepatuDetail(String merk, String kodeSepatu) {
        super(merk, kodeSepatu);
    }

    public int getTahunProduksi() {
        return Integer.parseInt(getKodeSepatu().substring(0, 2)) + 2000;
    }

    public String getJenisSepatu() {
        String kodeJenis = getKodeSepatu().substring(2, 4);
        // seleksi if
        if (kodeJenis.equals("01")) {
            return "Sneakers";
        } else if (kodeJenis.equals("02")) {
            return "Boots";
        } else if (kodeJenis.equals("03")) {
            return "Sports";    
        } else {
            return "Lain-lain";
        }
    }

    public String getUkuran() {
        String kodeUkuran = getKodeSepatu().substring(4,5);
        // seleksi switch
        switch (kodeUkuran) {
            case "1":
                return "36";
            case "2":
                return "37";
            case "3":
                return "38";
            case "4":
                return "39";
            case "5":
                return "40";    
            default:
                return "Ukuran Lain";
        }
    }

     public int getHarga() {
        return Integer.parseInt(getKodeSepatu().substring(5,6));
    }

    public String getHargaDalamJutaan() {
        int harga = getHarga();
        return harga + " juta";
    }

    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nTahun Produksi: " + getTahunProduksi() +
                "\nJenis Sepatu: " + getJenisSepatu() +
                "\nUkuran: " + getUkuran() +
                "\nHarga: " + getHargaDalamJutaan();
    }
}