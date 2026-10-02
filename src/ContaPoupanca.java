public class ContaPoupanca extends Conta{
    private String numero;
    private String agencia;
    private String titular;
    private int saldo;

    public ContaPoupanca(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }
}