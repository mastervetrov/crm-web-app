package crm.configuration;//package like_shop.frontend.configuration;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity //активация базовой веб-безопасности, для запросов включается правила безопасности
//@EnableMethodSecurity //активиурет поддержку аннотаций для определения правил безопасности непосредественно в коде
//@RequiredArgsConstructor
//public class SecurityConfiguration {
//    @Bean
//    @ConditionalOnProperty(prefix = "app.security", name = "type", havingValue = "inMemory")
//    public PasswordEncoder inMemoryPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Bean
//    @ConditionalOnProperty(prefix = "app.security", name = "type", havingValue = "inMemory")
//    public UserDetailsService inMemoryUserDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("user")
//                .password("user")
//                .roles("USER")
//                .build());
//        manager.createUser(User.withUsername("admin")
//                .password("admin")
//                .roles("USER", "ADMIN")
//                .build());
//        return manager;
//    }
//
//    @Bean
//    @ConditionalOnProperty(prefix = "app.security", name = "type", havingValue = "inMemory")
//    public AuthenticationManager inMemoryAuthenticationManager(HttpSecurity http, UserDetailsService inMemoryUserDetailService) throws Exception {
//        var authManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
//
//        authManagerBuilder.userDetailsService(inMemoryUserDetailService);
//
//        return authManagerBuilder.build();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authenticationManager) throws Exception{
//        http.authorizeHttpRequests((auth) -> auth.requestMatchers("api/v1/user/**").hasAnyRole("USER", "ADMIN")
//                .requestMatchers("api/v1/admin/**").hasRole("ADMIN")
//                .requestMatchers("api/v1/public/**").permitAll()
//                .anyRequest().authenticated())
//                .csrf(AbstractHttpConfigurer::disable)
//                .httpBasic(Customizer.withDefaults())
//                .sessionManagement(httpSecuritySessionManagementConfigurer -> httpSecuritySessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authenticationManager(authenticationManager);
//        return http.build();
//    }
//}
