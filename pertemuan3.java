package app;

import java.util.Scanner;

public class pertemuan3 {
    public static void main(String[] args) {
        float sisi;
        char yn = 'n';
        Scanner Masuk = new Scanner(System.in);
        do {

        System.out.println("Program Menghitung Volume dan Luas Kubus");
        System.out.println("sisi ? ");
        sisi = Masuk.nextFloat();

        float Luas = 6 *(sisi*sisi);
        float Volume = sisi*sisi*sisi;

        System.out.println("Luas Permukaan Kubus adalah : " + Luas);
        System.out.println("Volume kubus adalah : " + Volume);
        System.out.println("Apakah Anda ingin ulang ? [y/n] ");
        Masuk.nextLine();
        String yesno = Masuk.nextLine();
        yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');
        Masuk.close();
    }

}