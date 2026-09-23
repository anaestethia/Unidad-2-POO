# Ejercicio 8: Estudiante

    /------------------------------------------\
    | Evaluación de calificaciones             |
    \------------------------------------------/

## Descripción

Este ejercicio modela a un estudiante con nombre y una lista de calificaciones. El programa calcula el promedio y determina si el estudiante aprobó.

## Objetivo

Practicar el uso de clases, constructores, listas y métodos en Java, además de implementar lógica de evaluación escolar.

## Como funciona

La clase `Estudiante` guarda el nombre del alumno y una lista de notas. En `Main` se crean dos estudiantes, se agregan calificaciones, se calcula el promedio y se verifica si aprueba o no.

![Captura de funcionamiento](./captura/funcionamiento.png)

## Lógica aplicada

- Declaración de una clase
- Atributos de instancia
- Constructor para inicializar la lista
- Uso de `ArrayList`
- Método para agregar notas
- Método para calcular promedio
- Método booleano `haAprobado()`

## Código principal

```java
Estudiante ana = new Estudiante("Ana");
ana.agregarNota(8.5);
ana.agregarNota(7.0);
ana.agregarNota(9.0);

System.out.println(ana.haAprobado());
```

## Ejecución

```bash
javac src/*.java
java -cp src Main
```
