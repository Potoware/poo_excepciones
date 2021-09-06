package com.potoware.pooexcepciones.ejemplos;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if(divisor==0){
            throw new DivisionPorZeroException("No se puede dividir por zero");
        }
        return  numerador/(double)divisor;
    }
    public double dividir(String numerador,String divisor) throws DivisionPorZeroException, NumeroFormatoException {

        try{
        int num = Integer.parseInt(numerador);
        int div = Integer.parseInt(divisor);
            return this.dividir(num,div);
        }
        catch (NumberFormatException nfe){
            throw new NumeroFormatoException("Debe ingresar un numero");
        }

    }
}
