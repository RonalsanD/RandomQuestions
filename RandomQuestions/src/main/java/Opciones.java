import java.util.ArrayList;
import java.util.Scanner;


public class Opciones {
    ArrayList<String> opciones;
    public Opciones (){

    }
    Pregunta pregunta=new Pregunta();

    public ArrayList opcionesCategoria1Pregunta1(){
        opciones = new ArrayList<String>();
        opciones.add("1. Café");
        opciones.add("2. Rosado");
        opciones.add("3. Verde");
        opciones.add("4. Violeta");
        return opciones;
    }
    public ArrayList opcionesCategoria1Pregunta2(){
        opciones = new ArrayList<String>();
        opciones.add("1. 6");
        opciones.add("2. 8");
        opciones.add("3. 10");
        opciones.add("4. 4");
        return opciones;
    }
    public ArrayList opcionesCategoria1Pregunta3(){
        opciones = new ArrayList<String>();
        opciones.add("1. El gato");
        opciones.add("2. El perro");
        opciones.add("3. Un pez");
        opciones.add("4. Un cocodrilo");
        return opciones;
    }
    public ArrayList opcionesCategoria1Pregunta4(){
        opciones = new ArrayList<String>();
        opciones.add("1. La Gacela Saltarina");
        opciones.add("2. El Guepardo chita");
        opciones.add("3. El León");
        opciones.add("4. Antílope Americano");
        return opciones;
    }
    public ArrayList opcionesCategoria1Pregunta5() {
        opciones = new ArrayList<String>();
        opciones.add("1. La Gacela Saltarina");
        opciones.add("2. El Guepardo chita");
        opciones.add("3. El León");
        opciones.add("4. Antílope Americano");
        return opciones;
    }
    public ArrayList opcionesCategoria2Pregunta1(){
        opciones = new ArrayList<String>();
        opciones.add("1. Pacifico");
        opciones.add("2. Atlántico");
        opciones.add("3. Artico");
        opciones.add("4. Antártico");
        return opciones;
    }
    public ArrayList opcionesCategoria2Pregunta2(){
        opciones = new ArrayList<String>();
        opciones.add("1. El resultado es 45");
        opciones.add("2. El resultado es 30");
        opciones.add("3. El resultado es 38");
        opciones.add("4. El resultado es 49");
        return opciones;
    }
    public ArrayList opcionesCategoria2Pregunta3(){
        opciones = new ArrayList<String>();
        opciones.add("1. Un cántate canadiense");
        opciones.add("2. Un actor alemán");
        opciones.add("3. Un científico estadounidense");
        opciones.add("4. El Líder de la iglesia católica");
        return opciones;
    }
    public ArrayList opcionesCategoria2Pregunta4(){
        opciones = new ArrayList<String>();
        opciones.add("1. Tierra");
        opciones.add("2.  Mercurio");
        opciones.add("3. Marte");
        opciones.add("4. Júpiter");
        return opciones;
    }
    public ArrayList opcionesCategoria2Pregunta5() {
        opciones = new ArrayList<String>();
        opciones.add("1. Africa");
        opciones.add("2. Asia");
        opciones.add("3. Europa");
        opciones.add("4. Oceanía");
        return opciones;
    }
    public ArrayList opcionesCategoria3Pregunta1(){
        opciones = new ArrayList<String>();
        opciones.add("1. Alemania");
        opciones.add("2. Austria");
        opciones.add("3. Berlin");
        opciones.add("4. Russia");
        return opciones;
    }
    public ArrayList opcionesCategoria3Pregunta2(){
        opciones = new ArrayList<String>();
        opciones.add("1. 5 años");
        opciones.add("2. 10 años");
        opciones.add("3. 50 años");
        opciones.add("4. 15 años");
        return opciones;
    }
    public ArrayList opcionesCategoria3Pregunta3(){
        opciones = new ArrayList<String>();
        opciones.add("1. El Señor de los Anillos");
        opciones.add("2. Don Quijote de la Mancha");
        opciones.add("3. La Biblia");
        opciones.add("4. El Principito");
        return opciones;
    }
    public ArrayList opcionesCategoria3Pregunta4(){
        opciones = new ArrayList<String>();
        opciones.add("1. Gaélico");
        opciones.add("2. Hebreo");
        opciones.add("3. Euskera");
        opciones.add("4. Latín");
        return opciones;
    }
    public ArrayList opcionesCategoria3Pregunta5() {
        opciones = new ArrayList<String>();
        opciones.add("1. Carnívoro");
        opciones.add("2. Omnívoro");
        opciones.add("3. Herbívoro");
        opciones.add("4. Insectívoro");
        return opciones;
    }
    public ArrayList opcionesCategoria4Pregunta1(){
        opciones = new ArrayList<String>();
        opciones.add("1. Australia");
        opciones.add("2. Egipto");
        opciones.add("3. Siria");
        opciones.add("4. China");
        return opciones;
    }
    public ArrayList opcionesCategoria4Pregunta2(){
        opciones = new ArrayList<String>();
        opciones.add("1. Tortuga de las Galápagos");
        opciones.add("2. Las Esponjas Marinas");
        opciones.add("3. Almeja de Islandia");
        opciones.add("4. Medusa Turritopsis nutricula");
        return opciones;
    }
    public ArrayList opcionesCategoria4Pregunta3(){
        opciones = new ArrayList<String>();
        opciones.add("1. Vallisoletano");
        opciones.add("2. Valluno");
        opciones.add("3. Vallaloid");
        opciones.add("4. Vallesto");
        return opciones;
    }
    public ArrayList opcionesCategoria4Pregunta4(){
        opciones = new ArrayList<String>();
        opciones.add("1. Universidad de Bolonia");
        opciones.add("2. Universidad de Oxford");
        opciones.add("3. Universidad de Cambriege");
        opciones.add("4. Universidad de Salamanca");
        return opciones;
    }
    public ArrayList opcionesCategoria4Pregunta5() {
        opciones = new ArrayList<String>();
        opciones.add("1. Equina");
        opciones.add("2. Castores");
        opciones.add("3. Delfines");
        opciones.add("4. Armadillo");
        return opciones;
    }
    public ArrayList opcionesCategoria5Pregunta1(){
        opciones = new ArrayList<String>();
        opciones.add("1. El lago Titicaca");
        opciones.add("2. El lago Victoria");
        opciones.add("3. El lago Baikal");
        opciones.add("4. El Lago Tanganica ");
        return opciones;
    }
    public ArrayList opcionesCategoria5Pregunta2(){
        opciones = new ArrayList<String>();
        opciones.add("1. Reactivo de Tollens");
        opciones.add("2. Agua Regia");
        opciones.add("3. Las sales de permagrado");
        opciones.add("4. Acido clorhidrico");
        return opciones;
    }
    public ArrayList opcionesCategoria5Pregunta3(){
        opciones = new ArrayList<String>();
        opciones.add("1. El Basic");
        opciones.add("2. El Cobol");
        opciones.add("3. El C++");
        opciones.add("4. El FORTRAN");
        return opciones;
    }
    public ArrayList opcionesCategoria5Pregunta4(){
        opciones = new ArrayList<String>();
        opciones.add("1. Júpiter");
        opciones.add("2. Saturno");
        opciones.add("3. Marte");
        opciones.add("4. Neptuno");
        return opciones;
    }
    public ArrayList opcionesCategoria5Pregunta5() {
        opciones = new ArrayList<String>();
        opciones.add("1. Israel");
        opciones.add("2. India");
        opciones.add("3. Pakistán");
        opciones.add("4. Mongolia");
        return opciones;
    }
    public void respuestaCorrectaCategoria1 (int numrandom){
        System.out.println("Elige la respuesta correcta");
        Scanner leer=new Scanner(System.in);
        int eleccion= leer.nextInt();
        switch (numrandom){
            case 0:
                if(eleccion==3){
                System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + " es incorrecta");
                }
                break;
            case 1:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + " es incorrecta");
                }
                break;
            case 2:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + " es incorrecta");
                }
                break;
            case 3:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + " es incorrecta");
                }
                break;
            case 4:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + " es incorrecta");
                }
                break;
        }
    }
   public void respuestaCorrectaCategoria2 (int numrandom){
       System.out.println("Elige la respuesta correcta");
       Scanner leer=new Scanner(System.in);
       int eleccion= leer.nextInt();
        switch (numrandom){
            case 0:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 1:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 2:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 3:
                if(eleccion==3){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 4:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
        }
    }
    public void respuestaCorrectaCategoria3 (int numrandom){
        System.out.println("Elige la respuesta correcta");
        Scanner leer=new Scanner(System.in);
        int eleccion= leer.nextInt();
        switch (numrandom){
            case 0:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 1:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 2:
                if(eleccion==3){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 3:
                if(eleccion==4){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 4:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
        }
    }
    public void respuestaCorrectaCategoria4 (int numrandom){
        System.out.println("Elige la respuesta correcta");
        Scanner leer=new Scanner(System.in);
        int eleccion= leer.nextInt();
        switch (numrandom){
            case 0:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 1:
                if(eleccion==4){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 2:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 3:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 4:
                if(eleccion==1){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
        }
    }
    public void respuestaCorrectaCategoria5 (int numrandom){
        System.out.println("Elige la respuesta correcta");
        Scanner leer=new Scanner(System.in);
        int eleccion= leer.nextInt();
        switch (numrandom){
            case 0:
                if(eleccion==3){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 1:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 2:
                if(eleccion==4){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 3:
                if(eleccion==2){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
            case 4:
                if(eleccion==3){
                    System.out.println("La eleccion "+ eleccion +" es correcta");}
                else {
                    System.out.println("La eleccion "+ eleccion + "es incorrecta");
                }
                break;
        }
    }
}

