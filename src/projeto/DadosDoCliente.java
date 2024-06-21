package projeto;
public class DadosDoCliente {
    private double saldo = 2500;
    private String nome = "IGOR ROSA";
    private String tipoDaConta = "Corrente";
    private double valorTransferir;
    private double valorReceber;
    private int oqFazer;




    public void Receber() {
        saldo += valorReceber;
    }

    public void transacao() {
        saldo = saldo - valorTransferir;
    }

    public void setValorTransferir(double valorTransferir) {
        this.valorTransferir = valorTransferir;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getValorTransferir() {
        return valorTransferir;
    }

    public void setValorReceber(double valorReceber) {
        this.valorReceber = valorReceber;
    }

    public void opcaoSelecionada() {
        
    }

    public void setOqFazer(int oqFazer) {
        this.oqFazer = oqFazer;
    }

    public int getOqFazer() {
        return oqFazer;
    }
}