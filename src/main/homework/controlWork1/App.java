package main.homework.controlWork1;

public class App {
    public static void main(String[] args) {

        // получение номера работы
        int numWork = Entrance.enter.get();
        // проверка нужен ли выход
        if (numWork == 3)
            return;
        // получение пути к файлам
        String patch = Entrance.patch.apply(numWork);
        // поиск и чтение файлов c возвратом номеров счетов
        WorkWichFiles.findFiles(patch);

    }
}
