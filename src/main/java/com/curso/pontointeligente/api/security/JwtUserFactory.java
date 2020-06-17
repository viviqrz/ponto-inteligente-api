package com.curso.pontointeligente.api.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.curso.pontointeligente.api.entities.Funcionario;
import com.curso.pontointeligente.api.enums.PerfilEnum;

public class JwtUserFactory {

	public JwtUserFactory() {
	}
	
	/**
	 * Converte e gera um JwtUser com base nos dados de um funcionário
	 * @param funcionario
	 * @return
	 */
	public static JwtUser create(Funcionario funcionario) {
		return new JwtUser(funcionario.getId(), funcionario.getEmail(), 
				funcionario.getSenha(),
				mapToGrantedAuthorities(funcionario.getPerfil()));
	}

	/**
	 * Converte o perfil do usuário para o formato utilizado pelo Spring Security
	 * @param perfil
	 * @return
	 */
	private static Collection<? extends GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
	}
	
	
}
