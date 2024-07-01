public class Main {
    public static void main(String[] args) {
        Class<Cliente> clienteClass = Cliente.class;

        if (clienteClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clienteClass.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Cliente.");
        }
    }
}
