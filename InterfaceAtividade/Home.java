package InterfaceAtividade;

public class Home implements Computador{
	@Override
	public void ligar() {
		System.out.println("O computador está ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O computador vai ser reiniciado");
	}
	
	@Override
	public void desligar() {
		System.out.println("O computador desligado");
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("Iniciando o sistema operacional do computador");
	}
}
