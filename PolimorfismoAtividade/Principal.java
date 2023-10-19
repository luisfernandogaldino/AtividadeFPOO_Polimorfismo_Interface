package PolimorfismoAtividade;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada =new Jornada(45, "Luis fernando", "(19) 92911-2910", 87, "Rua dos Bobos");
		System.out.println("\n Jornada");
		System.out.println(jornada.getId());
		System.out.println(jornada.getEndereco());
		System.out.println(jornada.getMatricula());
		System.out.println(jornada.getTelefone());
		System.out.println(jornada.calculaSalario(20,7 ));

		Horista horista =new Horista(78,"Gustavo","(17) 93662-8444",84,"Rua dos burros");
		System.out.println("\n Horista");
		System.out.println(horista.getId());
		System.out.println(horista.getEndereco());
		System.out.println(horista.getMatricula());
		System.out.println(horista.getTelefone());
		System.out.println(horista.calculaSalario(14, 20));

		PessoaJuridica pessoaJuridica =new PessoaJuridica(12,"Alcides","(13) 92858-8528",10,"Rua da Primavera");
		System.out.println("\n Pessoa Júridica");
		System.out.println(pessoaJuridica.getId());
		System.out.println(pessoaJuridica.getEndereco());
		System.out.println(pessoaJuridica.getMatricula());
		System.out.println(pessoaJuridica.getTelefone());
		System.out.println(pessoaJuridica.calculaSalario(500, 150.0));



	}

}
