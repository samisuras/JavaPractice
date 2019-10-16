public class EmpleadoPorHoras extends  EmpleadoPorComision {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoPorHoras(String primerNombre, String apellidoPAterno, String numeroSeguroSocial,
                            double ventasBrutas, double tarifaComision,
                            double horasTrabajadas,double pagoPorHora) {
        super(primerNombre, apellidoPAterno, numeroSeguroSocial, ventasBrutas, tarifaComision);

        if(horasTrabajadas <= 0.0 && pagoPorHora <= 0.0)
            throw new IllegalArgumentException(
                    "Las horas y/o pago deben ser mayor a 0"
            );

        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularPago(){
        return this.horasTrabajadas * this.pagoPorHora;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f %n %s %.2f %n %s %.2f",
                "empleado por comision", super.getPrimerNombre(), super.getApellidoPAterno(),
                "numero de Seguridad Social", super.getNumeroSeguroSocial(),
                "ventas brutas", super.getVentasBrutas(),
                "tarifa de comision", super.getTarifaComision(),
                "pago por hora: ", this.pagoPorHora,
                "Horas trabajadas: ", this.horasTrabajadas);
    }
}
