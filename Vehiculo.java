
import java.util.ArrayList;

public class Vehiculo {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static int idActual = 1;

    private int id;
    private int modelo;
    private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo() {
        this.id = idActual++;
        Vehiculo.vehiculos.add(this);
    }

    public Vehiculo(int mo, String ma, double va) {
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        this.id = idActual++;
        Vehiculo.vehiculos.add(this);
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }

    public double getValorComecial() {
        return valorComercial;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String toString() {// opcion 2
        String cadena = "";
        for (int i = 0; i < sensores.size(); i++) {
            cadena += sensores.get(i).toString();
        }
        return "Id:" + id + "\n" + " Modelo: " + modelo + "\n" + " Marca: " + marca + "\n" + " Valor: " + valorComercial
                + "\n" + " Color: " + color + "\n" + "Informacion sensor: " + cadena;
    }

    public static String toStringVehiculos() {
        String a = "";
        for (int i = 0; i < vehiculos.size(); i++) {
            a += vehiculos.get(i).toString() + "\n";
        }
        return a;
    }

    public static String cantidadVehiculos() {// opcion 3
        return "El total de vehiculos es de: " + vehiculos.size();
    }

    public String cantidadSensores() {
        return "El total de sensores es de: " + sensores.size();
    }

    public void anadirSensor(Sensor s) {
        this.sensores.add(s);
    }

    public void crearSensor(String tipo, double valor) {
        Sensor s1 = new Sensor(tipo, valor);
        anadirSensor(s1);
    }

    public static String toStringVerdes() {// opcion 4
        String color = "";
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).color.equals("verde")) {
                color += vehiculos.get(i).toString() + "\n";
            }
        }
        return color;
    }

    public static String infoId(int idd) { // Opción 5
        String infoidd = "";
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getId() == idd) {
                infoidd = vehiculos.get(i).toString();
                break;
            }
        }
        if (infoidd == "") {
            infoidd = "Esta id no corresponde a ningun vehiculo";
        }
        return infoidd;
    }

    public static Sensor obtenerVehiculoPorld(String tipo, double valor) {// opcion 6
        Sensor s1 = new Sensor(tipo, valor);
        anadirSensor(s1);
        return s1;
    }

    public static String infoSensores(int idd) { // Opción 7
        String infoidd = "";
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getId() == idd) {
                infoidd = vehiculos.get(i).getSensores().toString();
                break;
            }
        }
        if (infoidd == "") {
            infoidd = "Esta id no corresponde a ningun sensor";
        }
        return infoidd;
    }

    public static String VerMaySensores() { // Opción 9
        int[] Numsen = new int[vehiculos.size()];
        String infoSen = "";
        int A = -1;
        int MaySen = 0;
        int pos = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            Numsen[i] = vehiculos.get(i).sensores.size();
        }
        for (int k = 0; k < Numsen[k]; k++) {
            if (Numsen[k] > A) {
                MaySen = Numsen[k];
                A = MaySen;
                pos = k;
            }
        }
        infoSen = vehiculos.get(pos).toString();

        return infoSen;
    }
}
