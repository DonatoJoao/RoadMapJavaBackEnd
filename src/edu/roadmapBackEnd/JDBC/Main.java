package edu.roadmapBackEnd.JDBC;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("João");
        usuario.setLogin("donato");
        usuario.setSenha("12456");
        usuario.setEmail("joaod.morais@gmail.com");

        new UsuarioDAO().cadastrarUsuario(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("João");
        usuario2.setLogin("donato");
        usuario2.setSenha("1234");
        usuario2.setEmail("donato@donato.com");
        new UsuarioDAO().cadastrarUsuario(usuario2);

    }
}
