public class Categoria {

    public Categoria(){

    }

    Opciones opciones= new Opciones();
    Pregunta pregunta=new Pregunta();



    public void imprimirCategoria1  (int numrandom) {
        switch (numrandom){
            case 0:
                System.out.println(pregunta.preguntasCategoria1().get(0));
                for (int i = 0; i < opciones.opcionesCategoria1Pregunta1().size(); i++) {
                    System.out.println(opciones.opcionesCategoria1Pregunta1().get(i));
                }
                break;
            case 1:
                System.out.println(pregunta.preguntasCategoria1().get(1));
                for (int i = 0; i < opciones.opcionesCategoria1Pregunta2().size(); i++) {
                    System.out.println(opciones.opcionesCategoria1Pregunta2().get(i));
                }
                break;
            case 2:
                System.out.println(pregunta.preguntasCategoria1().get(2));
                for (int i = 0; i < opciones.opcionesCategoria1Pregunta3().size(); i++) {
                    System.out.println(opciones.opcionesCategoria1Pregunta3().get(i));
                }
                break;
            case 3:
                System.out.println(pregunta.preguntasCategoria1().get(3));
                for (int i = 0; i < opciones.opcionesCategoria1Pregunta4().size(); i++) {
                    System.out.println(opciones.opcionesCategoria1Pregunta4().get(i));
                }
                break;
            case 4:
                System.out.println(pregunta.preguntasCategoria1().get(4));
                for (int i = 0; i < opciones.opcionesCategoria1Pregunta5().size(); i++) {
                    System.out.println(opciones.opcionesCategoria1Pregunta5().get(i));
                }
                break;
        }
    }
    public void imprimirCategoria2(int numrandom) {
        switch (numrandom){
            case 0:
                System.out.println(pregunta.preguntasCategoria2().get(0));
                for (int i = 0; i < opciones.opcionesCategoria2Pregunta1().size(); i++) {
                    System.out.println(opciones.opcionesCategoria2Pregunta1().get(i));
                }
                break;
            case 1:
                System.out.println(pregunta.preguntasCategoria2().get(1));
                for (int i = 0; i < opciones.opcionesCategoria2Pregunta2().size(); i++) {
                    System.out.println(opciones.opcionesCategoria2Pregunta2().get(i));
                }
                break;
            case 2:
                System.out.println(pregunta.preguntasCategoria2().get(2));
                for (int i = 0; i < opciones.opcionesCategoria2Pregunta3().size(); i++) {
                    System.out.println(opciones.opcionesCategoria2Pregunta3().get(i));
                }
                break;
            case 3:
                System.out.println(pregunta.preguntasCategoria2().get(3));
                for (int i = 0; i < opciones.opcionesCategoria2Pregunta4().size(); i++) {
                    System.out.println(opciones.opcionesCategoria2Pregunta4().get(i));
                }
                break;
            case 4:
                System.out.println(pregunta.preguntasCategoria2().get(4));
                for (int i = 0; i < opciones.opcionesCategoria2Pregunta5().size(); i++) {
                    System.out.println(opciones.opcionesCategoria2Pregunta5().get(i));
                }
                break;
        }
    }
    public void imprimirCategoria3(int numrandom) {
        switch (numrandom){
            case 0:
                System.out.println(pregunta.preguntasCategoria3().get(0));
                for (int i = 0; i < opciones.opcionesCategoria3Pregunta1().size(); i++) {
                    System.out.println(opciones.opcionesCategoria3Pregunta1().get(i));
                }
                break;
            case 1:
                System.out.println(pregunta.preguntasCategoria3().get(1));
                for (int i = 0; i < opciones.opcionesCategoria3Pregunta2().size(); i++) {
                    System.out.println(opciones.opcionesCategoria3Pregunta2().get(i));
                }
                break;
            case 2:
                System.out.println(pregunta.preguntasCategoria3().get(2));
                for (int i = 0; i < opciones.opcionesCategoria3Pregunta3().size(); i++) {
                    System.out.println(opciones.opcionesCategoria3Pregunta3().get(i));
                }
                break;
            case 3:
                System.out.println(pregunta.preguntasCategoria3().get(3));
                for (int i = 0; i < opciones.opcionesCategoria3Pregunta4().size(); i++) {
                    System.out.println(opciones.opcionesCategoria3Pregunta4().get(i));
                }
                break;
            case 4:
                System.out.println(pregunta.preguntasCategoria3().get(4));
                for (int i = 0; i < opciones.opcionesCategoria3Pregunta5().size(); i++) {
                    System.out.println(opciones.opcionesCategoria3Pregunta5().get(i));
                }
                break;
        }
    }
    public void imprimirCategoria4(int numrandom) {
        switch (numrandom){
            case 0:
                System.out.println(pregunta.preguntasCategoria4().get(0));
                for (int i = 0; i < opciones.opcionesCategoria4Pregunta1().size(); i++) {
                    System.out.println(opciones.opcionesCategoria4Pregunta1().get(i));
                }
                break;
            case 1:
                System.out.println(pregunta.preguntasCategoria4().get(1));
                for (int i = 0; i < opciones.opcionesCategoria4Pregunta2().size(); i++) {
                    System.out.println(opciones.opcionesCategoria4Pregunta2().get(i));
                }
                break;
            case 2:
                System.out.println(pregunta.preguntasCategoria4().get(2));
                for (int i = 0; i < opciones.opcionesCategoria4Pregunta3().size(); i++) {
                    System.out.println(opciones.opcionesCategoria4Pregunta3().get(i));
                }
                break;
            case 3:
                System.out.println(pregunta.preguntasCategoria4().get(3));
                for (int i = 0; i < opciones.opcionesCategoria4Pregunta4().size(); i++) {
                    System.out.println(opciones.opcionesCategoria4Pregunta4().get(i));
                }
                break;
            case 4:
                System.out.println(pregunta.preguntasCategoria4().get(4));
                for (int i = 0; i < opciones.opcionesCategoria4Pregunta5().size(); i++) {
                    System.out.println(opciones.opcionesCategoria4Pregunta5().get(i));
                }
                break;
        }
    }

    public void imprimirCategoria5(int numrandom) {
        switch (numrandom) {
            case 0:
                System.out.println(pregunta.preguntasCategoria5().get(0));
                for (int i = 0; i < opciones.opcionesCategoria5Pregunta1().size(); i++) {
                    System.out.println(opciones.opcionesCategoria5Pregunta1().get(i));
                }
                break;
            case 1:
                System.out.println(pregunta.preguntasCategoria5().get(1));
                for (int i = 0; i < opciones.opcionesCategoria5Pregunta2().size(); i++) {
                    System.out.println(opciones.opcionesCategoria5Pregunta2().get(i));
                }
                break;
            case 2:
                System.out.println(pregunta.preguntasCategoria5().get(2));
                for (int i = 0; i < opciones.opcionesCategoria5Pregunta3().size(); i++) {
                    System.out.println(opciones.opcionesCategoria5Pregunta3().get(i));
                }
                break;
            case 3:
                System.out.println(pregunta.preguntasCategoria5().get(3));
                for (int i = 0; i < opciones.opcionesCategoria5Pregunta4().size(); i++) {
                    System.out.println(opciones.opcionesCategoria5Pregunta4().get(i));
                }
                break;
            case 4:
                System.out.println(pregunta.preguntasCategoria5().get(4));
                for (int i = 0; i < opciones.opcionesCategoria5Pregunta5().size(); i++) {
                    System.out.println(opciones.opcionesCategoria5Pregunta5().get(i));
                }
                break;
        }
    }
}
