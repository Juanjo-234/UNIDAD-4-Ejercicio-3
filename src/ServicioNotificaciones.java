public class ServicioNotificaciones {
    public void despacharAlerta(CanalMensajeria canal, String destinatario, String texto){
        System.out.println("=== INICIANDO DESPACHO DE ALERTA ===");
        canal.enviarMensaje(destinatario, texto);
    }
}
