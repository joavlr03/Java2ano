package exercicio01;

import exercicio03.GerenciadorProduto;
import exercicio03.Produto;

public class Teste {
	public static void main(String[] args) {
		
		GerenciadorProduto g = new GerenciadorProduto();
		g.inserir(new Produto("veja", "limpeza"));
		g.inserir(new Produto("arroz", "alimento"));
		g.inserir(new Produto("detegente", "limpeza"));
		g.inserir(new Produto("batata", "alimento"));
			
		g.imprimir("limpeza");
	}
}
