package com.example.springboot06providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author Kahen
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《厉害了，我的国》";
    }
}
