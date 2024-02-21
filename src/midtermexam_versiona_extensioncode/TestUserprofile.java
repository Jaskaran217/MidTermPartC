/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author jasba
 */
public class TestUserprofile {
    public static void main(String[] args){
        
        //get input for name of the user
        
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        
         String userName = input.nextLine();
         
        // display list of the genre 
        
        System.out.println("Choose your favourite genre: ");
        System.out.println("1. Comedy ");
        System.out.println("2. Crime  ");
        System.out.println("3. Action ");
        System.out.println("4. Horror ");
        System.out.println("5. Historical  ");
        
        System.out.println("Your userProfile was created!");
        System.out.println("Name: " + userName);
    }
}
