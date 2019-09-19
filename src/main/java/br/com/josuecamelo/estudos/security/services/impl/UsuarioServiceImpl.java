package br.com.josuecamelo.estudos.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.josuecamelo.estudos.security.entities.Usuario;
import br.com.josuecamelo.estudos.security.repositories.UsuarioRepository;
import br.com.josuecamelo.estudos.security.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> buscarPorEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
}
