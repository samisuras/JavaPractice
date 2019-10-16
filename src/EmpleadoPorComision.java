public class EmpleadoPorComision {
    //SI USAMOS PROTECTED PODEMOS USARLAS SIN USAR SUPER

    private final String primerNombre;
    private final String apellidoPAterno;
    private final String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(){
        this.primerNombre = "";
        this.apellidoPAterno = "";
        this.numeroSeguroSocial = "";
        this.ventasBrutas = 0;
        this.tarifaComision = 0;
    };

    public EmpleadoPorComision(String primerNombre, String apellidoPAterno, String numeroSeguroSocial,
                               double ventasBrutas, double tarifaComision) {

        //Checar si la informacion es correcta

        if(ventasBrutas <= 0.0)
            throw new IllegalArgumentException(
            "Las ventas deben de ser mayor a 0");
        if(tarifaComision <= 0.0)
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0"
            );

        this.primerNombre = primerNombre;
        this.apellidoPAterno = apellidoPAterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPAterno() {
        return apellidoPAterno;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if(ventasBrutas <= 0.0)
            throw new IllegalArgumentException("Las ventas deben de ser mayor a 0");
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision <= 0.0 || tarifaComision > 1.0)
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0"
            );
        this.tarifaComision = tarifaComision;
    }

    //Calcular los ingresos
    public double ingresos(){
         return this.tarifaComision * this.ventasBrutas;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "empleado por comision", primerNombre, apellidoPAterno,
                "numero de Seguridad Social", numeroSeguroSocial,
                "ventas brutas", ventasBrutas,
                "tarifa de comision", tarifaComision);
    }
}
