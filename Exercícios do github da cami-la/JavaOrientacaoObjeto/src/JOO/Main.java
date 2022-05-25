package JOO;

public class Main {
    public static void main(String[] args) {
        Vericulo vericulo1 = new Vericulo();

        vericulo1.setCor("azul");
        vericulo1.setModelo("BMW Série 3");
        vericulo1.setCapacidadeTanque(59);

        System.out.println(vericulo1.getModelo());
        System.out.println(vericulo1.getCor());
        System.out.println(vericulo1.getCapacidadeTanque());
        System.out.println(vericulo1.totalValorTanque(6.39)+"\n\n");

        Vericulo vericulo2 = new Vericulo();

        vericulo1.setCor("preta");
        vericulo1.setModelo("Mercedes Benz classe C");
        vericulo1.setCapacidadeTanque(66);

        System.out.println(vericulo1.getModelo());
        System.out.println(vericulo1.getCor());
        System.out.println(vericulo1.getCapacidadeTanque());
        System.out.println(vericulo1.totalValorTanque(6.39));
    }
}
