package com.picpay_simplificado.services;

import com.picpay_simplificado.dtos.TransactionDTO;
import com.picpay_simplificado.repositories.TransactionRepository;
import com.picpay_simplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    public void createTransaction(TransactionDTO transaction){

    }
}
