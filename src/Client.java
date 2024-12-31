public class Client {

    public static void main(String[] args) {
        // Получаем единственный экземпляр Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }

}
