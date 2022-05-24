package model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {

	@Id
	@JoinColumn(name = "id_bebe")
	@NotNull
	private int idBebe;

	@JoinColumn(name = "nome")
	@NotNull
	private String nome;

	@JoinColumn(name = "data_nasc)
	@NotNull
	private LocalDate dataNascimento;
	
	@JoinColumn(name = "altura")
	@NotNull
	private float altura;

	public int getIdBebe() {
		return idBebe;
	}

	public void setIdBebe(int idBebe) {
		this.idBebe = idBebe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Bebe [id=" + idBebe + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura=" + altura
				+ "]";
	}

}
