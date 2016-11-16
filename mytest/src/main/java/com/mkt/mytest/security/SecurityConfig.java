/*package com.mkt.app.config.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan(basePackages = {"com.mkt.app"})
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
    public SecurityConfig() {
        super();
        logger.info("loading SecurityConfig ................................................1");
        System.out.println("loading SecurityConfig ................................................1");
    }
    private static String REALM="MY_TEST_REALM";
    
    @Autowired
    private RestUnauthorizedEntryPoint restAuthenticationEntryPoint;

 

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("manju").password("123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("rama").password("123").roles("USER");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
     web.ignoring().antMatchers("/resources/**", "/index.html", "/login.html",
      "/partials/**", "/", "/error/**");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/finds/**").hasRole("ADMIN")
        .antMatchers("/user/**").hasRole("USER")
        .anyRequest().authenticated()
        .and().httpBasic().realmName(REALM)
        .authenticationEntryPoint(restAuthenticationEntryPoint);
    }
}
*/