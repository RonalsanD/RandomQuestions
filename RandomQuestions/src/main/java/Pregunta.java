import java.util.ArrayList;

public class Pregunta {
    ArrayList<String> preguntas;

    public Pregunta (){

    }

    public ArrayList preguntasCategoria1 () {
        preguntas = new ArrayList<String>();
        preguntas.add("¿Cuál es la combinación del color amarillo y azul?");
        preguntas.add("¿Cuántas patas tiene una araña?");
        preguntas.add("¿Cuál es el mejor amigo del hombre?");
        preguntas.add("¿Cuál es el animal más rápido del mundo por tierra?");
        preguntas.add("¿En qué ciudad se encuentra la torre Eiffel?");
        return preguntas;
    }

    public ArrayList preguntasCategoria2 () {
        preguntas = new ArrayList<String>();
        preguntas.add("¿Cuál es el océano más grande del mundo?");
        preguntas.add("¿Si 50 es el 100%, ¿cuánto es el 90%?");
        preguntas.add("¿Quién es Justin Bieber?");
        preguntas.add("¿Como se llama el cuarto planeta del Sistema solar?");
        preguntas.add("¿En qué continente es Egipto?");
        return preguntas;
    }
    public ArrayList preguntasCategoria3 () {
        preguntas = new ArrayList<String>();
        preguntas.add("¿En qué país nació Adolf Hitler?");
        preguntas.add("¿Cuántos años tiene un lustro?");
        preguntas.add("¿Cuál es libro mas vendido de la historia?");
        preguntas.add("¿De que lengua proviene el español?");
        preguntas.add("¿El ser humano es?");
        return preguntas;
    }
    public ArrayList preguntasCategoria4 () {
        preguntas = new ArrayList<String>();
        preguntas.add("¿Cuál es país con más camellos Salvajes?");
        preguntas.add("¿Cuál él es animal que es casi inmortal?");
        preguntas.add("¿Cuál es el gentilicio de la ciudad de Valladolid?");
        preguntas.add("¿Cuál es la universidad más antigua del mundo?");
        preguntas.add("¿Cuál mamífero aparte del ornitorrinco pone huevos?");
        return preguntas;
    }
    public ArrayList preguntasCategoria5 () {
        preguntas = new ArrayList<String>();
        preguntas.add("¿Cuál es el lago más profundo del mundo?");
        preguntas.add("¿Qué sustancia es capaz de disolver el oro?");
        preguntas.add("¿Cuál fue el primer lenguaje de programación?");
        preguntas.add("¿Qué planeta del sistema sola tiene más satélites naturales?");
        preguntas.add("¿En qué país se encuentra el K2?");
        return preguntas;
    }
   /* public String elecciondeCategoria () {
        String RandomCategorias="";
        switch (RandomCategorias){
            case "ronda 1" :

                break;
            case "ronda 2":

                break;
            case "ronda 3":

                break;
            case "ronda 4":

                break;
            case "ronda 5":

                break;
        }
        return RandomCategorias;*/

}
