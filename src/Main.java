import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
          new Cat(),
          new Giraffe(),
          new Hippopotamus(),
          new Rhinoceros(),
          new Slone()
        };
        for (Animal animal : animals){
            Class animalClass = animal.getClass();
            Annotation[] annotations = animalClass.getAnnotations();
            System.out.println(animalClass.getSimpleName());
            for(Annotation annotation: annotations){
                System.out.println("\t" +annotation.annotationType().getSimpleName());
                if (annotation instanceof Mammal){
                    System.out.println("\t\t color:" + ((Mammal) annotation).color());
                    System.out.println("\t\t sound:" + ((Mammal) annotation).sound());
                }
                else if (annotation instanceof Mammals){
                    for(Mammal mammal : ((Mammals) annotation).value()){
                        System.out.println("\t\t color:" + mammal.color());
                        System.out.println("\t\t sound:" + mammal.sound());
                    }
                }
            }
        }
    }
}