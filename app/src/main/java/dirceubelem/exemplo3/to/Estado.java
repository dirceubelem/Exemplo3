package dirceubelem.exemplo3.to;

/**
 * Created by dirceubelem on 06/03/15.
 */
public class Estado {

    public int codigo;
    public String descricao;

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Estado() {

    }
}
