package main.homework.controlWork1;

import java.util.List;

public class AppStart {

    String patch = "";
    List<String> list;

    public void start() {
        checkPach();
        if (this.patch.equals("exit"))
            return;
        findFiles();
        writeFiles();
    }

    // получение получение пути к файлам или выход
    private void checkPach() {
        this.patch = Entrance.enter.get();
    }

    // поиск и чтение файлов c возвратом номеров счетов
    private void findFiles() {
        list = FilesUtil.findFiles(this.patch);
    }

    // Запись в файл
    private void writeFiles() {
        FilesUtil.writeFile(this.list);
    }
}
