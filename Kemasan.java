// File: Kemasan.java
public class Kemasan {
    private String jenis;
    private String ukuran;

    // Constructor
    public Kemasan(String jenis, String ukuran) {
        this.jenis = jenis;
        this.ukuran = ukuran;
    }

    // Getter dan Setter untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    // Getter dan Setter untuk ukuran
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    // Method info kemasan
    public String infoKemasan() {
        return "Jenis kemasan: " + jenis + ", Ukuran: " + ukuran;
    }
}

