package com.santosjhony.demo.park.api.service;

import com.santosjhony.demo.park.api.entity.Usuario;
import com.santosjhony.demo.park.api.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor //faz a injeção de dep
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
