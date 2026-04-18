package com.example.methodref.constructor;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRef {
    private String message;

    public ConstructorRef() {
    }

    public ConstructorRef(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        // Constructor reference
        Supplier<ConstructorRef> s = ConstructorRef::new;
        ConstructorRef m = s.get();
        System.out.println(m.getMessage());

        // Function with constructor reference
        Function<String, ConstructorRef> f = ConstructorRef::new;
        ConstructorRef cls = f.apply("Hi");
        System.out.println(cls.getMessage());
    }
}
