import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Limas {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        double s, lp, v, k, t, la;

        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        kelas = sc.nextLine();
        System.out.println("-------------------------------------------------");
        System.out.println("\tBANGUN RUANG LIMAS DENGAN ALAS PERSEGI");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan sisi persegi\t\t: ");
        s = sc.nextInt();
        System.out.print("Masukkan tinggi limas\t\t: ");
        t = sc.nextInt();

        k = 4 * s;
        la = s * s;
        lp = 4 * (0.5 * s * t) + (s * s);
        v = 0.33 * la * t;

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim);
        System.out.println("Kelas\t\t\t: " + kelas);
        System.out.println("=================================================");
        System.out.println(String.format("Keliling limas adalah %.2f", k));
        System.out.println(String.format("Luas alas limas adalah %.2f", la));
        System.out.println(String.format("Luas permukaan limas adalah %.2f", lp));
        System.out.println(String.format("volume limas adalah %.2f", v));
        System.out.println("=================================================");
    }
}