package chat;

import java.util.Objects;

public class Usuario {
    private String nome;
    private String ipPessoal;

    public Usuario(String nome, String ipPessoal) {
        this.nome = nome;
        this.ipPessoal = ipPessoal;
    }

    public String getNome() {
        return this.nome;
    }

    public String getIpPessoal() {
        return this.ipPessoal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.ipPessoal, other.ipPessoal)) {
            return false;
        }
        return true;
    }
}
