package e1;

public class Billete {
    String origen,destino,fecha;
    float precio;

    public Billete(String origen,String destino,float precio,String fecha){
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.fecha=fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }
}
