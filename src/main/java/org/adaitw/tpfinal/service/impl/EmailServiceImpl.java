package org.adaitw.tpfinal.service.impl;

import org.adaitw.tpfinal.email.Email;
import org.adaitw.tpfinal.model.dto.Concepto;
import org.adaitw.tpfinal.model.entity.ConceptoEntity;
import org.adaitw.tpfinal.model.repository.ConceptoRepository;
import org.adaitw.tpfinal.service.EmailService;
import org.springframework.stereotype.Service;
import java.io.File;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    ConceptoRepository conceptoRepository;


    @Value("${spring.mail.username}") private String sender;
    private ConceptoEntity concepto;

    public String enviarEmail(Email correo)
        {

            try {
                SimpleMailMessage mailMessage = new SimpleMailMessage();
                mailMessage.setFrom(sender);
                mailMessage.setTo(correo.getRecipient());
                mailMessage.setText(correo.getMsgBody(conceptoRepository.getAllByContenidoConcepto(concepto = new ConceptoEntity())));
                        mailMessage.setSubject("Tu concepto diario");

                javaMailSender.send(mailMessage);
                return "Email enviado de forma exitosa.";
            }
            catch (Exception e) {
                return "Email no enviado";
            }
        }
    }
