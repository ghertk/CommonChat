package chat;

public class Mensagem {
    private Usuario usuario;
    private String mensagem;

    public Mensagem(Usuario usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    @Override
    public String toString() {
        return usuario.getNome() + " escreveu: " + mensagem;
    }
}
