package com.potoware.pooexcepciones.ejemplos;

import javax.swing.*;

public class ejemplo {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero divisor");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador");



        try {
           // divisor = Integer.parseInt(valor);
           // division = calc.dividir(10, divisor);
           // System.out.println(division);
            double division2 = calc.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Excepcion nfe ingrese un valor numerico" + nfe.getMessage());
            main(args);
        }  catch (DivisionPorZeroException e) {
            e.printStackTrace();
            main(args);
        } catch (NumeroFormatoException e) {
            System.out.println("Se detecto una excepcion, ingrese numero valido"+e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Cerrar conexion a BD");
        }
        System.out.println("Continamos con el flujo");

    }
}
