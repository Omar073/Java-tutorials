/*
4- simple sort algorithms

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        char vowels [] = {'e', 'o' , 'u', 'i', 'a'};
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

    }
}
/////////////////////////////////////////
char vowels [] = {'e', 'u' , 'a', 'o', 'i'};
        int startindex = 1;
        int endindex = 4;
        //last index in sort not taken so to sort from i=1 to i=3 endindex =4

        Arrays.sort(vowels, startindex, endindex);
        System.out.println(Arrays.toString(vowels));
 */

/* 
5- search for a char in an array of characters

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        char vowels [] = {'e', 'u' , 'a', 'o', 'i'};
	// array MUST be sorted before searching
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        System.out.printf("enter the key you want to search for: ");
        char key = scanner.next().charAt(0);

        int keyindex = Arrays.binarySearch(vowels, key);

        System.out.println(Arrays.toString(vowels));
        System.out.printf("index of key is %d", keyindex);

        scanner.close();
    }
}
*/

/*
6- difference between dynamic 1d array and dynamic 2d array

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        
	// take input a 1d array of numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //print the array
        System.out.println("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //take a dynamic 2d array from user
        System.out.println("Enter the number of rows in the 2d array: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the 2d array: ");
        int c = sc.nextInt();
        int[][] arr2d = new int[r][c];
        System.out.println("Enter the elements of the 2d array: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        //print the array
        System.out.println("The array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        
        scanner.close();
    }
	
}
 */

/*
7- check if a dynamically allocated 2d array is a magic square

import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        
        // take a dynamic 2d array as input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // check if this array is a magic square or not
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[0][i];
        }
        int sum1 = 0;
        for(int i=0; i<n; i++){
            sum1 += arr[i][0];
        }
        if(sum != sum1){
            System.out.println("Not a magic square");
            return;
        }
        for(int i=0; i<n; i++){
            int sum2 = 0;
            for(int j=0; j<n; j++){
                sum2 += arr[i][j];
            }
            if(sum2 != sum){
                System.out.println("Not a magic square");
                return;
            }
        }
        for(int i=0; i<n; i++){
            int sum2 = 0;
            for(int j=0; j<n; j++){
                sum2 += arr[j][i];
            }
            if(sum2 != sum){
                System.out.println("Not a magic square");
                return;
            }
        }
        int sum2 = 0;
        for(int i=0; i<n; i++){
            sum2 += arr[i][i];
        }
        if(sum2 != sum){
            System.out.println("Not a magic square");
            return;
        }
        int sum3 = 0;
        for(int i=0; i<n; i++){
            sum3 += arr[i][n-i-1];
        }
        if(sum3 != sum){
            System.out.println("Not a magic square");
            return;
        }
        System.out.println("Magic square");
	
	scanner.close();
    }
	
}
*/