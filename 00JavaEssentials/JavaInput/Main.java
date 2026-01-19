// import java.util.Scanner; //import the Scanner class

// public class User_input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String userName;
//         userName = sc.nextLine();

//         System.out.println("Username is: " + userName);

//     }
// }

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Name: "+ name);

        System.out.println("Enter pass: ");
        int pass = sc.nextInt();
        System.out.println("Password: "+ pass);
    }
}

              

