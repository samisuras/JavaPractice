public class EmpleadoBaseMascomision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMascomision(String primerNombre, String apellidoPAterno,
                                   String numeroSeguroSocial, double ventasBrutas,
                                   double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPAterno, numeroSeguroSocial,
                ventasBrutas, tarifaComision);

        //checamos el salario base
        if(salarioBase<= 0.0)
            throw new IllegalArgumentException(
                    "El salario tiene que ser mayor a 0.0"
            );
        this.salarioBase = salarioBase;

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase<= 0.0)
            throw new IllegalArgumentException(
                    "El salario tiene que ser mayor a 0.0"
            );
        this.salarioBase = salarioBase;
    }

    //Calcular los ingresos
    @Override
    public double ingresos(){
        return super.getTarifaComision() * super.getVentasBrutas();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f %n %s %.2f",
                "empleado por comision", super.getPrimerNombre(), super.getApellidoPAterno(),
                "numero de Seguridad Social", super.getNumeroSeguroSocial(),
                "ventas brutas", super.getVentasBrutas(),
                "tarifa de comision", super.getTarifaComision(),
                "tarifa ", this.salarioBase);
    }
}
