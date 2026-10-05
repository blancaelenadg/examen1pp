//https://github.com/blancaelenadg/examen1pp.git
//BLANCA ELENA DAVILA GALVAN 3IM1
//2026670121
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
                5, 12, 8, 3, 20, 15, 7, 10, 25, 4,
                18, 6, 30, 9, 2
        );

        // Filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Multiplicar cada número por 2
        List<Integer> multiplicados = numeros.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        //Ordenar la lista de menor a mayor
        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        // Encontrar el número máximo
        Integer maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);

        // Encontrar el número mínimo
        Integer minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);

        // Contar cuántos números son mayores que 10
        long mayoresQueDiez = numeros.stream()
                .filter(n -> n > 10)
                .count();

        //Sumar todos los números
        int sumaTotal = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Obtener el promedio general
        double promedio = numeros.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        //  Eliminar duplicados
        List<Integer> unicos = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        // Impresión de resultados
        System.out.println("Pares: " + pares);
        System.out.println("Multiplicados por 2: " + multiplicados);
        System.out.println("Ordenados: " + ordenados);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Cantidad de números > 10: " + mayoresQueDiez);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);
        System.out.println("Únicos: " + unicos);
    }
}