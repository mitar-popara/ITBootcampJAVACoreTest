import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * TEST 1 JAVA
 * Oblasti pokrivene testom: PROMENLJIVE, GRANANJA, PETLJE, NIZOVI, METODE
 * Vreme trajanja testa: 120 minuta
 * Maksimalan broj poena: 100
 * Broj poena po zadatku: 20
 *
 * Ime klase: ImePrezime(PeraPeric)
 * Napomena: Zadatak se smatra uradjenim ukoliko implementira zadatu funkcionalnost sa arbitrarnim argumentima.
 * Neki od mogucih argumenata su dati u javadoc opisu implementacije.
 * Ne menjati potpise metoda zbog brzeg i lakseg uvida u rad.
 * Voditi racuna da metoda vraca zahtevanu vrednost.
 *
 * Po zavretku upload-ovati file na uploadLokacija.
 * UploadLokacija: https://drive.google.com/drive/folders/17gLXRxx8l7Y_JN8WsAlXVjpRGwd8dq4z
 *
 */
public class MitarPopara {

    /**
     * Implementirati deskripciju numericke ocene.
     * 5 - odlican
     * 4 - vrloDobar
     * 3 - dobar
     * 2 - dovoljan
     * 1 - nedovoljan
     * Za svaku ocenu koja nije 1-5 vratiti prazan string ""
     * @param ocena ocena
     * @return deskripcija numericke ocene
     */
    public static String ocene(int ocena) {
        String ocena1 = "";
        switch (ocena){
        case 1 :
            ocena1 = "nedovoljan";
            break;
        case 2 :
            ocena1 = " dovoljan";
            break;
        case 3 :
            ocena1 = " dobar";
            break;
        case 4 :
            ocena1 = " vrloDobar";
            break;
        case 5 :
            ocena1 = " odlican";
            break;
        default:
            ocena1 = "";
            }
        return ocena1;
        }

    /**
     * Implementirati metodu koja vraca sumu svih elemenata niza, i to tako da je
     * svaki element pomnozen sa indeksom na kojim se nalazi.
     * {1, 2, 3, 4, ...} -> (1 * 0) + (2 * 1) + (3 * 2) + (4 * 3) + ...
     * {99} -> 99 * 0
     * {} -> 0
     * @param niz unos niz
     * @return suma
     */
    public static int proizvodElemenataNizaSaIndeksima(int[] niz) {
        int zbir = 0;
        for (int i = 0; i < niz.length; i++){
            zbir = zbir + i*niz[i];

        }
        return zbir;
    }

    /**
     * Implementirati metodu koja pretvara niz od String podataka u niz
     * u kome su svi stringovi mala slova.
     * {"Stefan", "Dusan", "Ana"} -> {"stefan", "dusan", "ana"}
     * {"ZDRAVO JA SAM PROGRAM"} -> {"zdravo ja sam program"}
     * {"ZDRAVO JA", "SAM PROGRAM"} -> {"zdravo ja", "sam program"}
     * {} -> {}
     * @param niz unos niz
     * @return novi niz sa malim slovima
     */
    public static String[] lowerCaseNiz(String[] niz) {
        String rec = "";
        for (int i = 0; i < niz.length; i++){
            rec = niz[i].toLowerCase();
            niz[i] = rec;
        }
        return niz;
    }

    /**
     * Implementirati metodu koja vraca indeks na koji treba ubaciti element,
     * tako da je redosled elemenata sacuvan. Pretpostaviti da je niz rastuci.
     * ({1, 2, 3, 4, 5}, 1.5) -> 1
     * ({77, 78, 79, 80, 81}, 76.999999) -> 0
     * ({-11, -10, -9, -8, -7}, 7) -> 5
     * @param element broj
     * @param niz niz kao input
     * @return index
     */
    public static int indexGdeElementPripada(int element, int[] niz) {
        for (int i = 0; i < niz.length; i++){
            if (element > niz[i] && element < niz[i+1]){
              return i+1;
            } else if (element > niz[niz.length-1]) {
                return niz.length;

            }
        }
        return -1;
    }

    /**
     * Implementirati metodu koja vraca slovo koje fali u nizu alfabeta.
     * Alfabet : A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
     * ABD -> "C"
     * IJKLN -> "M"
     * WXYZ -> ""
     * @param nizSlova niz slova. Ne mora pocinjati sa "A"
     * @return slovo koje nedostaje, ili prazan string "" ukoliko je redosled ispravan
     */
    public static String abeceda(String nizSlova) {
/**
 * Implementirati metodu koja vraca slovo koje fali u nizu alfabeta.
 * Alfabet : A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
 * ABD -> "C"
 * IJKLN -> "M"
 * JUWNFJ ->
 * WXYZ -> ""
 * @param nizSlova niz slova. Ne mora pocinjati sa "A"
 * @return slovo koje nedostaje, ili prazan string "" ukoliko je redosled ispravan
 */
   /**
        public static String abeceda(String nizSlova) {
            String izvorIstine = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int indexSlova = izvorIstine.indexOf(nizSlova.charAt(0));
            String karakterKojiNedostaje = "";
            for (int i = indexSlova, indexNizaSlova = 0; indexNizaSlova < nizSlova.length(); i++, indexNizaSlova++) {
                if (nizSlova.charAt(indexNizaSlova) != izvorIstine.charAt(i)) {
                    karakterKojiNedostaje = String.valueOf(izvorIstine.charAt(i));
                    break;
                }

            }
            return karakterKojiNedostaje;
        }
       /* char alfabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String nizS= nizSlova.toUpperCase();
        char niz[] = new char[nizS.length()];
        for (int i = 0; i < niz.length; i++){
            niz[i] = nizS.charAt(i);
                    }
        int brojac = 0;
        for (int j = 0; j < 25; j++){

            if (niz[brojac] == alfabet[j]) {

                do {
                    if (niz[brojac] == alfabet[j+1]){
                        String slovo = String.valueOf(alfabet[j + 1]);
                        return slovo;

                    }
                    brojac++;
                }

                while (niz[brojac] == alfabet[j]);

            }


        }


        return "";*/
        return nizSlova;
    }

    public static void main(String[] args) {
        //System.out.println(ocene(3));
        /*int niz1[] = {1, 2, 3};
        System.out.println(proizvodElemenataNizaSaIndeksima(niz1));*/
        /*String niz2[] = {"Stefan", "Dusan", "Ana"};
        System.out.println(Arrays.toString(lowerCaseNiz(niz2)));*/
        //int niz3[] = {1, 2, 3, 4, 5, 7};
        //System.out.println(indexGdeElementPripada(0, niz3));
        System.out.println(abeceda("IJKLN"));
    }
}


