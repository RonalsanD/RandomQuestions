public class Categoria {
    private int numrandom;
    public Categoria(){

    }
    Opciones opciones= new Opciones();
    Pregunta pregunta=new Pregunta();
    public int categoria1  () {
        numrandom=(int)Math.random()*6;
        switch (numrandom){
            case 0:
                pregunta.preguntasCategoria1().get(0);
                opciones.opcionesCategoria1Pregunta1();
                break;
            case 1:
                pregunta.preguntasCategoria1().get(1);
                opciones.opcionesCategoria1Pregunta2();
                break;
            case 2:
                pregunta.preguntasCategoria1().get(2);
                opciones.opcionesCategoria1Pregunta3();
                break;
            case 3:
                pregunta.preguntasCategoria1().get(3);
                opciones.opcionesCategoria1Pregunta4();
                break;
            case 4:
                pregunta.preguntasCategoria1().get(4);
                opciones.opcionesCategoria1Pregunta5();
                break;
        }return numrandom;
    }
    public int categoria2 () {
        numrandom=(int)Math.random()*6;
        switch (numrandom){
            case 0:
                pregunta.preguntasCategoria2().get(0);
                opciones.opcionesCategoria2Pregunta1();
                break;
            case 1:
                pregunta.preguntasCategoria2().get(1);
                opciones.opcionesCategoria2Pregunta2();
                break;
            case 2:
                pregunta.preguntasCategoria2().get(2);
                opciones.opcionesCategoria2Pregunta3();
                break;
            case 3:
                pregunta.preguntasCategoria2().get(3);
                opciones.opcionesCategoria2Pregunta4();
                break;
            case 4:
                pregunta.preguntasCategoria2().get(4);
                opciones.opcionesCategoria2Pregunta5();
                break;
        }return numrandom;
    }
    public int categoria3 () {
        numrandom=(int)Math.random()*6;
        switch (numrandom){
            case 0:
                pregunta.preguntasCategoria3().get(0);
                opciones.opcionesCategoria3Pregunta1();
                break;
            case 1:
                pregunta.preguntasCategoria3().get(1);
                opciones.opcionesCategoria3Pregunta2();
                break;
            case 2:
                pregunta.preguntasCategoria3().get(2);
                opciones.opcionesCategoria3Pregunta3();
                break;
            case 3:
                pregunta.preguntasCategoria3().get(3);
                opciones.opcionesCategoria3Pregunta4();
                break;
            case 4:
                pregunta.preguntasCategoria3().get(4);
                opciones.opcionesCategoria3Pregunta5();
                break;
        }return numrandom;
    }
    public int categoria4 () {
        numrandom=(int)Math.random()*6;
        switch (numrandom){
            case 0:
                pregunta.preguntasCategoria4().get(0);
                opciones.opcionesCategoria4Pregunta1();
                break;
            case 1:
                pregunta.preguntasCategoria4().get(1);
                opciones.opcionesCategoria4Pregunta2();
                break;
            case 2:
                pregunta.preguntasCategoria4().get(2);
                opciones.opcionesCategoria4Pregunta3();
                break;
            case 3:
                pregunta.preguntasCategoria4().get(3);
                opciones.opcionesCategoria4Pregunta4();
                break;
            case 4:
                pregunta.preguntasCategoria4().get(4);
                opciones.opcionesCategoria4Pregunta5();
                break;
        }return numrandom;
    }
    public int categoria5 () {
        numrandom = (int) Math.random() * 6;
        switch (numrandom) {
            case 0:
                pregunta.preguntasCategoria5().get(0);
                opciones.opcionesCategoria5Pregunta1();
                break;
            case 1:
                pregunta.preguntasCategoria5().get(1);
                opciones.opcionesCategoria5Pregunta2();
                break;
            case 2:
                pregunta.preguntasCategoria5().get(2);
                opciones.opcionesCategoria5Pregunta3();
                break;
            case 3:
                pregunta.preguntasCategoria5().get(3);
                opciones.opcionesCategoria5Pregunta4();
                break;
            case 4:
                pregunta.preguntasCategoria5().get(4);
                opciones.opcionesCategoria5Pregunta5();
                break;
        }
        return numrandom;
    }
}
