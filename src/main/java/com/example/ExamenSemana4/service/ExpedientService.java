package com.example.ExamenSemana4.service;

import com.example.ExamenSemana4.repository.ExpedientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpedientService {
    @Autowired
    ExpedientRepository expedientRepository;
}
