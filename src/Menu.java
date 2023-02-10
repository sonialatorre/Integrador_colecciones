import java.util.Scanner;

public class Menu {
    Series series = new Series();
    String fin;
    int opcion;

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void menu() {

        do {

            System.out.println("Seleccione una opción para continuar"+"\n"+
                            "1.Añadir Libro" +"\n"+
                            "2.Mostrar lista de series ingresadas" +"\n"+
                            "3.Mostrar las series de categoría Drama" + "\n"+
                            "4.Mostrar las series de categoría Romance" + "\n"+
                            "5 Mostrar las series de Categoría Comedia" + "\n"+
                            "6 Mostrar las series que duren menos de 15 minutos" + "\n"+
                            "7 Mostrar los series que duren mas de 40 minutos" + "\n");




            opcion = input.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Añadir serie a la lista");
                    series.CrearListaSeries();

                    System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                    fin = input.next();

                    break;

                case 2:

                    System.out.println("\n" + "Lista de series ingresadas");
                    series.VerListaSeries();

                    System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                    fin = input.next();

                    break;

                case 3:
                    System.out.println("\n" + "Lista de series Drama");
                    series.Drama();
                    System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                    fin = input.next();

                    break;

                case 4:

                    System.out.println("\n" + "Lista de series Romance");
                    series.Romance();
                    System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                    fin = input.next();

                    break;

                    case 5:
                        System.out.println("\n" + "Lista de series Comedia");
                        series.Comedia();
                        System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                        fin = input.next();

                        break;

                case 6:

                    System.out.println("\n" + "Lista de series que duren menos de 15 minutos");
                    series.Serie15();
                    System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                    fin = input.next();

                    break;

                    case 7:
                        System.out.println("\n" + "Lista de series que duren mas de 40 minutos");
                        series.Serie40();
                        System.out.println("Para continuar ingrese S, si quiere terminar el programa digite cualquier letra");
                        fin = input.next();

                        break;




            }


        }while (fin.equalsIgnoreCase("S"));
    }
}


