package Task2;

public interface SpecialService {
    default void specialService(Object object){
        System.out.println("I provide special service for " + object.toString());
    }
}
