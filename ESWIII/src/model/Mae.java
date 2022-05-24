package model;

import java.time.LocalDate;

@Entity
@Table(name = "mae")
public class Mae {
	
	@Id
	@JoinColumn(name = "id_mae")
	@NotNull
	private int idMae;
	
	@JoinColumn(name = "nome")
	@NotNull
	private String nome;
	
	@JoinColumn(name= "logradouro_endereco")
	@NotNull
	private String logradouroEndereco;
	
	@JoinColumn(name= "numero_endereco")
	@NotNull
	private int numeroEndereco;
	
	@JoinColumn(name= "cep_endereco")
	@NotNull
	private String cepEndereco;
	
	@JoinColumn(name= "complemento_endereco")
	private String complementoEndereco;	
	
	@JoinColumn(name= "telefone")
	@NotNull
	private String telefone;
	
	@JoinColumn(name= "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;
	
	
	public int getIdMae() {
		return idMae;
	}
	public void setIdMae(int idMae) {
		this.idMae = idMae;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}
	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}
	public int getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public String getCepEndereco() {
		return cepEndereco;
	}
	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return "Mae [idMae=" + idMae + ", nome=" + nome + ", logradouroEndereco=" + logradouroEndereco
				+ ", numeroEndereco=" + numeroEndereco + ", cepEndereco=" + cepEndereco + ", complementoEndereco="
				+ complementoEndereco + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + "]";
	
	}
	
}
