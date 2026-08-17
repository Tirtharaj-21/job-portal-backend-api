package com.indeed.server.Service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final InMemoryUserDetailsManager userDetailsManager;

    public UserService(PasswordEncoder passwordEncoder) {

        UserDetails recruiter = User.builder()
                .username("recruiter@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .roles("RECRUITER")
                .build();

        UserDetails jobSeeker = User.builder()
                .username("jobseeker@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .roles("JOB_SEEKER")
                .build();

        userDetailsManager = new InMemoryUserDetailsManager(recruiter, jobSeeker);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userDetailsManager.loadUserByUsername(username);
    }
}
