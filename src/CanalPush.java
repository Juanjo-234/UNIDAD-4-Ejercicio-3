public class CanalPush extends CanalMensajeria{
    public String enviarMensaje(String destinatario, String texto) {
        System.out.println("Conectando con el canal de servicio de notificaciones push....");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        return "";
    }
}
