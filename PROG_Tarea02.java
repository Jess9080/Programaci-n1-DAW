// Ejercicio 1: Declarar e inicializar variables con distintos tipos de datos

public class PROG02_Ejerc1 {  
    public static void main(String[] args) {  
        final int VALOR_MAXIMO = 5000;  // Constante, porque es un valor no modificable  
        boolean tieneCarnet = true;    // Verdadero o falso para el carnet  
        int mesNumerico = 4;          // Número de mes  
        String mesTexto = "Abril";    // Mes como cadena  
        String nombreCompleto = "Juan Pérez";  // Nombre completo  
        char sexo = 'M';              // Carácter para el sexo V o M  
        long milisegundos = System.currentTimeMillis();  // Milisegundos desde 1970  
        double saldoCuenta = 1350.75; // Saldo bancario  
        long distanciaTierraJupiter = 588000000;  // Distancia en km  

        // Impresión en pantalla sin utilizar println  
        System.out.print("Valor máximo: " + VALOR_MAXIMO + "\n");  
        System.out.print("Tiene Carnet: " + tieneCarnet + "\n");  
        System.out.print("Mes numérico: " + mesNumerico + "\n");  
        System.out.print("Mes como texto: " + mesTexto + "\n");  
        System.out.print("Nombre completo: " + nombreCompleto + "\n");  
        System.out.print("Sexo: " + sexo + "\n");  
        System.out.print("Milisegundos desde 1970: " + milisegundos + "\n");  
        System.out.print("Saldo cuenta bancaria: " + saldoCuenta + "\n");  
        System.out.print("Distancia Tierra-Júpiter: " + distanciaTierraJupiter + "\n");  
    }  
}  

// Ejercicio 2: Identificadores válidos o inválidos 

// Double X (Es una palabra reservada en el lenguaje de java) 
// /horaactual X (no puede comenzar con un símbolo /.) 
// $hora V ( es válido ya que puede comenzar con $) 
// MiHora V ( Es válido; sigue las normas de inicio con letra mayúscula o minúscula.) 
// _hora V (Es válido; el guion bajo está permitido para iniciar un identificador.) 
// 5hora X (No puede comenzar con un número) 
// char X (Es una palabra reservada.) 

// Ejercicio 3: Evaluar expresiones booleanas

public class PROG02_Ejerc3 {  
    public static void main(String[] args) {  
        boolean var1 = true, var2 = true, var3 = false;  
        int X = 5, Y = -8, Z = 10;  

        System.out.println("var1 || var2 && var3: " + (var1 || var2 && var3)); // true  
        System.out.println("(var1 || var3) && (var2 && !var1): " + ((var1 || var3) && (var2 && !var1))); // false  
        System.out.println("(var2 || !var1 || !var3) && var1: " + ((var2 || !var1 || !var3) && var1)); // true  
        System.out.println("(X > 3 || Y > 3) && Z < -3: " + ((X > 3 || Y > 3) && Z < -3)); // false  
        System.out.println("(X + Z == 15) && (Y != 2): " + ((X + Z == 15) && (Y != 2))); // true  
    }  
}  

// Ejercicio 4: Edad mayor de edad sin usar if

public class PROG02_Ejerc4 {  
    public static void main(String[] args) {  
        int edad = 18;  // Cambia la edad según sea necesario  
        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";  
        System.out.println(resultado);  
    }  
}  

//  Ejercicio 5: Conversión de segundos a minutos, horas y días

public class PROG02_Ejerc5 {  
    public static void main(String[] args) {  
        int segundos = 90061; // Número de segundos  
        int dias = segundos / (24 * 3600);  
        segundos %= (24 * 3600);  
        int horas = segundos / 3600;  
        segundos %= 3600;  
        int minutos = segundos / 60;  
        segundos %= 60;  

        System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");  
    }  
}  

// Ejercicio 6: Enumeraciones

public class PROG02_Ejerc6 {  
    enum RazaPerro { Mastín, Terrier, Bulldog, Pekines, Caniche, Galgo }  

