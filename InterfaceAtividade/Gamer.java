package InterfaceAtividade;

public class Gamer implements Computador{
	@Override
	public void ligar() {
		System.out.println("O computador está ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O computador reiniciado");
	}
	
	@Override
	public void desligar() {
		System.out.println("O computador desligado");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("O computador está iniciando o sistema");
	}
	

}
