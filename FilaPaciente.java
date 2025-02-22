package exercicio04;

public class FilaPaciente {

	private class NO {
		String dado;
		NO prox;
	}

	NO ini, fim;

	public void init() {
		ini = fim = null;
	}

	public boolean isEmpty() {
		return (ini == null && fim == null);
	}

	public void enqueue(String nome) {
		NO novo = new NO();
		novo.dado = nome;
		novo.prox = null;
		if (isEmpty()) 
			ini = novo;
		 else 
			fim.prox = novo;
			fim = novo;
		}
	

	public String first() {
		return (ini.dado);
	}

	public String dequeue() {
		String valor = ini.dado;
		ini = ini.prox;
		if (ini == null) {
			fim = null;
		}
		return valor;
	}
}
