import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        Ronda ronda = new Ronda();
        Pregunta pregunta = new Pregunta();
        Opciones opciones =new Opciones();
         int numrandom=(int)(Math.random()*5);
        categoria.imprimirCategoria1(numrandom);
        opciones.respuestaCorrectaCategoria1(numrandom);




    }
}
