package Modelos;

public class Podcasts extends Audio {
    private String host;
    private String Descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (getTotalDeCurtidas() > 500) {
            return 10;

        }else {
            return 8;
        }
    }
}
