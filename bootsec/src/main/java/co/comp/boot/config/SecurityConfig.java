package co.comp.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // security filter 설정과 같음
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	http.authorizeHttpRequests((requests) -> 
	requests
	.antMatchers("/top").permitAll()
	.antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
	.anyRequest().authenticated()) // http.authorizeHttpRequests 첫 시작 괄호가 이곳에서 끝
	 .csrf().disable();
	return http.build();
	}
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
	return (web) -> web.ignoring().antMatchers("/images/**", "/js/**", "/css/**");
	}
}
