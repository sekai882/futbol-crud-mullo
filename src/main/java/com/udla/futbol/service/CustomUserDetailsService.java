package com.udla.futbol.service;

import com.udla.futbol.model.Usuario;
import com.udla.futbol.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByUsername(username);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }

        return new User(usuario.getUsername(), usuario.getPassword(), new ArrayList<>());
    }
}