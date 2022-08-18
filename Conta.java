import java.util.Calendar;

public class Conta {
    private double saldo;
    private Calendar dataDeOperacao;

    // ***** CONSTRUTOR
    public Conta() {
        this.saldo = 0;
    }

    // ***** MÉTODOS
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        this.dataDeOperacao = Calendar.getInstance();
    }

    // ***** Getters
    public double getSaldo() {
        return saldo;
    }
    public Calendar getDataDeOperacao() {
        return dataDeOperacao;
    }

    // ***** Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setDataDeOperacao(Calendar dataDeOperacao) {
        this.dataDeOperacao = dataDeOperacao;
    }

}
