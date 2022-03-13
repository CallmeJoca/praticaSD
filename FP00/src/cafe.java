import java.io.*;

public class cafe implements Serializable {
    
    int id;
    String nome;
    float valor;

    cafe(int i){
        id = i;
        nome = "nome" + i;
        valor = i * 0.5f;
    }

    int getId(){
        return id;
    }
    void setId(int newID){
        id = newID;
    }

    String getNome(){
        return nome;
    }
    void setNome(String newNome){
        nome = newNome;
    }

    float getValor(){
        return valor;
    }
    void setValor(float newValor){
        valor = newValor;
    }

    String tostring(){
        return "id: " + id + "\nnome: " + nome + "\nvalor: " + valor + "\n";
    }

}
