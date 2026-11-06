package usingfinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CloseResourse {
    public static void main(String[] args) {
    Scanner sc = null;
        try {
            sc = new Scanner(new File("D:\\javaProgramming\\exceptionhandling\\usingfinally\\data.txt"));   // may throw FileNotFoundException
            System.out.println(sc.nextLine());        // may throw NoSuchElementException
        } catch (FileNotFoundException e) {
            System.out.println("File missing");
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        finally{
            if (sc != null) {
                sc.close();                           // runs in every case
            }
        }
    }
}
