import reactor.core.publisher.Mono;

public class Ejemplo03 {
    public static void main(String[] args) {
        Mono<String> mono = Mono.fromSupplier(() ->{
            throw new RuntimeException("Excepcion ocurrida");
        });

        mono.subscribe(
                data -> System.out.println(data),
                err -> System.out.println(err),
                ()-> System.out.println("completado"));
    }
}
