package exceptions;

import javax.swing.*;

public class ExceptionCustomizada {
    public static void exceptionCustomizada() {
        class DivisaoNaoPrecisaException extends Exception {
           // private int numerador;
         //   private int denominador;

            public DivisaoNaoPrecisaException(String message, int numerador, int denominador) {
                super(message);
                //this.numerador = numerador;
              //  this.denominador = denominador;
            }
        }
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % denominador[i] != 0) {
                    throw new DivisaoNaoPrecisaException("Perda de informação", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoPrecisaException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
                System.out.println(e.getMessage());
            }
            catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível dividir por zero");
                System.out.println("Impossível dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Campo do numerador vazio");
                System.out.println("Campo do numerador vazio");
            }

        }

    }
}
