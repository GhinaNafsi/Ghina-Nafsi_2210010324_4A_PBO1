package uas;


import java.util.Scanner;

public class SepatuBeraksi {
    public static void main(String[] args) {
        // io sederhana
        try {
            Scanner scanner = new Scanner(System.in);
            //array
            SepatuDetail[] sepatu = new SepatuDetail[2];

            for (int i = 0; i < sepatu.length; i++) {
                System.out.print("Masukkan merk sepatu " + (i + 1) + ": ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan kode sepatu " + (i + 1) + ": ");
                String kodeSepatu = scanner.nextLine();

                //objek
                sepatu[i] = new SepatuDetail(merk, kodeSepatu);
            }
            for (SepatuDetail data : sepatu) {
                System.out.println("============");
                System.out.println("Data Sepatu: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor" + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode sepatu: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum" + e.getMessage());
        } 
    }
}

