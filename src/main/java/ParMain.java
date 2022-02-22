/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author koski
 */
public class ParMain {
 
    
    
    public static void main (String [] args) {
    Scanner in= new Scanner (System.in);
    System.out.println("Introduce un número: ");
    int numeroProba=in.nextInt ();
    if (numeroProba%2==0){
        System.out.println("O número é par!");
        
    }else{
        System.out.println("Onúmero é impar");
    }
        
    }
    
}
