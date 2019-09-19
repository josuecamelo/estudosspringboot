package br.com.josuecamelo.estudos.security.services;

import java.util.Optional;

import br.com.josuecamelo.estudos.security.entities.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 * 
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> buscarPorEmail(String email);

}
