public class TelefonoMovil {

    private String modeloMovil;

    private int precioMovil;

    private boolean tiene4g;

    public TelefonoMovil(String modelo, int precio){
        modeloMovil = modelo;
        precioMovil = precio;
        boolean tiene4g= true;
    }

    public int getPrecioMovil() {
        return precioMovil;
    }

    public String getModeloMovil() {
        return modeloMovil;
    }

    public boolean getTiene4g() {
        return tiene4g;
    }

    public void setPropietario(String propietario) {
        modeloMovil = propietario;
    }

    public void roturaPantalla(int variablePrecio) {
        precioMovil = precioMovil + variablePrecio;
    }

    public void alternaTiene4g() {
        if (tiene4g == true){
            tiene4g = false ;
        }
        else {
            tiene4g = true ;
        }
    }

    public String devolverDetalles() {
        return "Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g;
    }
    
    public void imprimirDetalles() {
        System.out.println("Propietario: "+ modeloMovil +" Precio: "+ precioMovil +" Tiene 4G: "+ tiene4g);
    }
}