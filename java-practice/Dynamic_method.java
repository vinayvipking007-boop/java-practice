public class Dynamic_method {
    static class Parent {
        void display() { System.out.println("Parent display"); }
        void eat() { System.out.println("Parent is eating"); }
    }
    static class Child extends Parent {
        @Override void display() { System.out.println("Child display"); }
        @Override void eat() { System.out.println("Child is eating"); }
    }
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
        obj.eat();
    }
}
