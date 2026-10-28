Resolución del ejercicio N°3 de la unidad 4  de programación 2.

Clase Abstracta / Interfaz (CanalMensajeria):

Define el contrato universal para cualquier medio de comunicación mediante el método abstracto enviarMensaje(String destinatario, String texto). Esto garantiza que cualquier canal futuro cumpla con la misma firma de envío.

Clases Hijas (Subclases Concretas):

CanalEmail: Implementa el contrato simulando la conexión a un servidor SMTP (por ejemplo, conectando con un puerto y enviando correo electrónico).

CanalSMS: Simula la interacción con una pasarela o proveedor de telefonía móvil para la entrega de mensajes de texto cortos.

CanalPush: Simula la conexión con servicios de notificaciones móviles push (como Firebase Cloud Messaging o APNs).

Clase Coordinadora (ServicioNotificaciones):

Funciona como el despachador central del sistema. Recibe por parámetro objetos del tipo genérico CanalMensajeria, logrando un bajo acoplamiento: el servicio no necesita conocer los detalles internos de cómo opera cada canal, delegando el comportamiento gracias al polimorfismo.

Clase Principal (Main):

Se encarga de instanciar los diferentes canales (CanalEmail, CanalSMS, CanalPush), pasarlos dinámicamente al servicio de notificaciones y mostrar por consola las trazas detalladas de la comunicación.
<img width="648" height="347" alt="Captura de pantalla 2026-10-28 100830" src="https://github.com/user-attachments/assets/1d352339-d432-42af-afb2-3d94a78a0420" />
