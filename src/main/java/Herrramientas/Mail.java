package Herrramientas;

import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.util.Properties;

public class Mail {

    private static Session getSession() {

        Properties properties = new Properties();
        Properties proper = new Properties();
        proper.put("mail.smtp.host", "smtp.gmail.com"); //servidor de Correo
        proper.put("mail.smtp.user", "ratony2012"); //se especifica el correo remitente
        proper.put("mail.smtp.clave", "mjzawfqesjhpypwr"); //calve de app
        proper.put("mail.smtp.auth", "true"); //usar atenticacion
        proper.put("mail.smtp.starttls.enable", "true"); // conexiion de manera segura
        proper.put("mail.smtp.port", "587"); // puerto de correo
        proper.put("mail.smtp.ssl.protocols", "TLSv1.2");
        Session session = Session.getDefaultInstance(proper);

        return session;

    }

    ///Texto Del correo
    private BodyPart textMail(String mensaje) throws MessagingException {
        BodyPart conteniodoMail = new MimeBodyPart();
        conteniodoMail.setText(mensaje);
        return conteniodoMail;
    }

    ///Archivos Adjuntos
    private BodyPart archivoAdjunto(String ruta) throws MessagingException {
        BodyPart addJunto = new MimeBodyPart();

        DataSource file = new FileDataSource(ruta);

        addJunto.setDataHandler(new DataHandler(file));
        addJunto.setFileName("texto.text");
        return addJunto;

    }

    ///Correos Adjuntos
    public void setAddjuntos(String destino, String asunto, String cuerpoMail, String file) {
        MimeMessage correo = new MimeMessage(getSession());

        try {
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textMail(cuerpoMail));
            multipart.addBodyPart(archivoAdjunto(file));

            correo.setFrom(new InternetAddress("ratony2012"));
            correo.setContent(multipart);
            correo.setSubject(asunto);

            Transport transport = getSession().getTransport("smtp");
            transport.connect("smtp.gmail.com", "ratony2012", "mjzawfqesjhpypwr");
            transport.sendMessage(correo, correo.getAllRecipients());
        } catch (MessagingException e) {
            e.printStackTrace(System.out);
        }

    }

}
