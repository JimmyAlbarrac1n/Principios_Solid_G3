# Principios_Solid_G3

La implementación refleja una correcta aplicación del Principio de Responsabilidad Única al separar las responsabilidades que originalmente estaban concentradas en una sola clase. La clase UserManager inicialmente violaba SRP al mezclar lógica de validación, persistencia de datos y envío de correos electrónicos.

La refactorización distribuyó estas responsabilidades en clases especializadas: CommonValidations maneja las validaciones, DbContext se encarga de la persistencia, y Email gestiona el envío de mensajes. Esto genera código más mantenible, testeable y flexible, ya que cada clase tiene una única razón para cambiar. Por ejemplo, si cambian las reglas de validación, solo se modifica CommonValidations sin afectar la lógica de negocio o almacenamiento.

El UserManager ahora actúa como coordinador, delegando las tareas específicas a sus respectivos responsables, lo cual mejora la cohesión del sistema y reduce el acoplamiento entre diferentes responsabilidades funcionales.
