package application.entities;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nome;
    private Double saldo;
    
    public ContaTerminal(){

    }
    public ContaTerminal(Integer numero, String agencia, String nome, Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo  = saldo;
    }

    public Integer getNumero(int numero){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getAgencia(String agencia){
        return this.agencia;
    }

    public void setAgencia(String agencia){
       this.agencia = agencia;
    }
    public String getNome(String nome){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
     }

     public Double getSaldo(double saldo){
        return this.saldo;
     }

     @Override
     public String toString(){
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: " + String.format("$%.2f", saldo) + " já está disponível para saque.";
     }
}
