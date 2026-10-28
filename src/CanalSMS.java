public class CanalSMS extends CanalMensajeria{
    public String enviarMensaje(String destinatario, String texto) {
        System.out.println("Conectando con el canal de SMS....");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);
        return "";
    }
}
