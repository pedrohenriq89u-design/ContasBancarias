public abstract class Conta {
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

    public Conta(String numero, String agencia, String titular, double saldoInicial) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0){
            saldo +=valor;
        }else {
            IO.println("Seu Deposito de :" + valor + "foi realizado");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
        }else{
            IO.println("Saque não efetuado");
        }
    }
    public void exibirsaldo(){

    }
}