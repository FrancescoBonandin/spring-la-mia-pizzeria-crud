package org.java.spring.pojo;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity

public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 60, nullable=false, unique = true)
	@Length(min=3, max=60, message= "nome deve avere almeno 3 e massimo 60 caratteri")
	@NotBlank(message="nome cannot be blank")
	private String nome;
	
	@Column(columnDefinition = "TEXT")
	
	private String descrizione;
	
	@Column(columnDefinition = "TEXT")
	private String fotoUrl;
	
	@Column(nullable=false)
	@NotNull(message="prezzo cannot be null")
	@Positive(message= "prezzo must be positive")
	private Float prezzo;
	
	public Pizza() {}
	
	public Pizza( String nome, String descrizione, Float prezzo, String fotoUrl) {
		
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo((float)prezzo);
		setFotoUrl(fotoUrl);
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		
		return "[" + getId() + "] " + getNome() + " - " 
				+ getDescrizione() + getPrezzo();
	}
}
