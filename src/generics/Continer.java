package generics;

public class Continer {

//public Continer(T object){
//    this.object=object;

//}

    public<T> T doItAndReturn(T object){
        System.out.println("I did something");
 return object;
    }

    public <E>E doItAndReturn2(E object2){
        System.out.println("I did something");
        return object2;
    }
}
