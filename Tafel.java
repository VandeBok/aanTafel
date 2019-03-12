import java.util.Scanner;
public class Tafel {
    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Hallo, wie is daar?");
        String name = myObj.nextLine();
        System.out.println("Hallo " + name + ".");


            System.out.println("Welke tafel wil je oefenen?");
            int a = myObj.nextInt();
            System.out.println("Tafel van " + a + ". Komtie!");

            for (int c = 1; c < 11; c++) {
                System.out.print(c + " * " + a + " = ");
                int b = myObj.nextInt();
                if (b == a * c) {


                } else {
                    System.out.println("Fout, loser! Iedereen haat je.");
                    c--;
                }

            }
            System.out.println("Lekker gewerkt pik!");
        }
    }


