package fiap.venda.modelo;

public class Vendedor {
	private int id_vendedor;
	private String nome;
	
	public Vendedor(int id_vendedor, String nome) {
		super();
		this.id_vendedor = id_vendedor;
		this.nome = nome;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
