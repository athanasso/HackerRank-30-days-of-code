import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in);){
            int input = Integer.parseInt(scan.nextLine());
            System.out.println(input);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}