# Leaderboard System

![Licencia MIT](https://img.shields.io/badge/licencia-MIT-blue.svg)
![Estado del Proyecto](https://img.shields.io/badge/estado-finalizado-green.svg)
![Versión](https://img.shields.io/badge/versión-1.0.0-brightgreen.svg)

![Logo del Proyecto](https://user-images.githubusercontent.com/121910576/257302088-d2a9edb6-75e5-4118-aaba-6f53da7715dc.png)

Este es un proyecto en Java para gestionar una tabla de clasificación (leaderboard) de jugadores basada en sus puntajes. El sistema lee una lista de jugadores y sus puntajes, ordena a los jugadores por puntaje de manera descendente y muestra los primeros `K` jugadores en la tabla.

## 📋 Descripción

El **Leaderboard System** permite ingresar una lista de jugadores junto con sus puntajes y muestra los primeros `K` jugadores con las puntuaciones más altas. El sistema utiliza la clase `Player` para representar a cada jugador y ordena los jugadores en función de sus puntajes.

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para implementar la lógica del sistema.
- **Scanner**: Para leer la entrada del usuario.
- **Arrays**: Para manejar y ordenar la lista de jugadores.

## 🏗️ Instalación

Para ejecutar este proyecto en tu máquina local, sigue estos pasos:

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/LatinGladiador/Top-ranking.git
   ```

2. **Navega al directorio del proyecto**:
   ```bash
   cd Top-ranking
   ```

3. **Compila y ejecuta el archivo Java**:
   ```bash
   javac Main.java
   java Main
   ```

## 🖥️ Uso

1. **Inicia el programa**.
2. **Introduce el número de entradas** y el tamaño máximo de la tabla de clasificación.
3. **Ingresa los nombres y puntajes de los jugadores**.

   Ejemplo de entrada:
   ```
   5 3
   Alice 1500
   Bob 2000
   Charlie 1800
   Dave 1700
   Eve 1600
   ```

   Ejemplo de salida:
   ```
   Bob 2000
   Charlie 1800
   Dave 1700
   ```

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, sigue estos pasos:

1. **Haz un fork del repositorio**.
2. **Crea una nueva rama** para tus cambios:
   ```bash
   git checkout -b feature/nueva-caracteristica
   ```
3. **Realiza tus cambios y haz commit**:
   ```bash
   git commit -m "Añadida nueva característica"
   ```
4. **Empuja tu rama**:
   ```bash
   git push origin feature/nueva-caracteristica
   ```
5. **Abre un Pull Request** en GitHub.

## 👤 Autor

Este proyecto fue creado y es mantenido por [LatinGladiador](https://github.com/LatinGladiador).


## 📜 Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).

---

[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
