package entities;

public abstract class Pessoa {
	
	private String nome;
	private Double rendaAnual;
	
	//Constructors:
	public Pessoa() {
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	//Getters and setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	//Métodos:
	public abstract Double calcImposto();
	
}
