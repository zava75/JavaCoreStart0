import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class ErrorLogger {

    public static void logError(String message, Exception exception) {
        File file = new File("errors.log");
        String logFile = file.getAbsolutePath(); // Укажите путь к файлу для логов
        try (FileWriter fileWriter = new FileWriter(logFile, true); // true для добавления в файл
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Запись сообщения об ошибке
            printWriter.println("Ошибка: " + message);
            printWriter.println("Детали:");
            exception.printStackTrace(printWriter); // Запись стека вызовов ошибки
            printWriter.println("------------------------");

            // Вывод сообщения об ошибке в консоль
            System.out.println("--------ERRORS---------");
            System.out.println("Ошибка: " + exception.toString()); // Вывод полного имени исключения и его сообщения
            for (StackTraceElement element : exception.getStackTrace()) {
                System.out.println("Детали: " + element.toString());
            }
            System.out.println("--------ERRORS---------");

        } catch (IOException e) {
            System.err.println("Не удалось записать в файл логов: " + e.getMessage());
        }
    }
}
