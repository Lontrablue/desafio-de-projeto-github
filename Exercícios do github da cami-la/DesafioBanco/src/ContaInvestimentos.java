import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ContaInvestimentos extends Conta{
    private float indiceRendimento;
    private float rendimentoPeriodico;

    public ContaInvestimentos(){
        super.historico = new LinkedList<>();
    }
}
