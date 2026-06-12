import java.sql.DriverManager;
import java.util.ArrayList;

public class jdk {

  public static class PrintClassLoader {
    public void printClassLoaders() throws ClassNotFoundException {

    System.out.println("Platform Classloader:"
        + ClassLoader.getPlatformClassLoader());

    System.out.println("System Classloader:"
        + ClassLoader.getSystemClassLoader());

    System.out.println("Classloader of this class:"
        + PrintClassLoader.class.getClassLoader());

    System.out.println("Classloader of DriverManager:"
        + DriverManager.class.getClassLoader());

    System.out.println("Classloader of ArrayList:"
        + ArrayList.class.getClassLoader());
    }
  }
  

  public static void main(String[] args) throws ClassNotFoundException {

    String[] array = new String[5];
    ClassLoader loader = array.getClass().getClassLoader();

    System.out.println("Class Loader: " + loader); // Will return null cause class loaders don’t create objects for array classes. 
                                                   // Instead,  the Java runtime creates them automatically as required. Therefore,
                                                   //  when we use Class#getClassLoader() to find the class loader for an array class, 
                                                   // it returns the class loader for its element type. Accordingly, 
                                                   // an array class has no class loader if the element type is a primitive data type.

    
    

    new PrintClassLoader().printClassLoaders();
  }

}