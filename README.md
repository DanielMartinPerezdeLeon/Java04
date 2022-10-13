# Java04

1.- Cuenta  ------------------ Hecho
    1.3.- Cuenta de Ahorro  -- Hecho
    1.4.- Cuenta Inversión  -- Hecho
    1.5.- Cuenta Corriente  -- Hecho

2.- interfaz sobre clase hijas para los cálculo con fechas. ---- Falta
    2.1.- Tener los métodos para controlar si se cumplen meses, trimestres o años. Dichos métodos no
        tendrán parámetros y compararán la fecha de apertura de la cuenta y la fecha del sistema.
    2.2.- Tendrá las constantes de la clase Calendar (DAY_OF_MONTH, MONTH y YEAR) en español.

3.- Los objetos se cargarán desde un fichero  ---- Hecho

4.- Sistema de excepciones controlar saldo NUNCA sea inferior al saldo mínimo.  -- Hecho

5.- clases Lista y Nodo  -- Hecho

6.- Implementa una aplicación gráfica con las siguientes opciones:
    6.1.- Cargar datos del fichero a lista.  -- Hecho
    
    6.2.- Guardar datos de lista al fichero.  -- Hecho
    
    6.3.- Insertar o nuevo elemento (cuenta ahorro o corriente).  -- Hecho
        
    6.4.- Visualizar en JList eĺ número, titular y saldo de todos los objetos indicando el tipo de cada uno  -- Trabajandose
        (cuenta ahorro, inversión o corriente).
        6.4.1.- Al seleccionar sobre cualquier elemento del Jlist veremos el resto de sus atributos.
        
    6.5.- Visualizar uno a uno los elementos, con la posibilidad de operar solo sobre el visualizado.  -- Hecho / Falta calcular
        6.5.1.- El botón calcular solamente estará activo sí se cumple el periodo para hacer el
        cálculo, es decir, si se cumple un mes para calcular el interés de las cuentas de ahorro y un
        trimestres para las cuentas de inversión y un semestre o un año para las cuentas corrientes.

        6.5.2.- Al pulsarlo se modificará el saldo si procede y se informará de lo ocurrido con detalle
        (incremento o decremento y cantidades).

7.- La aplicación también permitirá ordenar la lista con los siguientes pasos:  -- Arreglar
    7.1.- Primero completará la lista con 100.000 cuentas aleatorias con números mayores a 1000.
    
    7.2.- Seguidamente, implementa una collections y copiará la lista original en ella.
    
    7.3.- Finalmente ordenarán las dos estructuras de datos por el campo número, se medirá y se mostrará el tiempo empleados en ordenar cada una.
        
    7.4.- Tras ordenar se podrán hacer un listado por consola, o mejor en el Jlist.
    
8.- Estará estructura siguiendo el MVC, también los paquetes.

9.- Mejoras: Date Picker, Filechooser, refresco actualizaciones, control de errores, LookAndFeel, manejo de
fechas, etc.
