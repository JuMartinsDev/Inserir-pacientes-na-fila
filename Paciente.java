package exercicio04;

import java.util.Scanner;

public class Paciente {

	String nome;
	int idade;
	
	public Paciente(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	
	public class Consultorio {
		
		public static void main(String[] args) {
			Scanner le = new Scanner(System.in);
			FilaPaciente fila = new FilaPaciente();
			fila.init();
			int opcao = 0;
			do {
				System.out.println(" 1 - inserir paciente na fila");
				System.out.println(" 2 - atender próximo paciente da fila");
				System.out.println(" 3 - encerrar atendimento");
				opcao = le.nextInt();
				switch(opcao) {
				case 1:
					System.out.println("Nome: ");
					le.nextLine();
					String nome = le.nextLine();
					fila.enqueue(nome);
					break;
				case 2:
					if(!fila.isEmpty()) {
						System.out.println("Paciente a ser atendido agora: "+ fila.dequeue());
					}else {
						System.out.println("Não há pacientes na fila");
					}
					break;
				case 3:
					if(fila.isEmpty()) {
						System.out.println("Encerrado atendimento");
					}else {
						System.out.println("Ainda ha pacientes na fila");
						opcao=0;
					}
					break;
				default:
					System.out.println("Opção inválida");
				}
				
			}while(opcao != 3);
		}

	}
	
}
