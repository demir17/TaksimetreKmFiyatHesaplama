import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gittiğiniz km sayısını giriniz:");
        double km = sc.nextDouble();
        double tutar = (km * 2.20) + 10.0;
        if (tutar <= 20.0){
            System.out.println("20 Tl");
        }
        else {
        System.out.println(tutar + " TL");}
    }
}
