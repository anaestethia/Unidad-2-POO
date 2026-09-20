# Ejercicio 2: Mascota

    /------------------------------------------\
    | Constructor y objetos                    |
    \------------------------------------------/

## Descripción

Este ejercicio crea una clase `Mascota` con nombre, especie y edad, usando un constructor para inicializar sus valores al momento de crear cada objeto.

## Objetivo

Aprender a trabajar con constructores y a modelar objetos con información concreta y repetible.

## Como funciona

Se crean tres mascotas con distintos valores y luego se muestran en consola con un formato legible.

![Captura de funcionamiento](./captura/funcionamiento.png)

## Lógica aplicada

- Constructor de clase
- Atributos de instancia
- Creación de múltiples objetos
- Formateo de salida por consola

## Código principal

```java
Mascota mascota1 = new Mascota("Ciro", "Perro", 3);
System.out.println("Nombre: " + mascota1.nombre + ", especie: " + mascota1.especie + ", edad: " + mascota1.edad + " años.");
```

## Ejecución

```bash
javac src/*.java
java -cp src Main
```