import java.util.Scanner;

public class uzdavinys1IsPagrindu {

    public static void main(String[] args) {
        System.out.println("Iveskite zodi: ");
        Scanner sc = new Scanner(System.in); // objekta nuskaito is konsoles

        String name = sc.nextLine(); // nuskaito visa ivesta eilute
        // String name = sc.next();// naudojamas nuskaitimui iki tarpo
        System.out.println("jusu ivestas zodis : " + name);

       /* String a = "Petras";
        String b = "jonas";
        if (a.equals(b)){ // tikrinam STRINGUS su equals metodu
            System.out.println("lygus");
        }else{
            System.out.println("Nelygus");
        }*/
        int lenght = name.length();

        uzdavinys1IsPagrindu Uzdavinys1IsPagrindu = new uzdavinys1IsPagrindu();//objektas
        int countChar = Uzdavinys1IsPagrindu.countChars(name);// nurodo skaiciuoti raides
        if (lenght % 2 == 0) {
            System.out.println("ivestas zodis " + name + " Yra Lyginis "
                    + lenght + " zenklai" + " Rasta raidziu : " + countChar);
        } else {
            System.out.println("ivestas zodis " + name +
                    " Yra Nelyginis " + lenght + " zenklai"+ " Rasta raidziu : " + countChar );
        }
    }

    private int countChars(String name) { // sukuriamas metodas grazina raide
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A')
                numb++;

        }
        return numb;
    }


}
