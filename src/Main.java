public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nombre= "Juan";
    cliente.edad = 20;
    cliente.telefono= 12345678;
    cliente.credito = 500;
    System.out.println(cliente.nombre +" / "+ cliente.edad  +" / "+cliente.telefono  +" / "+ cliente.credito);

    Trabajador trabajador = new Trabajador();
        trabajador.nombre= "Ignacio";
        trabajador.edad = 30;
        trabajador.telefono= 57896412;
        trabajador.salario= 1500;
        System.out.println(trabajador.nombre  +" / "+ trabajador.edad  +" / "+ trabajador.telefono  +" / "+ trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Cliente{
    int salario;
}