public class Runner {

    public static void main(String[] args) {

        try {
            // Искусственно вызываем ошибку для теста
            int result = 10 / 2;
        } catch (Exception e) {
            // Логируем ошибку
            ErrorLogger.logError("Произошла арифметическая ошибка", e);
        }
    }

}
