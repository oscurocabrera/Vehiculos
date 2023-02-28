import java.util.Scanner;

public class Vehiculos {
   
    private String placa, marca, modelo;
    private int kilometraje;

    Vehiculos( String placa, String marca, String modelo, int kilometraje){
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setKilometraje(kilometraje);
    
    }
    /*Metodos Modificadores */
    public void setPlaca(String n){ placa = n; }
    public void setMarca(String a){ marca = a; }
    public void setModelo(String c){ modelo = c; }
    public void setKilometraje(int e) {kilometraje = e; }
    /*Metodos Accesores*/
    public String getplaca(){return placa;}
    public String getmarca(){return marca;}
    public String getmodelo(){return modelo;}
    public int getkilometraje(){return kilometraje;}

    public void mostrarvehiculos(){
             System.out.print("\nplaca: " +getplaca()+"\nmarca: "+getmarca()+"\nModelo: "+getmodelo()+
                        "\nKilometraje: "+getkilometraje() );

    }

    public class TestVehiculos {

        public static void main (String [ ] args) {
    
     
    

     try (Scanner entrada = new Scanner (System.in)) {
        String placa, marca, modelo;
        int kilometraje;
        System.out.println("Favor ingresar placa: ");

        placa = entrada.nextLine();
        System.out.println("Favor ingresar marca: ");
        marca = entrada.nextLine();
        System.out.println("Favor ingresar modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Favor ingresar kilometraje: ");
        kilometraje = entrada.nextInt();
        Vehiculos e;
        e = new Vehiculos (placa,marca,modelo,kilometraje);
        e.mostrarvehiculos();
    }
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getKilometraje() {
        return kilometraje;
    }
}
    }