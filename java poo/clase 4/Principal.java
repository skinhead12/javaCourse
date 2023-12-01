public class Principal {
    public static void main(String[] args) {

        SuperPersonaje miPersonaje = new SuperPersonaje("pelona", "teletransportacion", 785634756, false);
        System.out.println(miPersonaje.getNombre());
        System.out.println(miPersonaje.getPoder());
        System.out.println(miPersonaje.getValorComercial());

        miPersonaje.setValorComercial(-78);
        System.out.println(miPersonaje.getValorComercial());
        miPersonaje.setValorComercial(56);
        System.out.println(miPersonaje.getValorComercial());

        miPersonaje.correr();
    }
}