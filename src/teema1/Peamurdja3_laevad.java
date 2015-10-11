package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        int [] laud = {0,1,1,0,0,1,0,0,1,0};
        Scanner kasutaja = new Scanner (System.in);
        System.out.println ("Leia üles laevad");


        for (int i=0; i < laud.length; i++) {
            if (laud[i] == 1) {
                System.out.println ("Sisesta number vahemikus 0 kuni 9");
                int sisestus = kasutaja.nextInt ();
                if(laud[sisestus]==1){
                    System.out.println ("Said pihta");
                    laud[sisestus]=2;
                }
                else if (laud[sisestus]==0){
                    System.out.println ("Mööda. Proovi uuesti");
                }
                else{
                    System.out.println("Laevad põhjas. Mäng läbi");
                }
            }

        }

        System.out.println(Arrays.toString(laud));
    }
}
