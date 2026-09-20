# Ejercicio 3: Auto

## ✨ Descripción

Este ejercicio modela un auto con atributos para su marca, modelo y un estado que indica si está encendido o apagado.

## 🎯 Objetivo

Entender cómo manejar estados dentro de una clase y cómo utilizar métodos para cambiar el comportamiento del objeto.

## ⚙️ ¿Cómo funciona?

Se crea un objeto `Auto`, se muestra su estado inicial, luego se enciende, se vuelve a consultar y finalmente se apaga.

![Captura de funcionamiento](./captura/ejercicio-3.png)

## 🧠 Lógica aplicada

- Clases y objetos
- Atributos de instancia
- Constructores
- Métodos para cambiar estado
- Condición booleana

## 📌 Código principal

```java
Auto auto = new Auto("Toyota", "Corolla");
auto.encender();
auto.apagar();
```

## ▶️ Ejecución

```bash
javac src/*.java
java -cp src Main
```