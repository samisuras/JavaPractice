public class PruebaPolimorfismo {
    public static void main(String args[]){
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
                "Sue",
                "Johns",
                "222-222-56",
                10000,
                .06
        );
        EmpleadoBaseMascomision empleadoBaseMascomision = new EmpleadoBaseMascomision(
                "Bob",
                "Lewis",
                "326-65-645",
                2000,
                .04,
                300
        );

        System.out.println(
                "Llamada a toString de EmpleadoPorcomision con referencia " +
                "de super clase a un objeto de la superclase"+
                empleadoPorComision.toString()
        );

        System.out.println(
                "Llamada a toString de EmpleadoPorcomision con referencia " +
                        "de subclase clase a un objeto de la subclase"+
                        empleadoBaseMascomision.toString()
        );

        //Polimorfismo
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMascomision;

        System.out.println(
          "Llamada polimorfica\n"+
          empleadoPorComision2.toString()
        );
    }
}
