import reactor.core.publisher.Mono;

public class Ejemplo02 {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("hola");

        mono.subscribe(
                data -> System.out.println(data),
                err -> System.out.println(err),
                ()-> System.out.println("completado"));


    }
}
