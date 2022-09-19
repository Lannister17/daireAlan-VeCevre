import java.util.Scanner;
public class alanCevreHesabı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi=3.14f,acı,yarıCap;
        double cevresi,alanı;

        System.out.print("Dairenin Yarı Capını giriniz :");
        yarıCap = input.nextFloat();
        System.out.print("Dairenin Acısnı giriniz..(tam ise 360 giriniz) :");
        acı = input.nextFloat();

        cevresi = 2 * pi * yarıCap * acı / 360;
        alanı = pi * yarıCap * yarıCap * acı / 360;

        System.out.println("Dairenin cevresi : " + cevresi );
        System.out.println("Dairenin alanı : " + alanı);
    }



}
