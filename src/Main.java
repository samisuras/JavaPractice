import java.security.SecureRandom;

public class Main {
    public static void main(String args[]){
//        SecureRandom numerosAleatorios = new SecureRandom();
//
//        for(int contador = 1; contador <= 20; contador++){
//            int cara = 1 + numerosAleatorios.nextInt(6);
//
//            System.out.printf("%d ",cara);
//
//            if(contador %5 == 0)
//                System.out.println();
//        }
        EmpleadoPorComision empleado = new EmpleadoPorComision(
                "Sam","Leos","222-22-2222",
                10000,0.6
        );

        System.out.println(
                 "Informacion del empleado obtenida por los metodos establecer:");
         System.out.printf("%n%s %s%n", "El primer nombre es",
                empleado.getPrimerNombre());
         System.out.printf("%s %s%n", "El apellido paterno es",
         empleado.getApellidoPAterno());
         System.out.printf("%s %s%n", "El numero de seguro social es",
         empleado.getNumeroSeguroSocial());
         System.out.printf("%s %.2f%n", "Las ventas brutas son",
         empleado.getVentasBrutas());
         System.out.printf("%s %.2f%n", "La tarifa de comision es",
         empleado.getTarifaComision());

         empleado.setVentasBrutas(5000);
        empleado.setTarifaComision(.5);

        System.out.printf("%n%s:%n%n%s%n",
         "Informacion actualizada del empleado, obtenida mediante toString",
        empleado);

        System.out.println("\n Empleado base mas comision");

        EmpleadoBaseMascomision emBaseComision = new EmpleadoBaseMascomision("Sam","Leos","222-22-2222",
                10000,0.6,4300);

        System.out.println("Ingresos: "+ emBaseComision.ingresos());
        System.out.println(emBaseComision.toString());
    }

}
