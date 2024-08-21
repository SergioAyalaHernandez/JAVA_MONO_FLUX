import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {

        List<Integer> elementosFromMono = new ArrayList<>();
        List<Integer> elementosFromFlux = new ArrayList<>();
        //creamos un mono
        Mono<Integer> mono = Mono.just(121);

        //creamos un flux
        Flux<Integer> flux = Flux.just(12,14,9,11,12,43,12,21,22,48,74,8,1);

        //nos suscribimos al mono

        mono.subscribe(elementosFromMono::add);

        // nos suscribimos al flux
        flux.subscribe(elementosFromFlux::add);

        System.out.println(elementosFromMono);
        System.out.println(elementosFromFlux);
    }
}
