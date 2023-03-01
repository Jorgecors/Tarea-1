public class Programa {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jorge Cortes", 20, 12345);
        Profesor profesor = new Profesor("Ana", 35, "Matemáticas");

        estudiante.saludar();
        profesor.saludar();
    }
}