package br.com.josuecamelo.estudos.security.dto;

public class JwtAuthenticationDto {

	private String email;
	private String senha;

	public JwtAuthenticationDto() {
	}

	@javax.validation.constraints.NotEmpty(message = "Email não pode ser vazio.")
	@javax.validation.constraints.Email(message = "Email inválido.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@javax.validation.constraints.NotEmpty(message = "Senha não pode ser vazia.")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "JwtAuthenticationRequestDto [email=" + email + ", senha=" + senha + "]";
	}

}
