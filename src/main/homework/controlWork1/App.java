package main.homework.controlWork1;

import java.util.List;

public class App {
    public static void main(String[] args) {

        // получение получение пути к файлам или выход
        String patch = Entrance.enter.get();
        // проверка нужен ли выход
        if (patch.equals("exit"))
            return;
        // поиск и чтение файлов c возвратом номеров счетов
        List<String> list = FilesUtil.findFiles(patch);
        System.out.println(list.toString());
        // Очистка таблицы в БД
        // WorkWichMySQL.clearTable();
        // // Запись в файл
        // WorkWichFiles.writeFile(list);
        // // Запись в БД
        // for (String str : list) {
        // // System.out.println(str);
        // WorkWichMySQL.addData(str);
        // }
        // // Чтение из БД
        // WorkWichMySQL.readData();
    }
}
