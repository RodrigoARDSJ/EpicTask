package br.com.fiap.epictask.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_user")
	private Long id;
	
	@NotBlank(message = "Nome é obrigatorio!")
	@Column(name = "nm_user")
	private String name;
	
	@NotBlank(message = "Email obrigatorio!")
	@Email(message = "Email invalido!")
	@Column(name = "ds_email")
	private String email;
	
	@Size(min = 8, message = "A senha deve conter no minímo 8 caracteres!")
	@Column(name = "ds_password")
	private String password;

}
