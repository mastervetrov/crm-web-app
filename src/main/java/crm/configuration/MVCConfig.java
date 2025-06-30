package crm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/crm/web-app/scripts/**")
                .addResourceLocations("classpath:/static/crm/web-app/scripts/");
        registry
                .addResourceHandler("/crm/web-app/styles/**")
                .addResourceLocations("classpath:/static/crm/web-app/styles/");
        registry
                .addResourceHandler("/crm/web-app/fonts/**")
                .addResourceLocations("classpath:/static/crm/web-app/fonts/");
        registry
                .addResourceHandler("/crm/web-app/media/**")
                .addResourceLocations("classpath:/static/crm/web-app/media/");
    }
}