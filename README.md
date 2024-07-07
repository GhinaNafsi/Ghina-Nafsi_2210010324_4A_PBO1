# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data sepatu menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk dan Kode Sepatu, dan memberikan output berupa informasi detail dari Kode Swpatu tersebut seperti tahun produksi, jenis sepatu, ukuran, dan harga.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `SepatuDetail`, dan `SepatuBeraksi` adalah contoh dari class.

```bash
public class Sepatu {
    ...
}

public class SepatuDetail extends Sepatu {
    ...
}

public class SepatuBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` sepatu[i] = new SepatuDetail(merk, kodeSepatu);` adalah contoh pembuatan object.

```bash
 sepatu[i] = new SepatuDetail(merk, kodeSepatu);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `KodeSepatu` adalah contoh atribut.

```bash
String merk;
String KodeSepatu;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepatu` dan `SepatuDetail`.

```bash
public Sepatu(String merk, String kodeSepatu) {
        this.merk = merk;
        this.kodeSepatu = kodeSepatu;
}

 public SepatuDetail(String merk, String kodeSepatu) {
        super(merk, kodeSepatu);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` dan `setKodeSepatu` adalah contoh method mutator.

```bash
 public void setMerk(String merk) {
  this.merk = merk;
}

public void setKodeSepatu(String kodeSepatu) {
  this.kodeSepatu = kodeSepatu;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getKodeSepatu`, `getTahunProduksi`, `getJenisSepatu`, `getUkuran`, dan `getHArgaDalamJutaan` adalah contoh method accessor.

```bash
public String getMerk() {
       return merk;
    }

public String getKodeSepatu() {
       return kodeSepatu;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `KodeSepatu` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String KodeSepatu;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepatuDetail` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
public class SepatuDetail extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Sepatu` merupakan overloading method `displayInfo` dan `displayInfo` di `SepatuDetail` merupakan override dari method `displayInfo` di `Sepatu`.

```bash
public String displayInfo() {
        return "Merk: " + getMerk() +
                "\nKode Sepatu: " + getKodeSepatu();
    }

    // polymorphism overloading
    public String displayInfo(String warna) {
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenisSepatu` dan seleksi `switch` dalam method `getUkuran`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < sepatu.length; i++) {{
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);

System.out.print("Masukkan merk sepatu " + (i + 1) + ": ");
String merk = scanner.nextLine();
System.out.print("Masukkan kode sepatu " + (i + 1) + ": ");
String kodeSepatu = scanner.nextLine();

System.out.println("Data Sepatu: ");
System.out.println(data.displayInfo());7

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` SepatuDetail[] sepatu = new SepatuDetail[2];` adalah contoh penggunaan array.

```bash
 SepatuDetail[] sepatu = new SepatuDetail[2];

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor" + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode sepatu: " + e.getMessage());
    } catch (Exception e) {
            System.out.println("Kesalahan umum" + e.getMessage());
    } 
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ghina Nafsi
NPM: 2210010324
