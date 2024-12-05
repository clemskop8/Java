import java.util.*;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private HashSet<String> categories = new HashSet<>();
    private HashMap<String, List<Task>> tasksByCategory = new HashMap<>();

    public void addTask(Task task) {
        tasks.add(task);
        categories.add(task.getCategory());

        tasksByCategory.putIfAbsent(task.getCategory(), new ArrayList<>());
        tasksByCategory.get(task.getCategory()).add(task);

        System.out.println("Задача \"" + task.getDescription() + "\" добавлена.");
    }

    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                tasksByCategory.get(task.getCategory()).remove(task);
                System.out.println("Задача \"" + task.getDescription() + "\" удалена.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }

    public void markTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsDone();
                System.out.println("Задача \"" + task.getDescription() + "\" отмечена как выполненная.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }

    public void searchTasks(String keyword) {
        System.out.println("=== Поиск задач по ключевому слову \"" + keyword + "\" ===");
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Найдена задача: " + task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Задачи с ключевым словом \"" + keyword + "\" не найдены.");
        }
    }

    public void displayAllTasks() {
        System.out.println("=== Вывод всех задач ===");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void displayCategories() {
        System.out.println("=== Вывод уникальных категорий ===");
        for (String category : categories) {
            System.out.println(category);
        }
    }

    public void displayTasksByCategory() {
        System.out.println("=== Вывод задач по категориям ===");
        for (Map.Entry<String, List<Task>> entry : tasksByCategory.entrySet()) {
            System.out.println("Категория: " + entry.getKey());
            for (Task task : entry.getValue()) {
                System.out.println("- " + task);
            }
        }
    }

    public void displayStatistics() {
        int completed = 0;
        int notCompleted = 0;

        for (Task task : tasks) {
            if (task.isDone()) {
                completed++;
            } else {
                notCompleted++;
            }
        }

        System.out.println("=== Статистика ===");
        System.out.println("Всего задач: " + tasks.size());
        System.out.println("Выполнено: " + completed);
        System.out.println("Не выполнено: " + notCompleted);
    }
}
