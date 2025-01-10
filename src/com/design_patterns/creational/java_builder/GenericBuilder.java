package com.design_patterns.creational.java_builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/*
The GenericBuilder offers flexibility and readability, allowing us to construct every object concisely while ensuring type safety.
This implies that our attributes can no longer be final as in the previous example, thus losing the immutability offered by the Builder Pattern.
*/
public class GenericBuilder<T> {
    private final Supplier<T> supplier;

    private GenericBuilder(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public static <T> GenericBuilder<T> of (Supplier<T> supplier) {
        return new GenericBuilder<>(supplier);
    }

    public <P> GenericBuilder<T> with(BiConsumer<T, P> consumer, P value) {
        return new GenericBuilder<>(() -> {
            T object = supplier.get();
            consumer.accept(object, value);
            return object;
        });
    }

    public T build() {
        return supplier.get();
    }
}
