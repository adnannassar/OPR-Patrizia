package Wiederholung.Aufgaben.Aufgabe_001;

public class HausaufgabenStd1 {
    public static void main(String [] args){
///* 1. Einfache Zählschleife: 1-5 Ausgabe mit einer for-Schleife */
//        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }
//
///* 2. Ungerade Zahlen: Zwischen 1 und 10 mit einer while-Schleife */
//        int a = 1;
//        while(a<=10){
//            System.out.println("Die ungerade Zahl ist: " + a);
//            a=a+2;
//        }

///* 3. Summe einer Zahlenreihe: Der ersten 10 natürlichen Zahlen berechnet mit einer for-Schleife. */
//        int summe = 0;
//        for(int b = 1; b <= 5; b++)
//        {
//            summe = summe + b;
//            System.out.println("Die Summe ist: " + summe);
//        }
//
///* 4. Faktorielle Berechnung: Fakultät einer vom Benutzer eingegebenen Zahl mit einer for Schleife berechnen. */
//        int fac = 1;
//        int number = 3;
//        for(int c = 1; c <= number; c++){
//            fac = fac * c;
//        }
//        System.out.println("Die Fakultät von " + number + " ist: " + fac);

///* 5. Zahlenumkehrung: Eingegebene Zahl umkehren 1234-->4321, mit der while-Schleife. */
//        String str = "1234";
//        String rueckgabe = "";
//        int i = 0;
//        while(i < str.length()){
//            char aktueller_buchstabe = str.charAt(i); // Index i=2 --> 3
//            rueckgabe = aktueller_buchstabe + rueckgabe; // 321 = 3 + 21
//            i++;
//            System.out.println(rueckgabe); // 321
//        }
//
/* 6. Primzahlprüfer: Zahl prüfen ob eine Primzahl mit einer for-Schleife. */
//        int zahl = 25;
//        for(int i = 2; i < zahl; i++){
//            if(zahl%i == 0){
//                System.out.println(zahl + " ist keine Primzahl");
//                exit(0);
//            }
//        }
//        System.out.println(zahl + " ist eine Primzahl");

///* 7. Fibonacci-Reihe: Die ersten n Elemente anzeigen (n vom Benutzer eingegeben) mit einer for oder while-Schleife */
//        int n = 8;
//        int a = 0;
//        int b = 1;
//        int c;
//        for(int i = 0; i <= n; i++){
//            System.out.print(a);
//            c = a + b;
//            a = b;
//            b = c;
//        }

///* SCHROTT */
//        System.out.println("i   " + "|   Ergebnis");
//        System.out.println("---------------------");
//        int zahl = 2;
//        int ergebnis;
//        for(int i = 0; i <= 10; i++){
//            ergebnis = zahl * i;
//            System.out.println(i + "   |   " + ergebnis);
//        }
///* SCHROTT */
//        int[][] array = new int[10][2];
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array.length; j++){
//                array[i][j] = i * j;
//                System.out.print(array[i][j] + "");
//            }
//        }
///* 8. Tabelle eines Wertes: Multiplikationstabelle (bis 10) einer vom Benutzer eingegebenen Zahl --> for-Schleife */
//        int zahl = 2;
//        int ergebnis;
//        for(int i = 1; i <= 10; i++){
//            ergebnis = zahl * i;
//            System.out.println(zahl + " * " + i + " = " + ergebnis);
//        }
///* 9. Summe der Ziffern (Quersumme): Summe alle Ziffern einer eingegebenen Zahl berechnen, mit einer while-Schleife */
//        int ziffer = 12345;
//        int summe = 0;
//        while(ziffer > 0){
//            int zahl = ziffer%10; // Gibt die letzte Ziffer aus 1234 --> 5
//            ziffer = ziffer/10; // schneidet die letzte Ziffer weg 12345 --> 1234
//            summe = summe + zahl; // 5 + 0 = 5 --> 4 + 5 = 9 --> 3 + 9 = 12 --> 2 + 12 = 14 --> 1 + 14 = 15
//        }
//        System.out.print(summe + " ");

///* 10. Pyramidenmuster (mit Sternen): Ebene wird durch Benutzer eingegeben, mit verschachtelte for- oder while-Schleife */
//        /* NICHT SELBER GELÖST */
//        // Scanner zum Einlesen der Benutzereingabe
//        Scanner scanner = new Scanner(System.in);
//        // Eingabe der Anzahl der Ebenen durch den Benutzer
//        System.out.print("Geben Sie die Anzahl der Ebenen der Pyramide ein: ");
//        int ebenen = scanner.nextInt();
//        // Äußere Schleife für die Ebenen der Pyramide
//        for (int i = 1; i <= ebenen; i++) {
//            // Innere Schleife für die Leerzeichen vor den Sternen
//            for (int j = 1; j <= ebenen - i; j++) {
//                System.out.print(" ");  // Ausgabe von Leerzeichen
//            }
//            // Innere Schleife für die Sterne
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");  // Ausgabe der Sterne
//            }
//            // Zeilenumbruch nach jeder Ebene der Pyramide
//            System.out.println();
//        }
//        // Schließen des Scanners
//        scanner.close();

///*Blatt 2: Aufgabe 3, b, 1
//        double a = 13.0 / 4;
//        double b = 5.0 / 3;
//        int c = 11 % 7;
//        double erg1 = a + b + c; //8.25 mit 5/3 (int) und 8.916666666666668 mit 5.0/3 (double)
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(erg1);

///*Blatt 2: Aufgabe 3, b, 2
//        boolean a = 5 > 3;
//        boolean b = false;
//        boolean erg2 = a || b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(erg2);

///*Blatt 2: Aufgabe 3, b, 3
//        boolean a = 5 > 4;
//        boolean b = 3 > 4;
//        String erg3 = "en" + (a ? b ? 'c' : 'd' : 'e');
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(erg3);

///* Blatt 3: Aufgabe 1, a */
//        int n = -5;
//        if(n>0){
//            System.out.println(n + " ist größer 0");
//        }else if(n<0){
//            System.out.println(n + " ist kleiner 0");
//        }else if(n==0){
//            System.out.println(n + " ist gleich 0");
//        }

///* Blatt 3: Aufgabe 1, b */
//        int n = 6;
//        if(n%2 == 0){
//            System.out.println(n + " ist eine gerade Zahl");
//        }else{
//            System.out.println(n + " ist eine ungerade Zahl");
//        }

///* Blatt 3: Aufgabe 2 */
//        String m = "Oktober";
//        switch(m){
//            case "Januar":
//                System.out.println(31);
//                break;
//            case "Februar":
//                System.out.println(29);
//                break;
//            case "März":
//                System.out.println(31);
//                break;
//            case "April":
//                System.out.println(30);
//                break;
//            case "Mai":
//                System.out.println(31);
//                break;
//            case "Juni":
//                System.out.println(30);
//                break;
//            case "Juli":
//                System.out.println(31);
//                break;
//            case "August":
//                System.out.println(30);
//                break;
//            case "September":
//                System.out.println(30);
//                break;
//            case "Oktober":
//                System.out.println(31);
//                break;
//            case "November":
//                System.out.println(30);
//                break;
//            case "Dezember":
//                System.out.println(31);
//                break;
//            default:
//                System.out.println("Eingabe ungültig");
//        }

///* Blatt 3: Aufgabe 3, a */
//        for(int n = 5; n>0; n-=2){ //n = n - 2;
//            System.out.print(n + " ");
//        }

///* Blatt 3: Aufgabe 3, b */
//        int n = 5;
//        while(n>0){
//            System.out.print(n + " ");
//            n = n - 2;
//        }

///* Blatt 3: Aufgabe 3, c */
//        int n = 5;
//        do{
//            System.out.print(n + " ");
//            n = n - 2;
//        }
//        while(n>0);
    }
}
