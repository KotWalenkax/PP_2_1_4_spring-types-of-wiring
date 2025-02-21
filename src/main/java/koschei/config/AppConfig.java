package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Needle7 getNeedle() {

        Needle7 needle7 = new Needle7();
        needle7.setDeth8(getDeath8());

        return needle7;
    }

    @Bean
    public static Deth8 getDeath8() {
        return new Deth8();
    }
}
