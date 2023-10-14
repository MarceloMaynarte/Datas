public class DATE {
    int dia;
    int mes;
    int ano;

    DATE(){
        this(1,12, 2023);

    }
    DATE(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String ObterDateFormatada(){
        return String.format("%d%d%d", this.dia, this.mes, this.ano);
    }
    void ImprimirDataFormatada(){
        System.out.println(this.ObterDateFormatada());
    }
}