    public static void main(String[] args) {  
        RazaPerro var1 = RazaPerro.Terrier;  
        RazaPerro var2 = RazaPerro.Caniche;  

        System.out.println("Comparación: " + var1.compareTo(var2));  
        System.out.println("Posición de var1: " + var1.ordinal());  
        System.out.println("Cantidad de valores: " + RazaPerro.values().length);  
    }  
}  

// Ejercicio 7: Ecuación de primer grado

public class PROG02_Ejerc7 {  
    public static void main(String[] args) {  
        double C1 = 4.5, C2 = -9.0;  
        double x = -C2 / C1;  
        System.out.printf("Solución: x = %.4f%n", x);  
    }  
}  

// Ejercicio 8: Porcentaje de alumnos

public class PROG02_Ejerc8 {  
    public static void main(String[] args) {  
        int prog = 10, entornos = 15, bd = 5;  
        int total = prog + entornos + bd;  
        System.out.printf("Programación: %.1f%%%n", (double) prog / total * 100);  
        System.out.printf("Entornos: %.1f%%%n", (double) entornos / total * 80);  
        System.out.printf("Base de Datos: %.1f%%%n", (double) bd / total * 80);  
    }  
}  

// Ejercicio 9: Año bisiesto

public class PROG02_Ejerc9 {  
    public static void main(String[] args) {  
        int year = 2000;  
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);  
        System.out.println(year + " es bisiesto: " + isLeap);  
    }  
}  

// Ejercicio 10: Operaciones tipo variable

public class PROG02_Ejerc10 {  
    public static void main(String[] args) {  
        // ------- Conversiones entre enteros y coma flotante -------  
        int i = 2;  
        float x = 4.5f;  // Necesitamos agregar la 'f' para indicar un literal float  
        float y = 3.0f;  
        double dx = 2.0;  
        int j = (int) (i * x); // El resultado debe ser int, por lo tanto hacemos cast  
        double dz = dx * y;    // Multiplicación de double y float  

        System.out.println("------- Conversiones entre enteros y coma flotante -------");  
        System.out.println("Producto de int por float: j = i * x = " + j);  
        System.out.println("Producto de float por double: dz = dx * y = " + dz);  

        // ------- Operaciones con byte -------  
        byte bx = 5, by = 2;  
        byte bz = (byte) (bx - by); // Cast necesario para evitar pérdida de datos  
        System.out.println("\n------- Operaciones con byte -------");  
        System.out.println("byte: 5 - 2 = " + bz);  

        bx = -128;  
        by = 1;  

        // Operaciones con resultados fuera del rango byte  
        System.out.println("byte -128 - 1 = " + (byte) (bx - by)); // Resultado con cast a byte  
        System.out.println("(int)(-128 - 1) = " + (bx - by));      // Resultado como entero  

        // ------- Operaciones con short -------  
        short sx = 5, sy = 2;  
        short sz = (short) (sx - sy); // Cast necesario para evitar desbordamiento  
        System.out.println("\n------- Operaciones con short -------");  
        System.out.println("short: 5 - 2 = " + sz);  

        sx = 32767; // Valor máximo de short  
        sy = 1;  
        sz = (short) (sx + sy); // Desbordamiento al sumar, requiere cast  
        System.out.println("short 32767 + 1 = " + sz);  

        // ------- Operaciones con char -------  
        char cx = '\u000F'; // Carácter Unicode en hexadecimal  
        char cy = '\u0001';  
        int z;  

        System.out.println("\n------- Operaciones con char -------");  
        z = cx - cy; // Operación entre caracteres (resultado int)  
        System.out.println("char: " + cx + " - " + cy + " = " + z);  

        System.out.println("char(0x000F) - 1 = " + (cx - 1));  
        cx = '\uFFFF'; // Valor máximo de char  
        System.out.println("(int)(\uFFFF) = " + (int) cx); // Interpretación como entero  
        System.out.println("(short)(\uFFFF) = " + (short) cx); // Interpretación como short  

        sx = -32768; // Valor mínimo de short  
        cx = (char) sx; // Casting de short a char: se convierte a unsigned  
        z = cx;  
        System.out.println("-32768 short-char-int = " + z);  

        sx = -1;  
        cx = (char) sx; // Casting de short a char: -1 se convierte en 65535  
        z = cx;  
        System.out.println("-1 short-char-int = " + z);  
    }  
}  





