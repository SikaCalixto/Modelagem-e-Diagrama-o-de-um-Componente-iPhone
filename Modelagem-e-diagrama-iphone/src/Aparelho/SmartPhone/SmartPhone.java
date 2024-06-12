package Aparelho.SmartPhone;

import Aparelho.AparelhoTelefonico;
import Aparelho.NavegadorInternet.NavegadorInternet;
import Aparelho.ReprodutorMusical.ReprodutorMusical;

public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar() {
        
        System.out.println("Ligando para o número 98888-5555");
    }

    @Override
    public void atender() {
        
        System.out.println();
    }

    @Override
    public void iniciarCorreioDeVoz() {
       
        System.out.println();
    } {
    
}

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

    @Override
    public void tocar() {
       
        System.out.println();
    }

    @Override
    public void pausar() {
        
        System.out.println();
    }

    @Override
    public void selecionarMusica() {
        
        System.out.println("Fly - Avril Lavigne");
    }
}
