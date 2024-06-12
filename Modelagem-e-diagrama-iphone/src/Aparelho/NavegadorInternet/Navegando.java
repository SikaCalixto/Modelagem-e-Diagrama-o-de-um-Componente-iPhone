package Aparelho.NavegadorInternet;

public class Navegando implements NavegadorInternet{

    @Override
    public void exibirPagina() {
       
        System.out.println("https://github.com/SikaCalixto/Modelagem-e-Diagrama-o-de-um-Componente-iPhone");
    }

    @Override
    public void adicionarNovaAba() {
       
        System.out.println();
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println();
    }
    
    
}
