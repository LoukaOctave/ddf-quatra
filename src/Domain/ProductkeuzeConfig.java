package Domain;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class ProductkeuzeConfig {

    @Bean
    public String leveringKeuze() {
        return "levering";
    }

    @Bean
    public String ophalingKeuze() {
        return "ophaling";
    }

}
