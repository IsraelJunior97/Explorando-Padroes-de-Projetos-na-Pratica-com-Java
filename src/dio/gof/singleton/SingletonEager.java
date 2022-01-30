package dio.gof.singleton;

/**
 * Singleton "apresado"
 *
 * @author IsraelJunir97
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
