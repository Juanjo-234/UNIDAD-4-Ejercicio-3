public class CanalEmail extends CanalMensajeria{

    @Override
    public String enviarMensaje(String destinatario, String texto) {
        System.out.println("Conectando con el canal de Email....");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        return "";
    }
}
