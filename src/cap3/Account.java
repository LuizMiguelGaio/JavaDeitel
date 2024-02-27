package src.cap3;
// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.

public class Account {

    private String name; // variável de instância
    private double balance; // variável de instância

    public Account(String name, double balance){
        this.name = name; //atribui name à variavel de instancia name

        if(balance > 0.0)
            this.balance=balance;
    }
    //método que deposita(adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if(depositAmount > 0.0) //se depositAmount for válido
            balance = balance + depositAmount; //o adiciona ao saldo
    }

    //método que retorna saldo da conta
    public double getBalance(){
        return balance;
    }

    // método para definir o nome no objeto
    public void setName(String name) {

        this.name = name; // armazena o nome
    }

    // método para recuperar o nome do objeto
    public String getName() {

        return name; // retorna valor do nome para o chamador
    }
} // fim da classe Account