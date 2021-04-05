public class VariableGlobal {
    // las variables globales no se necesitan inicializar.
        int varGlobal;
    
    public static void main(String [] args)
    {

    }

    void Mimetodo()
    {
        //accediendo desde cualquier otro metodo.
        varGlobal = 5;
        System.out.println("La variable ahora vale");
    }

}
