# 💱 Challenge_Conversor_De_Monedas

### 🧩 Descripción
Este proyecto es parte del programa **ONE (Oracle Next Education)** de **Oracle** y **Alura Latam**.  
El desafío consiste en desarrollar un **conversor de monedas en Java** que obtiene la información en tiempo real desde la **API ExchangeRateAPI**, aplicando los principios de **programación orientada a objetos (POO)**.

---

## 📚 Tabla de Contenidos
1. [Características principales](#-características-principales)
2. [Tecnologías utilizadas](#-tecnologías-utilizadas)
3. [Instalación y ejecución](#-instalación-y-ejecución)
4. [Uso](#-uso)
5. [Estructura del repositorio](#-estructura-del-repositorio)
6. [Estado del proyecto](#-estado-del-proyecto)
7. [Capturas](#-capturas)
8. [Autor y contacto](#-autor-y-contacto)
9. [Licencia](#-licencia)

---

## ✨ Características principales
- Conversión de monedas en tiempo real.
- Integración con la **API ExchangeRateAPI**.
- Aplicación de **POO en Java**.
- Menú interactivo en consola.
- 6 tipos de cambio disponibles:             
  I. Peso Argentino (ARS) → Real Brasileño (BRL)  
  II. Real Brasileño (BRL) → Peso Argentino (ARS)  
  III. Peso Chileno (CLP) → Peso Argentino (ARS)  
  IV. Peso Argentino (ARS) → Peso Chileno (CLP)  
  V. Peso Chileno (CLP) → Real Brasileño (BRL)  
  VI. Real Brasileño (BRL) → Peso Chileno (CLP)

---

## 🛠️ Tecnologías utilizadas
- **Java** (Programación Orientada a Objetos)
- **Biblioteca HTTP de Java** (para consumo de API)
- **Gson (Google)** (para manipulación de archivos JSON)

---

## 🚀 Instalación y ejecución

### 🔧 Requisitos previos
- Tener instalado **Java JDK 17 o superior**.
- Contar con un **IDE compatible** (como IntelliJ IDEA o Eclipse).
- Conexión a Internet (para acceder a la API de tasas de cambio).

### ▶️ Pasos de ejecución
1. Clonar este repositorio:
   ```bash
   git clone https://github.com/TomasMoya/Challenge_Conversor_De_Monedas
2. Abrir el proyecto en tu IDE de preferencia.

3. Compilar los archivos .java.

4. Ejecutar el archivo Main.java.

5. Seguir las instrucciones del menú en consola para realizar las conversiones.

## 💡 Uso

Al ejecutar el programa se muestra un menú principal con las opciones de cambio disponibles.
El usuario elige una opción numérica, ingresa la cantidad que desea convertir, y el programa consulta la ExchangeRateAPI para mostrar el resultado actualizado en tiempo real.

### 📸 Ejemplo de uso:
```
¡Bienvenido/a al conversor de monedas!
=====================================
¿Qué cambio desea consultar?
[1] Peso Argentino (ARS) ==> Real Brasileño (BRL)
[2] Real Brasileño (BRL) ==> Peso Argentino (ARS)
...
Ingresa la cantidad que deseas convertir:
250000
250000.0 ARS equivalen a 919 BRL
```

### 📂 Estructura del repositorio
```
Challenge_Conversor_De_Monedas/
│
├── .idea/                        # Archivos de configuración del proyecto
├── Conversor.java/               # Carpeta con clases principales
│   ├── ConsultaAPI.java          # Clase para conectarse a la API
│   ├── Main.java                 # Punto de entrada del programa
│   ├── MenuConversor.java        # Menú de opciones y flujo de ejecución
│   └── Monedas.java              # Clases y objetos que representan las monedas
│
└── out/production/Conversor.java # Archivos compilados
```

## 🌐 Demo y capturas

### 📎 Repositorio GitHub:
```bash
  https://github.com/TomasMoya/Challenge_Conversor_De_Monedas
```
### 📸 Capturas:
<img width="512" height="408" alt="image" src="https://github.com/user-attachments/assets/2cae0d73-dcea-4807-b4a6-d385f1b1e28a" />
<img width="512" height="91" alt="image" src="https://github.com/user-attachments/assets/ceaf3bdb-c569-4724-85fd-afef8307dc03" />

## 👨‍💻 Autor y contacto

#### Autor: TomasMoya

#### 📧 Correo: tomasmoya5906@gmail.com
