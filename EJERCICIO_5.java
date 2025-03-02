package módulo1;


public class EJERCICIO_5 {
        public static void main(String[] args) {
        String[][] datosPersonales = {
            {"Josue Alejandro", "Sandoval", "Ingeniería Industrial", "Choloca Cortes"},
            {"Manel", "Gutiérrez", "Ingeniería en Sistemas", "Café San Pedro"},
            {"Isaac", "Morales", "Arquitectura", "Constructora Javi"},
            {"Sofía", "Pérez", "Contaduría", "Contabilidad Hernández"},
            {"Nicol", "Ramírez", "Derecho", "Bufete Legal Gómez"}
        };
        System.out.println("Datos personales de mis compañeros:");
        for (int i = 0; i < datosPersonales.length; i++) {
            System.out.println("Nombre: " + datosPersonales[i][0] + " " + datosPersonales[i][1]);
            System.out.println("Carrera: " + datosPersonales[i][2]);
            System.out.println("Lugar de trabajo: " + datosPersonales[i][3]);
            System.out.println();
        }
    }
}



