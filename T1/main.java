import Entidades.Veiculo;
import Listas.LDEVeiculos;
import UI.UIVeiculo;

public class main {
    public static void main(String[] args) {
        LDEVeiculos lista = new LDEVeiculos();
        UIVeiculo uiVeiculo = new UIVeiculo(lista);
        uiVeiculo.menuGerenciarVeiculos();
    }
}
