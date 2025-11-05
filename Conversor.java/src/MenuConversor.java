public class MenuConversor {
    public void mostrarMenu(){
        System.out.println("""
                =================================================
                
                ¿Qué cambio desea consultar?
                [1] Peso Argentino (ARS) ==> Real Brasileño (BRL)
                [2] Real Brasileño (BRL) ==> Peso Argentino (ARS)
                [3] Peso Chileno (CLP) ==> Peso Argentino (ARS)
                [4] Peso Argentino (ARS) ==> Peso Chileno (CLP)
                [5] Peso Chileno (CLP) ==> Real Brasileño (BRL)
                [6] Real Brasileño (BRL) ==> Peso Chileno (CLP)
                [7] Más Opciones
                [0] Salir.
                
                =================================================
                """);

    }
    public void consultarCantidad() {
        System.out.println("Ingresa la cantidad que deseas convertir: ");
    }

    public void mostrarMenuConMasOpciones() {
        System.out.println("""
                ********************************************************
                
                Otras monedas para consultar:
                --> Dólar Estadounidense (USD)
                --> Boliviano (BOB)
                --> Real Brasileño (BRL)
                --> Peso Chileno (CLP)
                --> Yuan Chino (CNY)
                --> Peso Colombiano (COP)
                --> Libra Esterlina (GBP)
                --> Yen Japonés (JPY)
                --> Peso Mexicano (MXN)
                --> Sol Peruano (PEN)
                --> Guaraní Paraguayo (PYG)
                --> Lira Turca (TRY)
                --> Peso Uruguayo (UYU)
                --> Bolivar Venezolano (VES)
                --> EURO (EUR)
                
                ********************************************************
                ¡¡¡DEBES INGRESAR EL CÓDIGO DE LA MONEDA QUE DESEES,
                EL CÓDIGO SE ENCUENTRA ENTRE PARÉNTESIS AL LADO DE
                NOMBRE DE LA MONEDA Y SE DEBE INGRESAR EN MAYÚSCULAS!!!
                
                Ingresa la moneda base que deseas consultar: 
                """);
    }

    public void IngresarMonedaAConvertir() {
        System.out.println("Ingresa la moneda que quieres convertir a la moneda base: ");
    }
}
