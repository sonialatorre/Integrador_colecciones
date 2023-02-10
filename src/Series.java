import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    private String categoria;
    private Integer duracion;

    private String Nombre;

    private ArrayList<Series> ListaSeries;

    public Series() {
        this.ListaSeries = new ArrayList<Series>();
    }

    public Series(String categoria, Integer duracion, String nombre, ArrayList<Series> listaSeries) {
        this.categoria = categoria;
        this.duracion = duracion;
        Nombre = nombre;
        ListaSeries = listaSeries;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Series> getListaSeries() {
        return ListaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        ListaSeries = listaSeries;
    }

    public void CrearListaSeries() {

            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            Series series = new Series();
            System.out.println("Ingrese el nombre de la serie: ");
            Nombre = sc.next();
            series.setNombre(Nombre);

            System.out.println("Ingrese la categoría a la que pertenece ésta serie: Según sea Romance, comedia o drama ");
            categoria = sc.next();
            series.setCategoria(categoria);

            System.out.println("Ingrese la duración de la serie en minutos: ");
            duracion = sc.nextInt();
            series.setDuracion(duracion);

            añadirSerie(series);

    }

    public void añadirSerie(Series series) {
        this.ListaSeries.add(series);

    }

    public void VerListaSeries() {
        for (Series i : ListaSeries) {
            System.out.println(i);
        }
    }

    public void Serie15() {
        for (Series i : ListaSeries) {
            if (i.getDuracion() < 15) {
                System.out.println(i);
            }
        }
    }

    public void Serie40() {
        for (Series i : ListaSeries) {
            if (i.getDuracion() > 40) {
                System.out.println(i);
            }
        }
    }

    public void Romance() {
        for (Series i : ListaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Romance")) {
                System.out.println(i);
            }
        }
    }

    public void Comedia() {
        for (Series i : ListaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Comedia")) {
                System.out.println(i);

            }
        }
    }

    public void Drama() {
        for (Series i : ListaSeries) {
            if (i.getCategoria().equalsIgnoreCase("Drama")) {
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return
                "La Categoria es = " + categoria  +
                        "\n" + "La duracion de la serie en minutos es = " + duracion +
                        "\n"+  " EL nombre de la serie es= " + Nombre + "\n"
                        + ListaSeries;
    }
}





