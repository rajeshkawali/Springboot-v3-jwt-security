package com.rajeshkawali.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "token_table")
@Entity
public class Token {

	@Id
	@GeneratedValue
	public Integer id;

	@Column(unique = true)
	public String token;

	@Enumerated(EnumType.STRING)
	//public TokenType tokenType = TokenType.BEARER;
	public TokenType tokenType;

	public boolean revoked;

	public boolean expired;

	@ManyToOne
	@JoinColumn(name = "user_id")
	public User user;
}
