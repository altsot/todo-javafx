## English
Simple text editor written in Java with JavaFX.

### Features
- Create, save, and open `.txt` files
- Minimalist interface

### To compile and run, change /path/to/javafx/lib to the path to your lib folder.

## Compilation
```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -d bin src/com/notebook/*.java 
```
## Run

```bash
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -cp bin com.notebook.Main
```

## Russian
Простой текстовый редактор, написанный на Java с использованием JavaFX.

### Возможности
- Создание, сохранение и открытие файлов `.txt`
- Минималистичный интерфейс

### Для компиляции и запуска измените /path/to/javafx/lib на путь к вашей папке lib.

## Компиляция
```bash
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -d bin src/com/notebook/*.java
```
## Запуск
```bash
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -cp bin com.notebook.Main
```
