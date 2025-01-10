import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String ODDELOVAC = ":";
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/text.txt")))){
            while(scanner.hasNextLine()){
                String radek = scanner.nextLine();
                String[] casti = radek.split(ODDELOVAC);
                String jmeno = casti[0];
                int body = Integer.parseInt(casti[1].trim());
                if (body > 50){
                    System.out.println(jmeno + " " + body);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Chyba" + e.getLocalizedMessage());
        }


    }
}