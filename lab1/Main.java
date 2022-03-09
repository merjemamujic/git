package ibu.edu.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		    System.out.println("Reading numbers...");
		    int[] numbers = MaxInteger.readNumbers("C:\\Users\\admin\\Downloads\\numbers.txt");
		    int maxNumber = MaxInteger.findMax(numbers);
		    System.out.println("Maximum number is: " + maxNumber);
		    System.out.println("Writing to file...");
		    MaxInteger.writeToFile("C:\\Users\\admin\\Downloads\\maxNumber.txt", maxNumber);
		}
}
