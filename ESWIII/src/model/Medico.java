package model;

public class Medico {
	
	@Id
	@JoinColumn(name= "crm")
	@NotNull
	private String CRM;
	
	@JoinColumn(name= "nome")
	@NotNull
	private String nome;
	
	@JoinColumn (name= "telefone_celular")
	@NotNull
	private String telefoneCelular;
	
	@JoinColumn (name= "especialidade")
	@NotNull
	private String especialidade;
	
	
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", nome=" + nome + ", telefoneCelular=" + telefoneCelular + ", especialidade="
				+ especialidade + "]";
	
	}
	
}
