package br.com.bitwaysystem.entity;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa() {
		super();
	}
	public Pessoa(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
