public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTask(new Task(1, "Купить молоко", "Покупки", false));
        todoList.addTask(new Task(2, "Позвонить маме", "Личное", false));
        todoList.addTask(new Task(3, "Подготовить отчет", "Работа", false));

        todoList.displayAllTasks();
        todoList.markTaskAsDone(1);
        todoList.searchTasks("отчет");
        todoList.displayTasksByCategory();
        todoList.displayStatistics();
        todoList.addTask(new Task(4, "Сходить в спортзал", "Здоровье", false));
        todoList.displayAllTasks();
        todoList.removeTask(2);
        todoList.displayAllTasks();
        todoList.displayStatistics();
    }
}
