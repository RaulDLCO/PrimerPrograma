/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprograma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MaestroUTM
 */
public class PrimerPrograma {
    
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a;
        System.out.println("Indique un valor numeico");
        a = Integer.parseInt(entrada.readLine());
        System.out.println("Valor de a = " + a);
        System.out.println("-----------------");
    }
    
}
