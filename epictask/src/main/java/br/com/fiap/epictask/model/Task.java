package br.com.fiap.epictask.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_TASK")
public class Task {

	@Id
	@Column(name = "cd_task")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Titulo é obrigatorio")
	@Column(name = "nm_task")
	private String title;

	@Size(min = 10, message = "O minimo de caracteres é 10")
	@Column(name = "ds_task")
	private String description;

	@Min(value = 10, message = "Minimo é 10")
	@Max(value = 500, message = "Maximpo é 500")
	@Column(name = "pt_task")
	private int points;

}
