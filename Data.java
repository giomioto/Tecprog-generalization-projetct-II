public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido!");
        } else if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido!");
        } else if (mes == 2 && dia > 28) {
            System.out.println("Dia inválido!");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Dia inválido!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public Data() {

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        if (mes == 2 && dia > 28) {
            System.out.println("Dia inválido!");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Dia inválido!");
        } else {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido!");
        } else {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int calculaIdade(Data data) {
        int idade = data.ano - ano;
        if (data.mes < mes || (data.mes == mes && data.dia < dia)) {
            idade--;
        }
        return idade;
    }

    public String nomeMes() {
        String nomeMes = "";
        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
        }
        return nomeMes;
    }

    public String mostrarData() {
        return dia + " de " + nomeMes() + " de " + ano;
    }
}
