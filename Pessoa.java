import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private char sexo;
    private Data dtNasc;

    public Pessoa(String nome, char sexo, Data dtNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public Data getdtNasc() {
        return dtNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setdtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String toString() {
        LocalDate hoje = LocalDate.now();
        return "Nome: " + nome + "\nSexo: " + sexo + "\nData de Nascimento: " + dtNasc.mostrarData() + "\nIdade: " + dtNasc.calculaIdade(new Data(hoje.getDayOfMonth(), hoje.getMonthValue(), hoje.getYear())) + " anos";
    }

    
}
