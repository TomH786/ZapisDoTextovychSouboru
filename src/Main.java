import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("text.txt")))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Soubor nebyl nalezen");
        }

        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")))) {
            writer.println("Hello world!");
        }catch (IOException e){
            System.out.println("Chyba zápisu do souboru");
        }


    }
}