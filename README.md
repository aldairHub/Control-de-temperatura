# Monitoreo en Tiempo Real con Firebase Realtime Database

Aplicación Android desarrollada en Java que permite visualizar y modificar datos de sensores en tiempo real utilizando **Firebase Realtime Database**.

## Descripción

Este proyecto demuestra la integración entre una aplicación Android y Firebase Realtime Database para monitorear variables ambientales en tiempo real.

Los datos pueden ser modificados desde la aplicación y cualquier cambio se refleja inmediatamente gracias a los listeners de Firebase.

Las variables monitoreadas son:

- Temperatura (°C)
- Humedad (%)
- Presión (hPa)
- Velocidad (km/h)

---

## Características

- Conexión a Firebase Realtime Database.
- Lectura de datos en tiempo real.
- Actualización instantánea de la interfaz.
- Modificación de valores desde la aplicación.
- Interfaz sencilla e intuitiva.
- Uso de `ValueEventListener` para sincronización automática.

---

## Tecnologías utilizadas

- Java
- Android Studio
- Firebase Realtime Database
- XML
- Gradle

---

## Estructura del proyecto

```
app/
│
├── java/
│   └── MainActivity.java
│
├── res/
│   ├── layout/
│   │   └── activity_main.xml
│   ├── drawable/
│   ├── values/
│   └── mipmap/
│
└── AndroidManifest.xml
```

---

## Estructura de Firebase

```text
sensores
│
├── temperatura
├── humedad
├── presion
└── velocidad
```

---

## Funcionamiento

1. La aplicación se conecta a Firebase.
2. Se crean referencias para cada sensor.
3. Los `ValueEventListener` escuchan cambios en la base de datos.
4. Cuando un valor cambia, la interfaz se actualiza automáticamente.
5. El usuario puede modificar cualquier valor y enviarlo nuevamente a Firebase.

---

## Capturas

Puedes agregar aquí imágenes del proyecto.

### Aplicación

```
<img width="720" height="1600" alt="image" src="https://github.com/user-attachments/assets/26c0badc-d20c-4d57-9706-596b6111a0d8" />

```

### Firebase

```
<img width="886" height="439" alt="image" src="https://github.com/user-attachments/assets/ab869525-f74e-4884-8ec2-d2f112f8443f" />

```

---

## Requisitos

- Android Studio
- JDK 17 o superior
- Cuenta de Firebase
- Dispositivo Android o emulador
- Conexión a Internet

---

## Configuración

1. Clonar el repositorio.

```bash
git clone https://github.com/usuario/repositorio.git
```

2. Abrir el proyecto en Android Studio.

3. Agregar el archivo:

```
google-services.json
```

dentro de:

```
app/
```

4. Sincronizar Gradle.

5. Ejecutar la aplicación.

---

## 👨‍💻 Autor

**Humberto Aldair Herrera Barco**

Universidad Técnica Estatal de Quevedo

---
