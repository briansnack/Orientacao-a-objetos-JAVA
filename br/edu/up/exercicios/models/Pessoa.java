package exercicios.models;
public class Pessoa {

    private String nome;
    private int altura;
    private int peso;
    
    // Usando a IDE
    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public Pessoa(String nome, int altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        if (altura > 15 && altura < 250) {
            this.altura = altura;
        } else {
            // throw Exception();
        }
    }

    public void setPeso(int peso) {
        if (peso >= 0 && peso < 450) {
            this.peso = peso;
        } else {
            // throw Exception();
        }
    }

    // Feito à mão
    // public Pessoa(){

    // }

//     public Pessoa(String nome){
//         this.nome = nome;
//     }

//     public void setNome(String nome){
//         this.nome = nome;
//     }

//     public String getNome(){
//         return this.nome;
//     }

}

