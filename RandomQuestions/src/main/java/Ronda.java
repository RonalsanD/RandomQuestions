public class Ronda {
    Opciones opciones=new Opciones();
    public Ronda(){

    }

    public int pasarRonda(){
        int siguiente=0;
        for (int i=0;i < 6;i++){
            opciones.respuestaCorrectaCategoria1();
            opciones.respuestaCorrectaCategoria2();
            opciones.respuestaCorrectaCategoria3();
            opciones.respuestaCorrectaCategoria4();
            opciones.respuestaCorrectaCategoria5();
        } return siguiente;
    }
     public int noPasaLaRonda(){
        int pierde= 2;
        if(pierde != opciones.respuestaCorrectaCategoria1()){
            System.out.println("Perdiste");
        }
        return pierde;
     }
}
