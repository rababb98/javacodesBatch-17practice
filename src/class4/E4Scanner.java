package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the scanner class no that we can reuse the logic from
        // thus class which is already written for us by java developers
        Scanner input=new Scanner(System.in);
        //taking an input from the user and storing in int a name variable
        String name = input.next();
        if(name.equals("Rabab")){
            System.out.println("Java instructor");
        }else{
            System.out.println("I don't know you");
        }


    }
}
