# Sistema_Cafeteria

## Descripción

Proyecto desarrollado en Java como parte de un taller práctico del Bootcamp de Desarrollo Full Stack con Java de Generation Colombia.

El proyecto contiene siete ejercicios enfocados en conceptos fundamentales de programación y un sistema de consola que simula la gestión de pedidos de una cafetería durante un turno de trabajo.

## Contenido del proyecto

### Parte 1 - Ejercicios de Java

Se desarrollan siete ejercicios para practicar los siguientes conceptos:

1. **Variables y tipos de datos:** declaración de variables y uso de diferentes tipos de datos.
2. **Operadores:** operaciones matemáticas y condiciones para aplicar descuentos.
3. **Switch:** clasificación de productos mediante categorías.
4. **While:** simulación del consumo de inventario.
5. **Do-while:** validación del monto de apertura de caja.
6. **For y arrays:** recorrido de arreglos, impresión de un menú y cálculo del precio promedio.
7. **Debugging:** identificación y corrección de errores de compilación y lógica.

### Parte 2 - Sistema de turno de cafetería

Sistema de consola que simula el procesamiento de pedidos de una cafetería. Permite consultar los productos del menú, procesar pedidos, calcular subtotales, aplicar descuentos y validar la disponibilidad del inventario.

**Funcionalidades principales:**

- **Procesamiento de pedidos:** muestra el número de pedido, producto, cantidad, categoría y subtotal.
- **Clasificación de productos:** identifica las categorías mediante una estructura `switch`.
- **Descuentos:** aplica un descuento del 10% a los pedidos cuyo subtotal supera los $12.000.
- **Validación de inventario:** controla las 10 unidades disponibles de Brownie y evita procesar pedidos que superen las existencias.
- **Apertura de caja:** simula la validación del monto inicial mediante un ciclo `do-while`.
- **Reporte de cierre:** muestra el número de pedidos procesados, el total recaudado y el pedido con mayor valor.

## Tecnologías y conceptos

**Tecnologías:**
- Java
- IntelliJ IDEA

**Conceptos de programación:**
- Variables y tipos de datos.
- Operadores aritméticos y relacionales.
- Estructuras condicionales `if-else`.
- Estructura `switch`.
- Ciclos `for`, `while` y `do-while`.
- Arrays.
- Contadores y acumuladores.
- Control de flujo con `continue`.
- Depuración de código.

## Estructura del proyecto

```text
Sistema_Cafeteria/
│
├── src/
│   ├── Ejercicio1.java
│   ├── Ejercicio2.java
│   ├── Ejercicio3.java
│   ├── Ejercicio4.java
│   ├── Ejercicio5.java
│   ├── Ejercicio6.java
│   ├── Ejercicio7.java
│   └── SistemaTurnosCafeteria.java
│
├── .gitignore
├── Sistema-cafeteria.iml
└── README.md