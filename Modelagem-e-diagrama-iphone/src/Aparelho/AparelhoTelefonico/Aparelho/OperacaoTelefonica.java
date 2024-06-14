package Aparelho;

public class OperacaoTelefonica implements AparelhoTelefonico {

    @Override
    public void ligar() {
       
        System.out.println("Ligando para o número 98888-5555");
    }

    @Override
    public void atender() {
        
        System.out.println("Atendendo o Telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
       
        System.out.println("enviando Mensagem de Voz");
    }
    
}
