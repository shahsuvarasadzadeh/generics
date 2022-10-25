package generics;

public class Main {

    public static void main(String[] args) {
	// write your code here

Continer continer=new Continer();

Double u=continer.<Double>doItAndReturn(5.4);
//Double u=continer.doItAndReturn();

//doSomeThing(continer);
    }

//    public static void doSomeThing(Continer <User> continer){
//        User u= continer.doItAndReturn();
//        System.out.println("u="+u);
//    }
}
