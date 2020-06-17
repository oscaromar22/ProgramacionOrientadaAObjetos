/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E2;
import java.util.Scanner;

/**
 *
 * @author Olivera Gutierrez Oscar Omar
 */
public class TipoTransporte {
    
    int Puertas,Ruedas,Pasajeros,Motor;
    
    public void LeerDatos()
    {
        Scanner x=new Scanner(System.in);
        
        System.out.println("Tipos De Vehiculos\n");
        
        System.out.println("Ingresa el numero de puertas:");
        Puertas=x.nextInt();
        
        System.out.println("Ingresa el numero de ruedas:");
        Ruedas=x.nextInt();
        
        System.out.println("Ingresa el numero de pasajeros:");
        Pasajeros=x.nextInt();

        System.out.println("Tiene Motor(Si = 0/No = 1):");
        Motor=x.nextInt();          
    }
    
    public void MostrarDatos()
    {
        System.out.println("\nVehiculo\n");
        
        if (Puertas==4 & Ruedas==4 & Pasajeros==4 & Motor==0){
        System.out.println("# Puertas:" + Puertas + "\n# Ruedas:" + Ruedas + "\n# Pasajeros:" + Pasajeros + "\n# Pasajeros:" + Motor);
        System.out.println("Vehiculo: Automovil");
        }
        if (Puertas==0 & Ruedas==2 & Pasajeros <=2 & Motor==0){
        System.out.println("# Puertas:" + Puertas + "\n# Ruedas:" + Ruedas + "\n# Pasajeros:" + Pasajeros + "\n# Pasajeros:" + Motor);
        System.out.println("Vehiculo: Motocicleta");
        }
        if (Puertas>=2 & Ruedas>=4 & Pasajeros >=8 & Motor==0){
        System.out.println("# Puertas:" + Puertas + "\n# Ruedas:" + Ruedas + "\n# Pasajeros:" + Pasajeros + "\n# Pasajeros:" + Motor);
        System.out.println("Vehiculo: Camion");
        }
        if (Puertas==0 & Ruedas==0 & Pasajeros >=2 & Motor==0){
        System.out.println("# Puertas:" + Puertas + "\n# Ruedas:" + Ruedas + "\n# Pasajeros:" + Pasajeros + "\n# Pasajeros:" + Motor);
        System.out.println("Vehiculo: Lancha");
        }
        if (Puertas==0 & Ruedas==2 & Pasajeros <=2 & Motor==1){
        System.out.println("# Puertas:" + Puertas + "\n# Ruedas:" + Ruedas + "\n# Pasajeros:" + Pasajeros + "\n# Pasajeros:" + Motor);
        System.out.println("Vehiculo: Bicicleta");
        }
    }
}

