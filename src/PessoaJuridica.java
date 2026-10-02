public class PessoaJuridica extends Conta{
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    public PessoaJuridica(String numero, String agencia, String titular, double saldoInicial) {
        super(numero, agencia, titular, saldoInicial);
    }
}