# README — Evaluación

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL  
> **Código:** 4134.202620 
> **Evaluación:** [PA1]  
> **Equipo:** [Delta]  

## 1. Integrantes

| Integrante | Rol | Aporte principal |
|---|---|---|
| [Jack Stefano Tello Caballero] | [Coordinador de Repositorio y Analista] | [Desarrollo de la Actividad 1 (Diferencias entre estructuras estáticas/dinámicas y justificación teórica). Creación del repositorio en GitHub y estructuración del archivo README.md.] |
| [Nombre 2] | [Desarrollador de Algoritmos (Vectores)] | [Desarrollo de la Actividad 2. Diseño de algoritmos para arreglos unidimensionales (inserción, búsqueda y ordenamiento) y justificación de la eficiencia algorítmica en el mejor y peor caso.] |
| [Johann Condor Vargas] | [Desarrollador de Algoritmos (Matrices)] | [Desarrollo de la Actividad 3. Modelado de la matriz bidimensional (4x5) y programación de los recorridos con ciclos anidados para calcular la ocupación por aulas y bloques horarios.] |
| [Carlos Josue Flores Pareja] | [Investigador y Editor Audiovisual] | [Desarrollo de la Actividad 4 (Investigación técnica sobre matrices cuadradas y matrices poco densas para la optimización de memoria). Coordinación, grabación y subida del video de exposición a YouTube.] |

## 2. Descripción y objetivo

**Problema:**  
[Una coordinación académica necesita un sistema en su primera etapa para organizar la información de los talleres estudiantiles, registrando la cantidad de alumnos inscritos y controlando la distribución de ocupación en aulas y horarios mediante estructuras de memoria estática[cite: 4].]

**Objetivo:**  
[Diseñar y sustentar una solución técnica utilizando arreglos unidimensionales (vectores) y bidimensionales (matrices)[cite: 4] para registrar, ordenar y consultar datos de forma eficiente, analizando la complejidad de las operaciones en diferentes casos[cite: 4].]

**Solución desarrollada:**  
[Se implementaron algoritmos para manipular un vector de inscritos `[28, 15, 34, 21, 19, 40, 12, 26]` (búsqueda, inserción y ordenamiento burbuja)[cite: 4, 6]. Además, se modeló una matriz de 4x5 para gestionar la ocupación de aulas por bloque horario, proponiendo el uso de "matrices poco densas" (sparse matrix)[cite: 8] para optimizar el consumo de memoria en caso de existir horarios vacíos[cite: 4].]

## 3. Cómo ejecutar o revisar

```bash
# Escribir aquí los comandos necesarios
```

**Pasos de revisión:**
# 1. Clonar el repositorio en tu computadora local
git clone [https://github.com/Yac02/Examen-PA1-Algoritmos-G4.git](https://github.com/Yac02/Examen-PA1-Algoritmos-G4.git)

# 2. Navegar a la carpeta del proyecto
cd Examen-PA1-Algoritmos-G4

## 3. Cómo ejecutar o revisar
javac Actividad2.java
java Actividad2

> No publicar contraseñas, tokens, credenciales ni datos sensibles.

## 4. Evidencias

Agregar aquí capturas, resultados, pruebas o enlaces que demuestren el funcionamiento.

- Evidencia 1 - Operaciones con Vectores (Actividad 2):
  ![Ejecución Actividad 2](./img/actividad2_consola.png)
- Evidencia 2 - Recorrido de Matrices (Actividad 3):
  ![Ejecución Actividad 3](./img/actividad3_consola.png)
- Evidencia 3 - Búsqueda en Matriz (Actividad 3):
  ![Búsqueda Matriz](./img/actividad3_busqueda.png)

## 5. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia de participación |
|---|---|---|---|---|---|
| [Jack Stefano Tello Caballero] | [Media] | [Media] | [Alta] | [Sí] | [Creación del repositorio en GitHub, commits principales, redacción de la Actividad 1 y estructuración del README.md.] |
| [Nombre 2] | [Alta] | [Alta] | [Media] | [Sí] | [Commits, avances, etc.] |
| [Johann Condor Vargas] | [Alta] | [Alta] | [Media] | [Sí] | [Commits, avances, etc.] |
| [Carlos Josue Flores Pareja] | [Media] | [Baja] | [Alta] | [Sí] | [Commits, avances, etc.] |


## 6. Video de exposición

**Video público de YouTube:** [ENLACE]

Todos los integrantes deben participar en la exposición con sus cámaras prendidas y explicar el procedimiento, la solución desarrollada y las decisiones tomadas.

## 7. Conclusiones

- Estructuras Estáticas: Se comprobó que los arreglos unidimensionales (vectores) son la estructura estática idónea para organizar datos homogéneos, garantizando un acceso rápido y directo a la memoria mediante el uso de índices fijos.
- Procesamiento Bidimensional: Las matrices amplían la capacidad de los arreglos permitiendo cruzar variables complejas en filas y columnas. Además, el análisis demostró que el uso de matrices poco densas (sparse matrix) es una decisión técnica vital para optimizar el consumo de memoria cuando existe un alto volumen de datos nulos.
- Eficiencia Algorítmica: Evaluar los algoritmos (como el ordenamiento burbuja) utilizando la notación de orden de crecimiento (Big-O) permite comprender sus límites en el mejor y peor caso. Esto asegura que el código desarrollado no solo resuelva el problema actual de la coordinación académica, sino que sea escalable frente a mayores volúmenes de datos.

---

**Última actualización:** [23/09/2026]
