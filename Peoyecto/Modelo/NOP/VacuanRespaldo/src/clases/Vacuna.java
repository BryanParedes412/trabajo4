package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Vacuna implements Serializable {

    public String kit;
    public String lote;
    public String marca;
    public String efectoAdverso;
private static final Logger logger = Logger.getLogger(VacunaManager.class.getName());
    public Vacuna() {
    }

    public Vacuna(String kit, String lote) {
        this.kit = kit;
        this.lote = lote;
    }

    public Vacuna(String kit) {
        this.kit = kit;
    }

    public Vacuna(String kit, String lote, String marca, String efectoAdverso) {
        this.kit = kit;
        this.lote = lote;
        this.marca = marca;
        this.efectoAdverso = efectoAdverso;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEfectoAdverso() {
        return efectoAdverso;
    }

    public void setEfectoAdverso(String efectoAdverso) {
        this.efectoAdverso = efectoAdverso;
    }

    public void imprimir() {
        System.out.println("Kit: " + kit);
        System.out.println("Lote: " + lote);
        System.out.println("Marca: " + marca);
        System.out.println("Efecto adverso: " + efectoAdverso);
    }
    public void escribirArchivoVacuna(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int eleccion = 0;
        boolean termino = false;
        boolean fin = false;
        int registrado = 0;
        Vacuna vacuna = new Vacuna();
        System.out.println("Digite los datos de la vacuna");
        
        try {
            File archivo = new File(nombreArchivo);
            System.out.println("Kit: ");
            String kitreg = leerCadenas.nextLine();
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna lectorVacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitreg == null ? lectorVacuna.kit == null : kitreg.equals(lectorVacuna.kit)) {
                        registrado++;
                        System.out.println("Este vacuna ya esta registrada");
                        System.out.println("------------------------------------------------");
                    }
                }
                if (registrado == 0) {
                    vacuna.setKit(kitreg);
                    System.out.println("Lote: ");
                    String lotereg = leerCadenas.nextLine();
                    vacuna.setLote(lotereg);
                    System.out.println("Marca: ");
                    while (!termino) {
                        System.out.println("Marca de la vacuna: ");
                        System.out.println("1.Pfizer");
                        System.out.println("2.Moderna");
                        System.out.println("3.Sinopharm");
                        System.out.println("4.AztraZeneca");
                        System.out.println("Escoja la vacuna suministrada: ");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setMarca("Pfizer");
                                termino = true;
                                break;
                            case 2:
                                vacuna.setMarca("Moderna");
                                termino = true;
                                break;
                            case 3:
                                vacuna.setMarca("Sinopharm");
                                termino = true;
                                break;
                            case 4:
                                vacuna.setMarca("AztraZeneca");
                                termino = true;
                                break;
                            default:
                                System.out.println("Digite una de las 4 opciones (1,2,3,4)");
                        }
                    }
                    while (!fin) {
                        System.out.println("Efecto adverso: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setEfectoAdverso("si");
                                fin = true;
                                break;
                            case 2:
                                vacuna.setEfectoAdverso("no");
                                fin = true;
                                break;
                            default:
                                System.out.println("Digite una de las 2 opciones, o 1 o 2");
                        }
                    }
                    
                            
                            
                    try {
                        FileWriter escritor;
                        BufferedWriter escriba;
                        if (archivo.exists()) {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.newLine();
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        } else {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        }
                        escriba.close();
                        escritor.close();
                            
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna lectorVacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitreg == null ? lectorVacuna.kit == null : kitreg.equals(lectorVacuna.kit)) {
                        registrado++;
                        System.out.println("Este vacuna ya esta registrada");
                        System.out.println("------------------------------------------------");
                    }
                }
                if (registrado == 0) {
                    vacuna.setKit(kitreg);
                    System.out.println("Lote: ");
                    String lotereg = leerCadenas.nextLine();
                    vacuna.setLote(lotereg);
                    System.out.println("Marca: ");
                    while (!termino) {
                        System.out.println("Marca de la vacuna: ");
                        System.out.println("1.Pfizer");
                        System.out.println("2.Moderna");
                        System.out.println("3.Sinopharm");
                        System.out.println("4.AztraZeneca");
                        System.out.println("Escoja la vacuna suministrada: ");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setMarca("Pfizer");
                                termino = true;
                                break;
                            case 2:
                                vacuna.setMarca("Moderna");
                                termino = true;
                                break;
                            case 3:
                                vacuna.setMarca("Sinopharm");
                                termino = true;
                                break;
                            case 4:
                                vacuna.setMarca("AztraZeneca");
                                termino = true;
                                break;
                            default:
                                System.out.println("Digite una de las 4 opciones (1,2,3,4)");
                        }
                    }
                    while (!fin) {
                        System.out.println("Efecto adverso: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setEfectoAdverso("si");
                                fin = true;
                                break;
                            case 2:
                                vacuna.setEfectoAdverso("no");
                                fin = true;
                                break;
                            default:
                                System.out.println("Digite una de las 2 opciones, o 1 o 2");
                        }
                    }
                    
                            
                            
                    try {
                        FileWriter escritor;
                        BufferedWriter escriba;
                        if (archivo.exists()) {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.newLine();
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        } else {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        }
                        escriba.close();
                        escritor.close();
                            
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            System.out.println("------------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarVacunaEspecifica(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int cont = 0;
        try {
            File archivo = new File(nombreArchivo);
            System.out.println("Digite el kit de la vacuna a buscar: ");
            String kitBuscado = leerCadenas.nextLine();
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitBuscado == null ? vacuna.kit == null : kitBuscado.equals(vacuna.kit)) {
                        vacuna.imprimir();
                        cont++;
                    }
                }
            } else {
                System.out.println("No hay archivo para leer");
            }
            if (cont == 0) {
                System.out.println("Esta vacuna nunca fue registrada");
            }
            System.out.println("------------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerArchivoVacuna(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    vacuna.imprimir();
                    System.out.println("------------------------------------------------");
                }
            } else {
                System.out.println("No hay archivo para leer");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void informeCantidadEfectosAdversos(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int numerosSi = 0;
        int numerosNo = 0;
        try {
            File salida = new File(nombreArchivo);
            if (salida.exists()) {
                FileReader lectura = new FileReader(salida);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if ("si".equals(vacuna.efectoAdverso)) {
                        numerosSi = numerosSi + 1;
                    } else {
                        numerosNo = numerosNo + 1;
                    }
                }
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("No hay archivo para leer");
            }
            System.out.println("Cantidad de efectos adversos: " + numerosSi + " de " + (numerosSi + numerosNo));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Vacuna vacuna;
    private Scanner scanner;
    private static final Logger logger = Logger.getLogger(VacunaManager.class.getName());
    private Vacuna vacuna;
    private Scanner sn;
    public VacunaManager() {
        vacuna = new Vacuna();
        scanner = new Scanner(System.in);
        sn = new Scanner(System.in);
    }

    public void mostrarMenuVacuna() {
        escribirArchivoVacuna("archivo\\archivoVacuna.txt");
        while (true) {
            System.out.println("Registrando la vacuna");
            System.out.println("¿Desea ver la cantidad de efectos adversos?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    mostrarEfectosAdversos();
                    break;
                case 2:
                    preguntarSalir();
                    break;
                case 3:
                    return; // Salir del método
                default:
                    System.out.println("Las opciones son del 1 al 3, solo números enteros.");
            }
        }
    }

    private void mostrarEfectosAdversos() {
        vacuna.informeCantidadEfectosAdversos("archivo\\archivoVacuna.txt");
        preguntarSalir();
    }

        private void preguntarSalir() {
        while (true) {
            logger.info("¿Desea salir?");
            logger.info("1. Sí");
            logger.info("2. No");
            logger.info("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        logger.info("El usuario ha decidido salir.");
                        return; // Salir del método
                    case 2:
                        logger.info("El usuario ha decidido no salir.");
                        mostrarMenuVacuna();
                        return; // Salir del método
                    default:
                        logger.warning("Las opciones son del 1 al 2, solo números enteros.");
                }
            } catch (InputMismatchException e) {
                logger.warning("Error en la entrada: Las opciones son del 1 al 2, solo números enteros.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }

    private void escribirArchivoVacuna(String path) {
        // Implementa la lógica para escribir en el archivo
    }

    public static void main(String[] args) {
        VacunaManager manager = new VacunaManager();
        manager.mostrarMenuVacuna();
    }

    public void mostrarMenuVacunaTest() {
        boolean salir = false;
        while (!salir) {
            logger.info("Registrando la vacuna");
            logger.info("1. Registrar nueva vacuna");
            logger.info("2. Mostrar todas las vacunas registradas");
            logger.info("3. Mostrar los datos de una vacuna específica");
            logger.info("4. Mostrar cantidad de efectos adversos");
            logger.info("5. Salir");
            logger.info("Seleccione una opción: ");

            try {
                int opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        vacuna.escribirArchivoVacuna("archivo\\archivoVacuna.txt");
                        break;
                    case 2:
                        vacuna.leerArchivoVacuna("archivo\\archivoVacuna.txt");
                        break;
                    case 3:
                        vacuna.mostrarVacunaEspecifica("archivo\\archivoVacuna.txt");
                        break;
                    case 4:
                        vacuna.informeCantidadEfectosAdversos("archivo\\archivoVacuna.txt");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        logger.warning("Las opciones son del 1 al 5, solo números enteros");
                }
            } catch (InputMismatchException e) {
                logger.warning("Las opciones son del 1 al 5, solo números enteros");
                sn.next(); // Limpiar el buffer del scanner
            }
        }
    }
}
