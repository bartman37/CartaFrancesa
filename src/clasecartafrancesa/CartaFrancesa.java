
package clasecartafrancesa;


class CartaFrancesa{
    
    //Creamos las diferentes Constantes que nos facilitará el uso de los palos de la braja.
    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;
    
    //Creamos dos variables privadas en las que almacenaremos el palo y el número elegido.
    private int paloElegido;
    private int numeroElegido;
    private String formato;
  
    
    //Método constructor, en el cual controlamos que el palo y número introducido estén en el rango permitido.
    public CartaFrancesa(int palo, int numero){
        if(this.paloElegido <= 4){
            this.paloElegido = palo;
        }
        if(this.numeroElegido <= 12){
            this.numeroElegido = numero;
        }
    }
    
    //Creamos método que nos da el número de palo que hemos elegido en cualquier momento.
    public int getPalo(){
        return this.paloElegido;
    }
    
    //Creamos método que nos da el número de la carta que hemos elegido en cualquier momento.
    public int getNumero(){
        return this.numeroElegido;
    }
    
    //Creamos un método para obtener un texto con cierto formato definido.
    public String toString(){
        String paloElegidoString = "";
        
        switch(this.paloElegido){
            case 0:
                paloElegidoString = "Tréboles";
                break;
            case 1:
                paloElegidoString = "Diamantes";
                break;
            case 2:
                paloElegidoString = "Corazones";
                break;
            case 3:
                paloElegidoString = "Picas";
                break;
            case 4:
                paloElegidoString = "Comodín";
        }
        switch(this.numeroElegido){
            case 0:
                if(this.paloElegido == 4){
                    return "1 de Comodín";
                }else{
                    return "AS de " + paloElegidoString;
                }
            case 1:
                return "1 de " + paloElegidoString;
            case 2:
                return "2 de " + paloElegidoString;
            case 3:
                return "3 de " + paloElegidoString;
            case 4:
                return "4 de " + paloElegidoString;
            case 5:
                return "5 de " + paloElegidoString;
            case 6:
                return "6 de " + paloElegidoString;
            case 7:
                return "7 de " + paloElegidoString;
            case 8:
                return "8 de " + paloElegidoString;
            case 9:
                return "9 de " + paloElegidoString;
            case 10:
                return "J de " + paloElegidoString;
            case 11:
                return "Q de " + paloElegidoString;
            case 12:
                return "K de " + paloElegidoString;
        }
        return null;
    }
    
    public String toCodigo(){
        String codigoPalo = "";
        
        switch(this.paloElegido){
            case 0:
                codigoPalo = "T";
                break;
            case 1:
                codigoPalo = "D";
                break;
            case 2:
                codigoPalo = "C";
                break;
            case 3:
                codigoPalo = "P";
                break;
            case 4:
                codigoPalo = "J";
        }
        switch(this.numeroElegido){
            case 0:
                return codigoPalo + "0";     
            case 1:
                return codigoPalo + "1";
            case 2:
                return codigoPalo + "2";
            case 3:
                return codigoPalo + "3";
            case 4:
                return codigoPalo + "4";
            case 5:
                return codigoPalo + "5";
            case 6:
                return codigoPalo + "6";
            case 7:
                return codigoPalo + "7";
            case 8:
                return codigoPalo + "8";
            case 9:
                return codigoPalo + "9";
            case 10:
                return codigoPalo + "10";
            case 11:
                return codigoPalo + "11";
            case 12:
                return codigoPalo + "12";
        }
        return null;
    }
}