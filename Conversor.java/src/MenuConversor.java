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
                [0] Salir.
                
                =================================================
                """);

    }
    public void consultarCantidad() {
        System.out.println("Ingresa la cantidad que deseas convertir: ");
    }
}
