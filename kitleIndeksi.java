/* 
Kullanıcıdan alınan boy ve kilo değerlerine göre vücut kitle indeksi hesaplama.
Vücut Kitle Indeksi : Kilo / Boy(m) * Boy(m)
*/

package Java.ilKonu.egzersizler;

import java.util.Scanner;

public class kitleIndeksi {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz (Örnek: 1.78): ");
        double boy = scan.nextDouble();
        
        System.out.print("Kilonuzu giriniz: ");
        int kilo = scan.nextInt();

        double vki = kilo / (boy * boy);

        System.out.print("Vücut Kitle Indeksiniz: " + vki);

    }
    
}
