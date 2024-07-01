import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Definindo a anotação
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    String value();
}
