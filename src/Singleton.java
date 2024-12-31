public class Singleton {
    // Статическая переменная для хранения единственного экземпляра
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private Singleton() {
    }

    // Метод для получения единственного экземпляра
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Пример метода
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
