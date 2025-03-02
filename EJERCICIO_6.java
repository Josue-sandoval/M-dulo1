package módulo1;


public class EJERCICIO_6 {
    public static void main(String[] args) {
        // Datos de los estudiantes
        String[] estudiantes = {"Josue", "Alejandro"};
        int[] notas = {65, 89};
        for (int i = 0; i < estudiantes.length; i++) {
            // Imprimir el nombre y la nota
            System.out.println(estudiantes[i]);
            System.out.println(notas[i]);
            if (notas[i] >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
            System.out.println();
        }
    }
}




