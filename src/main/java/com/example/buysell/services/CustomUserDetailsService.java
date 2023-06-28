package com.example.buysell.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.buysell.repositories.UserReopsitory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserReopsitory userReopsitory;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userReopsitory.findByEmail(email);
    }
}
