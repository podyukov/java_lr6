import java.lang.annotation.*;

@Target(ElementType.METHOD) // целью может быть только метод
@Retention(RetentionPolicy.RUNTIME) // доступна во время исполнения
public @interface Invoke {
    // не имеет свойств
}
