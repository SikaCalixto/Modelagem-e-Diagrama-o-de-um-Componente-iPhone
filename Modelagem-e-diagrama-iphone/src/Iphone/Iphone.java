package Iphone;

import Aparelho.AparelhoTelefonico;
import Aparelho.NavegadorInternet.NavegadorInternet;
import Aparelho.ReprodutorMusical.ReprodutorMusical;
import Aparelho.SmartPhone.SmartPhone;

public class Iphone {
   public static void main(String[] args) {
    SmartPhone sp = new SmartPhone();
    AparelhoTelefonico aparelhoTelefonico = sp;
    NavegadorInternet navegadorInternet = sp;
    ReprodutorMusical reprodutorMusical = sp;
  
    aparelhoTelefonico.ligar();
    aparelhoTelefonico.atender();
    aparelhoTelefonico.iniciarCorreioDeVoz();
    navegadorInternet.adicionarNovaAba();
    navegadorInternet.atualizarPagina();
    navegadorInternet.exibirPagina();
    reprodutorMusical.selecionarMusica();
    reprodutorMusical.pausar();
    reprodutorMusical.tocar();
} 
}
