public class Colaborador extends Pessoa {

    int faltasMes;
    double salario;

    public Colaborador(String nome, char sexo, Data dtNasci, int faltasMes, double salario) {
        super(nome, sexo, dtNasci);
        this.faltasMes = faltasMes;
        this.salario = salario;
    }

    public int getFaltasMes() {
        return faltasMes;
    }

    public double getSalario() {
        return salario;
    }

    public void setFaltasMes(int faltasMes) {
        this.faltasMes = faltasMes;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioFinal() {
        return salario + valorPremio();
    }

    public double valorPremio() {
        if (faltasMes == 0) {
            return 200;
        }
        else if (faltasMes == 1 || faltasMes == 2) {
            return 100;
        }
        else if (faltasMes == 3 || faltasMes == 4) {
            return 50;
        }
        else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + "\n" +
               "Faltas no mês: " + faltasMes + "\n" +
               "Salário: R$ " + salario + "\n" +
               "Valor do Prêmio: R$ " + valorPremio() + "\n" +
               "Salário Final: R$ " + salarioFinal();
    }
    
}