/*
*(#) SercutiryConfig.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.example.OnThiCK_V1.configurations;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  public InMemoryUserDetailsManager userDetailsManager() {
      UserDetails user = User.builder()
              .username("user")
              .password("{noop}123")
              .roles("USER")
              .build();

      UserDetails admin = User.builder()
              .username("admin")
              .password("{noop}123")
              .roles("ADMIN")
              .build();
      return new InMemoryUserDetailsManager(user, admin);
  }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http.csrf().disable()
      	.authorizeHttpRequests(configurer ->
                      configurer
                              .requestMatchers("/").permitAll()
                              .requestMatchers("/list-student", "/customer-detail/**", "/report1").hasRole("USER")
                              .requestMatchers("/list-student-year").hasRole("ADMIN")
                              .anyRequest().authenticated()
              )
              .formLogin()
              .permitAll()
              .and()
              .logout()
              .permitAll();
      return http.build();
  }
}

