package br.univille.dacs2022.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class PacienteDTO {
    private long id;
    @NotBlank(message = "É necessário preencher o campo nome")
    @NotNull
    private String nome;
    @Pattern(regexp = "M|F|O", flags = Pattern.Flag.CANON_EQ,
             message = "Utilieze M, F ou O para masculino, feminino ou outros")
    private String sexo;
    @NotNull(message = "É necessário preencher o campo nome")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNascimento;
    private long cidadeId;

    public long getCidadeId() {
        return cidadeId;
    }
    public void setCidadeId(long cidadeId) {
        this.cidadeId = cidadeId;
    }
    private CidadeDTO cidade;
    
    public CidadeDTO getCidade() {
        return cidade;
    }
    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
