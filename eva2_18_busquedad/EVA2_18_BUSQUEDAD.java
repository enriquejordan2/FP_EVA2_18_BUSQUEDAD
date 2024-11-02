/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busquedad;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_18_BUSQUEDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos={10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        
        for (int i = 0; i < datos.length; i++) {
          if(valor == datos[i]);
          //regresar al posicion
          posi = i;
          //detener el ciclo
          break;
        }if(posi == 0 -1)
   System.out.println("Valor no encontrado: ");
       
    else
     System.out.println("Valor encontrado: ");
    }
   
            
}
