package com.udla.futbol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/registro", "/css/**", "/js/**").permitAll() // Público
                        .anyRequest().authenticated() // Todo lo demás requiere login
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/futbolistas", true)
                        .permitAll()
                )
                .logout(logout -> logout.permitAll());

        return http.build();
    }
}