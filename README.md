# RetoConversionDeMoneda_esp-main

# Descripción
Conversor de monedas en Java con integración de API para obtener tasas actualizadas.

#Características 

-Conversión entre diferentes monedas (COP-Peso Colombiano, USD-Dolar Estadounidense y JPY-Yen Japones.)
-Uso de HttpRequest y HttpResponse para enviar y recibir datos.
-Transformación de datos JSON a objetos Java con Gson.
-Salida clara en consola mostrando el resultado de la conversión.

#Funcionalidades

-Se dijita un número de las opciones mostradas en nuestro conversor.
-Se agrega el valor de la cantidad a convertir
-Muestra en pantalla dos items: la primera es el valor unitario y la segunda el valor con la cantidad agregada.
-El programa sigue funcionando ciclicamente para mas converciones o pueden finalizar tecleando la opcion que aparece en pantalla.

#Tecnologias utilizadas

-Java 21+
-Gson (Google)
-[API de tasas de cambio (https://v6.exchangerate-api.com/v6/KeyUser/pair/﻿)

#Ejecucion del programa y recomendacion.

-Clona este repositorio o descarga los archivos.
-Abre el proyecto en tu IDE (Eclipse, IntelliJ, VS Code, etc.).
-Agrega la dependencia Gson para su correcto funcionamiento en pantalla como se muestra acontinuacion:

-Primero selecionamos las 4 lineas

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%201.jpg)

-Luego en file seleccionamos la opcion Project Structure...

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%202.jpg)

-Dentro seleccionamos el + y agregamos la dependencia Gson.

[](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%203.jpg)

-Vera que ya se agrego, le da aplicar y aceptar.

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%204.jpg)

-Ahora para el correcto funcionamiento del API debemos generar un key en esta pagina:

![](https://www.exchangerate-api.com/)

-Una vez quue tengas tu key remplazas el key de este codigo por el generado para su usario como se ve a continuación:

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%205.jpg)

-Ya con estas configuraciones solo queda arrancar el programa en la clase principal, al arrancar el programa mostrara lo siguiente:

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%206.jpg)

-En este ejemplo selecione la opcion 6 que es convertir de Yen japones a Pesos colombianos y agregue la cantidad ded 10 yenes que son los que se convertira dando este resultado:

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%207.jpg)

-Ya por ultimo para cerrar el ciclo y finalizar el programa, selecciono la opcion 7 y termina su ejecución.

![](https://github.com/FabioTochoy/RetoConversionDeMoneda/blob/main/imagen%208.jpg)

-Gracias a la API estos resultados siempre estaran actualizados.

#Aprendizaje

-Durante el desarrollo se aprendió a:

-Usar y entender cómo funciona una API.

-Aplicar HttpRequest para enviar solicitudes al servidor y HttpResponse para recibir los datos.

-Implementar try-catch para el manejo de errores.

-Transformar datos JSON ↔ Java con la librería Gson.

# Licencia

-Este proyecto fue creado con fines educativos como parte de la formación de ONE con Alura Latam.






