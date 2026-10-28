//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ServicioNotificaciones servicio = new ServicioNotificaciones();

    CanalMensajeria canalEmail = new CanalEmail();
    CanalMensajeria canalSMS = new CanalSMS();
    CanalMensajeria canalPush = new CanalPush();

    servicio.despacharAlerta(canalEmail, "cliente@empresa.com", "Su estado de cuenta ha sido actualizado.");
    servicio.despacharAlerta(canalSMS, "+5491155443322", "Su código de acceso temporal es 4829.");
    servicio.despacharAlerta(canalPush, "device_token_abc123", "¡Tienes una nueva oferta disponible!");
}

