package com.potoware.pooexcepciones.ejemplos;

import javax.swing.*;

public class ejemplo {
    public static void main(String[] args) {
       String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        try {
             divisor = Integer.parseInt(valor);
           int division = 10 / divisor;
           System.out.println(division);
       }catch (NumberFormatException nfe){
            System.out.println("Excepcion nfe ingrese un valor numerico" + nfe.getMessage());
            main(args);
        }

        catch (ArithmeticException ae){
           System.out.println("Excepcion en tiempo de ejecucion "+ae.getMessage());
            main(args);
       }finally{
           System.out.println("Cerrar conexion a BD");
       }
        System.out.println("Continamos con el flujo");

    }
}
