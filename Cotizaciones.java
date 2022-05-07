/*
Nombre: Rodriguez Chavez Carlos Arnoldo
Fecha: 06/05/2022
Descripcion: Ejercicio de repaso para la materia de programacion movil sobre cotizaciones de un concecionario
 */
package cotizacionesauto;
public class Cotizaciones {
    private int idCotizacion;
    private String descripcionAuto;
    private double precio;
    private int porcentajePInicial;
    private int plazo;
    
    //Constructor Vacío
    public Cotizaciones(){
        
    }
    //Constructor de Parametros
    public Cotizaciones(int idCotizacion, String descripcionAuto, double precio, int porcentajePInicial, int plazo){
        this.idCotizacion = idCotizacion;
        this.descripcionAuto = descripcionAuto;
        this.precio = precio;
        this.porcentajePInicial = porcentajePInicial;
        this.plazo = plazo;
    }
    //Constructor de Copia
    public Cotizaciones(Cotizaciones cotizaciones){
        this.idCotizacion = cotizaciones.idCotizacion;
        this.descripcionAuto = cotizaciones.descripcionAuto;
        this.precio = cotizaciones.precio;
        this.porcentajePInicial = cotizaciones.porcentajePInicial;
        this.plazo = cotizaciones.plazo;
    }
    
    //Encapsulamiento
    public int getIdCotizacion() {
        return idCotizacion;
    }
    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }
    public String getDescripcionAuto() {
        return descripcionAuto;
    }
    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getPorcentajePInicial() {
        return porcentajePInicial;
    }
    public void setPorcentajePInicial(int porcentajePInicial) {
        this.porcentajePInicial = porcentajePInicial;
    }
    public int getPlazo() {
        return plazo;
    }
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    //Metodos de Accion
    public double calcularPagoInicial(){
        double pagoInicial = this.precio*(porcentajePInicial/100.00);
        return pagoInicial;
    }
    
    public double calcularTotalFin(){
        double totalFin = precio-calcularPagoInicial();
        return totalFin;
    }
    
    public double calcularPagoMensual(){
        double pagoMensual = calcularTotalFin()/this.plazo;
        return pagoMensual;
    };
    
    public void imprimirCotizacion(){
        System.out.println("------------------------------------------------------");
        System.out.println("Num Cotizacion: "+this.idCotizacion);
        System.out.println("Descripcion: "+this.descripcionAuto);
        System.out.println("Porcentaje pago Inicial: "+this.porcentajePInicial);
        System.out.println("Plazo: "+this.plazo);
        System.out.println("Precio: "+this.precio);
        System.out.println("\tPago Inicial: "+calcularPagoInicial());
        System.out.println("\tTotal a Financiar: "+calcularTotalFin());
        System.out.println("\tPago Mensual: "+calcularPagoMensual());
        System.out.println("------------------------------------------------------");
    }
    
}
