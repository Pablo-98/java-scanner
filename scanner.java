import java.util.Scanner;

public class scanner{
public static void main( String[] args) {
    
    Scanner input = new Scanner(System.in);

    // three questions for the user
    System.out.println("what is your name?");

    // variable declaration and initialization
    // .nextLine(): provides a string
    String name = input.nextLine();
    

    System.out.println("what is your fav food?");
    //variable declaration
    String food = input.nextLine();

    System.out.println("what is your age?");
    //variable declaration
    //.nextInt() provides an integer
    int age = input.nextInt();
    int year = 2022 - age;

    // we need a message that combines all the users input 
    // concatenation: process of grouping 'gluing' strings with different data types toether

    String response = "Hi, pleased to meet you " + name + "I also like " +food + "!!!" + " I bet you were born in " + year + "?, eh?";


    // Instead of console.log like I would use in JS, Java uses 'System.out.println()'
    System.out.println(response);





}
}