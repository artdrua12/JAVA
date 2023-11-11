package main.homework.controlWork1;

import java.util.List;

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
        List<String> list = WorkWichFiles.findFiles(patch);
        // Запись в файл
        WorkWichFiles.writeFile(list);

    }
}
