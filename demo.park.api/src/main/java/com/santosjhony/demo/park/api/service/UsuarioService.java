package com.santosjhony.demo.park.api.service;

import com.santosjhony.demo.park.api.entity.Usuario;
import com.santosjhony.demo.park.api.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor //faz a injeção de dep
@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    @Transactional
    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Usuário não encontrado")
        );
    }
    @Transactional
    public Usuario editarSenha(Long id, String password){
        Usuario user = buscarPorId(id);
        user.setPassword(password);
        return user;
    }
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }
}
