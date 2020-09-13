
#  Java Inventory System
<img src="documentation/java-logo.svg" width="150" height="150"/>

---

##  Tabla de contenidos


- [Introduccíon](#Introducción)
- [About](#About )
- [Arquitectura](#Arquitectura)
- [Instalación](#instalación)
- [Características](#Características)
- [Team](#team)




---

 
## Introducción

-  🇬🇧 ENG - The main goal of this project is to work with the 
best development practices. The idea for the application is to develop
 an Inventory Sales Stores application, which will be many basic
 inventory functionalities for a clothing store. The focus will be on practices like Good coding style,
  CI (Continuous Integration) planing, and making improvements through automated testing. Technologies like JUnit, Maven, and others will be used in development. It will be great to end this project, deploying it in an EC2 AWS instance to bring its services to any client.
              
  - 🇪🇸 ESP - El objetivo principal de este proyecto es el uso de buenas prácticas de programación para el desarrollo de una aplicación usando JAVA, que servirá 
  para el inventario de una tienda  de ropa. Esta app contará con las funcionalidades básicas de un inventario para el negocio.
 Se prestará atención en las buenas prácticas para el estilo de codificación, integración continua, planing de desarrollo,
  testeo automático, etc.  El proyecto finaliza mediante el despliegue de la aplicación en un servicio cloud de AWS (EC2) 
  para hacer uso de los servicios de la aplicación mediante algún cliente y acceder a las funcionalidades de la aplicación.
 
---
 ## About

This is a JAVA project designed and developed by [Jhosef A. Cardich Palma](https://www.linkedin.com/in/jhosef-anderson-cardich-palma-74765788/). 
  
 ### Continuous integration
 - Jenkins 
 - JUnit
 - Maven
 
 ### Deployment 
 - AWS EC2 
 - Docker
 
 
 ---
## Arquitectura

La implementación general se ha seguido un patrón ***Modelo Vista Controlador (MVC)*** , para definir los componentes y sus interacciones. 
Let's take a look how this architecture looks like:

 ***Organización del proyecto***
- Se cuenta con una aplicación Java,una base de datos SQL, y algún cliente a desarrollarse. 
> Esta es una primera version de lo que podría ser 
 ![Project  Architecture](documentation/img-inventory-system.png)


## Instalación

 - El proyecto se iniciara mediante [Maven](https://maven.apache.org/) para la organización de las dependencias y JUnit para testeo.

 ### Configuración de las Dependencias

#### Configurar Maven con Intellij IDEA. 
> Instalación Maven
```
$ Maven installation ... 
 ```

- En el acrhivo 'pom.xml' agregar las siguientes configuraciones para JUnit:

#### Jenkins

```
$ brew services start jenkins // Inicia el servicio
$ brew services stop jenkins // para el servicio
$ brew services reload jenkins // Lee de nuevo la configuración y lanza el servicio

```
>  https://blog.jcyebes.com/instalacion-de-jenkins-en-mac/
 - Maven Plugin for Jenkins

---
 

## Características

La aplicación permite realizar las siguientes operaciones contra una base de datos de ejemplo: 


#### Carrito de la compra 
- Se puede diseñar alguna especie de carrito de la compra, para la sesión de un cliente en el que se puede llevar la compra actual, checkeando la disponibilidad del producto.

````
- Agregar un articulo al carrito.
- Quitar un producto de carrito.
- Terminar la sesión de compra.
````

#### Borrado, Añadir, Medias de Ventas , Listado 
- Algunas de las operaciones más basicas que se pueden encontrar en una aplicación de inventario sobre una base de datos.

> Los siguientes operaciones están disponibles:

````
- Listado de los productos disponibles de la tienda.
- Borrado de productos: Venta, no existencias.
- Media de Ventas: Numero de unidades de un producto vendido.

````

## Dependencias

Los siguientes paquetes de software son necesarios en el sistema para poder hacer funcional la aplicación:
- [Java 11](https://www.oracle.com/es/java/)
- [Maven](https://maven.apache.org/)
- [JUnit](https://junit.org/junit5/)



## Team
> Contributors/People

| <a href="https://www.linkedin.com/in/jhosef-anderson-cardich-palma-74765788/" target="_blank">**Jhosef A. Cardich Palma**</a> | 
| :---: |
|  <a href="https://www.linkedin.com/in/jhosef-anderson-cardich-palma-74765788/" target="_blank"><img src="documentation/profile_pic.png" width="200" height="230" /></a>   |
|***Full-Stack Software Developer***|
| Linkedin:   <a href="https://www.linkedin.com/in/jhosef-anderson-cardich-palma-74765788/" target="_blank">` Jhosef A. Cardich Palma`</a>| 
| Twitter: <a href="http://twitter.com/jhosefcardich" target="_blank">`@JhosefCardich`</a>| 
|Instagram: <a href="http://instagram.com/arts_hot" target="_blank">`@ARTS-HOT`</a>






---


