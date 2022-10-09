//I'D:21CE144
//Name:Param Thumar
//Create a Triplet class that encapsulates three objects of the same data type in a given instance of Triplet.



public class Triplet<T> {
    private T object1;
    private T object2;
    private T object3;

    public Triplet(T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public T getObject1() {
        return object1;
    }

    public T getObject2() {
        return object2;
    }

    public T getObject3() {
        return object3;
    }
}