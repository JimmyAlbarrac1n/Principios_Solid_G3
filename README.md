# Principios_Solid_G3

## Principio de Responsabilidad Única (SRP)

La implementación refleja una correcta aplicación del Principio de Responsabilidad Única al separar las responsabilidades que originalmente estaban concentradas en una sola clase. La clase UserManager inicialmente violaba SRP al mezclar lógica de validación, persistencia de datos y envío de correos electrónicos.

La refactorización distribuyó estas responsabilidades en clases especializadas: CommonValidations maneja las validaciones, DbContext se encarga de la persistencia, y Email gestiona el envío de mensajes. Esto genera código más mantenible, testeable y flexible, ya que cada clase tiene una única razón para cambiar. Por ejemplo, si cambian las reglas de validación, solo se modifica CommonValidations sin afectar la lógica de negocio o almacenamiento.

El UserManager ahora actúa como coordinador, delegando las tareas específicas a sus respectivos responsables, lo cual mejora la cohesión del sistema y reduce el acoplamiento entre diferentes responsabilidades funcionales.

## Principio Abierto/Cerrado (OCP)

La implementación del principio Open/Closed se logró mediante el uso de la interfaz Notification y múltiples implementaciones concretas (EmailNotification, SMSNotification, PushNotification). El sistema está abierto para extensión, permitiendo agregar nuevos tipos de notificaciones sin modificar el código existente de NotificationService.

El NotificationService trabaja con la abstracción Notification, lo que permite añadir nuevos canales de notificación simplemente creando nuevas clases que implementen la interfaz. Esto elimina la necesidad de modificar el código existente cuando se requieren nuevas funcionalidades, cumpliendo así con el principio de estar cerrado para modificación pero abierto para extensión.

## Principio de Sustitución de Liskov (LSP)

La implementación demuestra el correcto uso del Principio de Sustitución de Liskov al separar las capacidades de los animales según sus características reales. Se creó una jerarquía donde la clase base Animal define comportamientos comunes como makeSound(), mientras que la interfaz WalkingAnimal se aplica solo a los animales que pueden caminar.

Dog implementa tanto Animal como WalkingAnimal porque puede realizar ambas acciones, mientras que Fish solo extiende Animal porque no puede caminar. Esto evita el error común de forzar a todas las subclases a implementar métodos que no tienen sentido para ellas, respetando así la sustituibilidad y el comportamiento esperado de cada tipo.

## Principio de Segregación de Interfaces (ISP)

La implementación del Principio de Segregación de Interfaces se logró dividiendo una interfaz grande en interfaces más pequeñas y específicas. Se crearon dos interfaces: Device con métodos básicos (turnOn, turnOff) y ChargableDevice con el método charge().

Phone implementa ambas interfaces porque puede encenderse, apagarse y cargarse, mientras que DisposableCamera solo implementa Device porque no necesita cargarse. Esto evita forzar a las clases a implementar métodos que no utilizan, cumpliendo con el principio de que ninguna clase debe depender de métodos que no necesita.

## Principio de Inversión de Dependencias (DIP)

La implementación del Principio de Inversión de Dependencias se logró mediante el uso de la interfaz PaymentService como abstracción. PaymentProcessor depende de la abstracción PaymentService en lugar de depender de implementaciones concretas como CopaymentService o PointsService.

Esto permite que el módulo de alto nivel (PaymentProcessor) no dependa de módulos de bajo nivel (implementaciones específicas de pagos), sino que ambos dependan de la abstracción. Se pueden agregar nuevos métodos de pago implementando la interfaz PaymentService sin modificar PaymentProcessor, lo que proporciona flexibilidad y facilita las pruebas mediante inyección de dependencias.
