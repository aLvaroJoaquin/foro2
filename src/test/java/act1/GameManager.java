package act1;

//Imagina que estás desarrollando un juego y necesitas una clase GameManager que
// gestione el estado del juego. Para ello se pide implementar el patrón Singleton
// para la clase GameManager en Java.


/*public class GameManager {

    // Implementa el patrón Singleton aquí

}*/


//Pregunta: ¿Por qué sería útil utilizar el patrón Singleton en la gestión del estado de
// un juego? ¿Qué ventajas proporciona su implementación en este escenario?

//Implementa el método getInstance() en la clase GameManager para asegurar que solo
// se pueda crear una única instancia de la clase.

import java.awt.*;

public class GameManager {

    private static GameManager instance;
    public static GameManager getInstance() {
        return instance;
    }
    public void startGame(){
        if (instance == null){
            instance = new GameManager();
        }
    }

    protected GameManager(){

    }




}
//¿Cómo garantiza este enfoque que solo se cree una instancia de la clase GameManager
// cuando sea necesario en el contexto de un juego?



//Supongamos que se agrega un método adicional a la clase GameManager llamado startGame(),
// que inicie el juego y realice las configuraciones necesarias.


/*public class GameManager {

    // Resto del código de la clase


    public void startGame() {

        // Implementa el método startGame() aquí

    }

}*/

//¿Cómo utilizarías el patrón Singleton en conjunto con el método startGame() para garantizar
// que solo se pueda iniciar una instancia del juego?

// En la implementación actual, ¿es posible heredar de la clase GameManager y crear una
// instancia de la subclase? Explora esta pregunta y proporciona una explicación.

//Pregunta: ¿Qué medidas se pueden tomar para evitar la creación de instancias de
// subclases y mantener la unicidad del Singleton en el contexto del juego?
// ¿Qué implicaciones podría tener permitir la creación de subclases en el patrón Singleton?
