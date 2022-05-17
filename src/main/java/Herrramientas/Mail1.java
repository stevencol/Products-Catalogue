package Herrramientas;


import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;


public class Mail1 {

    private static final String remitente = "ratony2012";

    private static Session getSession() {
        Properties proper = new Properties();
        proper.put("mail.smtp.host", "smtp.gmail.com"); //servidor de Correo
        proper.put("mail.smtp.user", remitente); //se especifica el correo remitente
        proper.put("mail.smtp.clave", "tdptqcsaprgoubak"); //calve de app
        proper.put("mail.smtp.auth", "true"); //usar atenticacion
        proper.put("mail.smtp.starttls.enable", "true"); // conexiion de manera segura
        proper.put("mail.smtp.port", "587"); // puerto de correo
        proper.put("mail.smtp.ssl.protocols", "TLSv1.2");
        Session session = Session.getDefaultInstance(proper);

        return session;
    }

    ///texto del Correo
    private BodyPart textMail(String mensaje) throws MessagingException {

        BodyPart texto = new MimeBodyPart();
        texto.setText(mensaje);

        return texto;
    }

///Archivos Adjunto
    private BodyPart archivosAdjuntos(String ruta, String nombreA) throws MessagingException {

        BodyPart adjunto = new MimeBodyPart();

        DataSource arch = new FileDataSource(ruta);
        adjunto.setDataHandler(new DataHandler(arch));
        adjunto.setFileName(nombreA);
        return adjunto;
    }

    ///texto del Correo
    public void setCorreoAdjuntos(String destino, String asunto, String mensajeMail) {

        MimeMessage correo = new MimeMessage(getSession());

        try {

            Multipart multipart = new MimeMultipart();
            MimeBodyPart texto = new MimeBodyPart();
            texto.setContent("<h1>hola" + mensajeMail + "<h1>", "text/html");

            multipart.addBodyPart(archivosAdjuntos("c:\\halo\\Archivo.txt", "halo.text"));
//            multipart.addBodyPart(archivosAdjuntos("c:\\halo\\Archivo.txt", "tenor.gif"));
            multipart.addBodyPart(texto);

            correo.setFrom(new InternetAddress(remitente));
            correo.setText(asunto);
            correo.addRecipients(Message.RecipientType.TO, destino);
            correo.setContent(multipart);
            correo.setSubject(asunto);
            Transport transport = getSession().getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, "tdptqcsaprgoubak");
            transport.sendMessage(correo, correo.getAllRecipients());

        } catch (MessagingException e) {
            e.printStackTrace(System.out);
        }

    }
 

    public void setMail(String destino, String asunto, String mensaje) {

        try {
            MimeMessage correo = new MimeMessage(getSession());

//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(textMail(mensaje));
            correo.setFrom(new InternetAddress(remitente));
            correo.addRecipients(Message.RecipientType.TO, destino);
//            correo.setContent(multipart);
            correo.setText(mensaje, null, "html");
            correo.setSubject(asunto);
            Transport transport = getSession().getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, "tdptqcsaprgoubak");
            transport.sendMessage(correo, correo.getAllRecipients());

        } catch (MessagingException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
