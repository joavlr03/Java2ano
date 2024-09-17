package fiap.venda.conexao;

import java.sql.Connection;

import fiap.venda.modelo.Vendedor;
import fiap.venda.modelo.VendedorDAO;

public class Teste {
	public static void main(String[] args) {
		
		VendedorDAO vendedorDAO = new VendedorDAO();
		//Vendedor vendedor = new Vendedor(3, "Patrícia");
		//vendedorDAO.inserir(vendedor);
		
		Vendedor vendedor = vendedorDAO.pesquisarId(3);
		System.out.println(vendedor);

	}
}
