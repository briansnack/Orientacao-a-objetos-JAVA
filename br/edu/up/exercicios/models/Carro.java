package exercicios.models;
public class Carro {
    
    // public static enum Tipo{
    //     UNO,
    //     BMW
    // }
    
    // Atributos
    // private Tipo tipo;
    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int velocidade = 0;

    // Método Construtor
    public Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Getter (pegar)
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    // Setter (atribuir)
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void acelerar(){
        if (this.velocidade < this.velocidadeMaxima) {
            velocidade++;
        }
   
        // if (tipo.equals(Tipo.UNO) && this.velocidade < 144) {
        //     velocidade++;
        // } else if(tipo.equals(Tipo.BMW) && this.velocidade < 240){
        //     velocidade++;
        // }
    }
    public void frear(){
        if (velocidade > 0) {
            velocidade--;
        }
    }
}
