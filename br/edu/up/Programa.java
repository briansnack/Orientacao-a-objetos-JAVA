import exercicios.models.Carro;
import exercicios.models.Pessoa;

public class Programa {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("João");
        p.setNome("João");
        // p.altura = 300;
        p.setAltura(-300);

        System.out.println("Nome: " + p.getNome());

        Carro uno = new Carro(144);
        
        uno.setMarca("Fiat");
        uno.setModelo("Uno Mille");

        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        // 5km/h

        uno.frear();
        uno.frear();
        uno.frear();

        System.out.println("Marca: " + uno.getMarca());
        System.out.println("Modelo: " + uno.getModelo());
        System.out.println("Velocidade: " + uno.getVelocidade());
        System.out.println("Velocidade Máxima: " + uno.getVelocidadeMaxima());

        Carro bmw = new Carro(240);
        bmw.setMarca("BMW");
        bmw.setModelo("I7");

        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();

        bmw.frear();
        bmw.frear();

        System.out.println("Marca: " + bmw.getMarca());
        System.out.println("Modelo: " + bmw.getModelo());
        System.out.println("Velocidade: " + bmw.getVelocidade());
        System.out.println("Velocidade Máxima: " + bmw.getVelocidadeMaxima());
    }
}
