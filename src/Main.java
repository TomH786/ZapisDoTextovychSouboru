import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src//text.txt")))) {
            writer.println("Hello world!");
        }catch (IOException e){
            System.out.println("Chyba zápisu do souboru");
        }
    }
}