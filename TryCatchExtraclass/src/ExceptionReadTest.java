// Checked exception:
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class ExceptionReadTest {

    /*
    Instituto Tecnologico de Costa Rica

    Ingeniería en Computadores

    Language: Java
    Version: 15.0.2
    Author: Jose Andres Quiros Guzman.
    Version: 1.0
    Course: Algoritnmos y Estructura de Datos I
    Professor: Jose Isaac Ramirez Herrera
    Last date of modification: 24/03/2021.

    Entry: File path.
    Restrictions: --.
    Outout: First line of file or if couldn´t find the file.
    */

    public void ReadText() throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\José Andres Quirós G\\OneDrive\\Escritorio\\Semestre III\\Estructura de Datos y Algoritmos I\\Extraclases\\ExtraclassText.txt");
        FileReader filereader = new FileReader (file);
        BufferedReader bufferedreader = new BufferedReader(filereader);                 //Saves in buffer (memory space) characters that read characters, matrix or lines.
        String linea;                                                                   //File line.

        while ((linea = bufferedreader.readLine()) != null) {                           //Reads text line. 
            System.out.println(linea);                                                  //Print text file.
        }
        bufferedreader.close ();                                                        //Close the file.
    }

public void ReadTextTest () {
    try {
        ReadText();
    } catch (FileNotFoundException ex) {                                                //Write ex because it is a class, and we need an object.
        System.out.println ("Could not find the document.");                            //Show exception message.
    } catch (IOException ex) {                                                          //Write ex because it is a class, and we need an object.
        System.out.println ("An exception checked has occured.");                       //Show exception message.
    }
}

public static void main (String [] args) throws FileNotFoundException, IOException {    //Main.
    ExceptionReadTest test = new ExceptionReadTest ();                                  //Object test.
    test.ReadTextTest();                                                                //Method.
}  
}
