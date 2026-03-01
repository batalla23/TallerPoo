# TallerPoo

## 📝 Descripción
Aplicación de escritorio desarrollada en Java con interfaz gráfica Swing para la gestión y facturación de productos tecnológicos. El programa permite calcular descuentos, incrementos, IVA y total a pagar según el tipo de producto (Audio, Video, Línea Blanca) y la forma de pago seleccionada (Contado o Crédito).

## ✨ Características Principales
- Interfaz gráfica intuitiva desarrollada con Swing.
- Cálculos automáticos basados en reglas de negocio predefinidas.
- Validación de datos de entrada.
- Uso de componentes Swing como `JRadioButton` (agrupados con `ButtonGroup`) y `JCheckBox`.
- Programación orientada a objetos con una clase `Producto` bien encapsulada.

## 👤 Autor
**Liseth Natalia Ayala**

## 📂 Estructura del Proyecto
TallerPoo/
├── src/
│ ├── taller/poo/
│ │ ├── AppProductos.form # Diseño del formulario principal (NetBeans)
│ │ └── AppProductos.java # Lógica de la interfaz gráfica
│ │
│ └── uts/edu/java/mundo/
│ └── Producto.java # Clase del modelo con la lógica de negocio
└── README.md

text

## ⚙️ Lógica de Negocio (Clase `Producto`)
La clase `Producto` encapsula todos los cálculos.

### Para pagos de **CONTADO** (`contado = true`):
*   **Audio**: 6% de descuento.
*   **Video**: 9% de descuento.
*   **Línea Blanca**: 5% de descuento.

### Para pagos a **CRÉDITO** (`contado = false`):
*   **Audio**: 7% de incremento.
*   **Video**: 9% de incremento.
*   **Línea Blanca**: 10% de incremento.

### Cálculos Generales:
*   **IVA**: 18% sobre (`costo + incremento - descuento`).
*   **Total a Pagar**: `costo + incremento - descuento + IVA`.

## 🚀 Instalación y Ejecución

### Requisitos Previos
*   **Java Development Kit (JDK)**: Versión 8 o superior.
*   **IDE Recomendado**: NetBeans (para un manejo óptimo de los archivos `.form`).

### Pasos para Ejecutar
1.  **Clonar el repositorio**:
    ```bash
    git clone https://github.com/batalla23/TallerPoo.git
Abrir el proyecto en NetBeans:

Ve a File → Open Project.

Navega hasta la carpeta donde clonaste el repositorio y selecciona el proyecto TallerPoo.

Ejecutar la aplicación:

En el panel de "Projects", expande las carpetas Source Packages → taller.poo.

Haz clic derecho sobre el archivo AppProductos.java.

Selecciona Run File o presiona Shift + F6.

🖥️ Uso de la Aplicación
Ingresar Datos del Producto:

Escribe el Nombre del producto.

Ingresa el Costo del artefacto (debe ser un valor numérico).

Seleccionar el Tipo de Artefacto:

Elige una de las opciones: Audio, Video o Línea Blanca.

Indicar la Forma de Pago:

Selecciona el JCheckBox si el pago es de Contado.

Déjalo sin seleccionar si el pago es a Crédito.

Calcular:

Presiona el botón "Calcular". La aplicación mostrará automáticamente el descuento o incremento, el IVA y el total a pagar.

📚 Créditos
Proyecto desarrollado como parte del curso de Fundamentos de Programación Orientada a Objetos en las Unidades Tecnológicas de Santander.

Profesor: Carlos Adolfo Beltrán Castro

Autora: Liseth Natalia Ayala

📄 Licencia
Este proyecto es creado con fines educativos.
