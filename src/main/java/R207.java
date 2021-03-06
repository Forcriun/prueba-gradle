/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import java.util.ArrayList;

class EjercicioR207
{    
    public String devolverEnOrden(ArrayList<String> palabras){
        ArrayList<String> coleccion = new ArrayList(palabras);
        String cadenaADevolver = "";

        if (coleccion.size() > 0){
            while(coleccion.size() > 0){
                String palabraMasLarga = coleccion.get(0);
                int x = 0;  // Contador del bucle
                int posicionMasLarga = 0;

                while(x < coleccion.size()){
                    if(coleccion.get(x).length() >= palabraMasLarga.length()){
                        palabraMasLarga = coleccion.get(x);
                        posicionMasLarga = x;
                    }
                    x++;
                }

                cadenaADevolver += palabraMasLarga + ",";
                coleccion.remove(posicionMasLarga);
            }
        }
        else{
            cadenaADevolver = " ";
        }

        return cadenaADevolver.substring(0,cadenaADevolver.length()-1);
    }

    // A continuación puedes escribir otros métodos si lo necesitas...
}
