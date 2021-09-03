package Scanner;

import java.util.Scanner;
class FiltrarDadosComScannerRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("a,b2,c3,d4,e5,f6");
        scanner.useDelimiter("\\d,?");
        System.out.println("Source: a, b2,c3,d4,e5,f6");
        while (scanner.hasNext())
            System.out.println(scanner.next());
        scanner.close();

        Scanner scanner2 = new Scanner("agato,b2,c3,d4,e5,f6");
        scanner2.useDelimiter("\\d,?");
        System.out.println("Source: agato, b2,c3,d4,e5,f6");
        while (scanner2.hasNext())
            System.out.println(scanner2.next());
        scanner2.close();

        Scanner scanner3 = new Scanner("a1,b2,c3,d4,e5,f6");
        scanner3.useDelimiter("\\d,?");
        System.out.println("Source: a1, b2,c3,d4,e5,f6");
        while (scanner3.hasNext())
            System.out.println(scanner3.next());
        scanner3.close();
    }
}