package exercicioInterface;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double x, double y) {
        System.out.println(x+y);
    }

    @Override
    public double subtração(double x, double y) {
        return x-y;
    }

    @Override
    public double multiplicação(double x, double y) {
        return x*y;
    }

    @Override
    public double divisão(double x, double y) {
        return x/y;
    }
}
