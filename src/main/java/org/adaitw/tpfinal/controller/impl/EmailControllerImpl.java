package org.adaitw.tpfinal.controller.impl;

import org.adaitw.tpfinal.controller.EmailController;
import org.adaitw.tpfinal.email.Email;
import org.adaitw.tpfinal.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enviar")
public class EmailControllerImpl implements EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/consejo")
    public String enviarEmail(@RequestBody Email correo){
        String status = emailService.enviarEmail(correo);
        return status;
        }
    }


