package ListaOO_01.Q10;

import java.util.ArrayList;

public class Produto {
	private String Nome; 
	private String Codigo;
	private double Preco;
	private int Quantidade;
	
	public Produto() {}
	public Produto(String nome, String codigo, double preco, int quantidade) {
		this.Nome = nome;
		this.Codigo = codigo;
		this.Preco = preco;
		this.Quantidade = quantidade; 
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	} 
	
	public void buscarProduto(ArrayList<Produto> produtos, String nome) {
		for(Produto produto : produtos) {
			if(produto.getNome().equals(nome)) {
				System.out.println(produto);
			}
		}
	}
	
	public void venderProduto(ArrayList<Produto> produtos, String nome) {
		for(int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			
			if(p.getNome().equals(nome)) {
				if(p.Quantidade > 0) {
					p.Quantidade -= 1;
					System.out.println("Produto '" + p.Nome + "' vendido!" );
					break;
				}
				else {
					System.out.println("Não há " + p.Nome + " disponível para venda!");
				}
				
			}
		}
	}
	
	@Override
	public String toString() {
		return " Nome: " + this.Nome +
			"\n Código: " + this.Codigo +
			"\n Preço: R$" + this.Preco + 
			"\n Quantidade: " + this.Quantidade;
	}
	
}
