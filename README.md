# Práctica Arboles AVL

## 📌 Información General

- *Título:* Práctica Arboles Rotaciones
- *Asignatura:* Estructura de Datos
- *Carrera:* Computación
- *Estudiante:* Pedro Pesántez, Fernando Martínez
- *Fecha:* 01/07/2025
- *Profesor:* Ing. Pablo Torres

---

## 🛠 Descripción

- Se implementa una estructura de datos tipo **Árbol AVL** a través de la clase `AVLTree`, la cual permite almacenar valores enteros manteniendo el equilibrio del árbol de manera automática al insertar elementos.

- La clase incluye métodos para:
  - Insertar nodos en el árbol.
  - Calcular la altura y el factor de balance de cada nodo.
  - Detectar desequilibrios y aplicar las rotaciones necesarias:
    - Rotación simple a la derecha (LL).
    - Rotación simple a la izquierda (RR).
    - Rotación doble izquierda-derecha (LR).
    - Rotación doble derecha-izquierda (RL).

- Cada inserción incluye mensajes por consola que muestran el proceso detallado: nodo insertado, altura, balance y tipo de rotación aplicada.

- Se proporciona una clase `App` que contiene el método `main`, donde se prueba la funcionalidad insertando los valores `10`, `20` y `15`, mostrando en consola cómo el árbol se equilibra automáticamente mediante una rotación doble (LR).

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    bash
    javac App.java
    
2. Ejecuta la aplicación:
    bash
    java App
    

---

## 🧑‍💻 Ejemplo de Entrada

plaintext

Pedro Pesantez
Fernando Martinez
Node a Insertar
Nodo insertado: 10 balance al insertar = 0
Node a Insertar
Nodo insertado: 20 balance al insertar = 0
Node actual: 10
        Altura del nodo  = 2
        Balance del nodo  = -1
Node a Insertar
Nodo insertado: 15 balance al insertar = 0
Node actual: 20
        Altura del nodo  = 2
        Balance del nodo  = 1
Node actual: 10
        Altura del nodo  = 3
        Balance del nodo  = -2
Rotacion Derecha-Izquierda (RL)
AVLTree@87aac27
---
![Image](https://github.com/user-attachments/assets/a13b0651-0441-40eb-920b-edd8461d89cd)
![image](https://github.com/user-attachments/assets/f11b6e52-1470-4872-8454-624d779d8424)
