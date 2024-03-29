package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

    private String titulo;
    private String isbn;
    private double preco;
    private String dataLancamento;

    public void gravar() {
        System.out.println("Gravando livro " + this.titulo);
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}