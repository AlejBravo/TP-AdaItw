package org.adaitw.tpfinal.controller;

import org.adaitw.tpfinal.email.Email;

public interface EmailController {
    String enviarEmail(Email correo);
}
