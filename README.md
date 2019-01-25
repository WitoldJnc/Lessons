# Lessons
# [students db](https://github.com/WitoldJnc/Lessons/tree/master/students_db/src/main)
Создать базу данных "студенты"
Реаззиловать таблицы: "Студенты, Дисциплины, Студенческие группы, Оценки, груп_дисциплины(m2m)
Реализовать generic dao, dao for each entity
Реализовать миграцию БД
#### 
* сборщик - gradle
* субд - Mysql
* миграция - flyway
* spring  

# [task1](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java):  
* [cycles](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java/cycles): "Создать массив целых чисел, заполнить его только четными числами, а затем каждый второй элемент умножить на предидущий. Использовать все варианты циклов"  
* [function](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java/functions): "Составить программу для вычисленя значения функции F(x) на отрезке[a, b] с шагом h. Результат предоставить в виде таблицы, первый столбец которой - значение аргумента, второй - соответстующие значение функции. F(x) = tg(2x)-3 "  
* [onedemensional arrays](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java/onedemensional_arrays): "Даны действительные числа "А1, А2 ... Аn" Найти MAX"  
* [multidemensional arrays](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java/multidemensional_arrays): "Получить матрицу 6х6 заполненную по двум пересекающимся диагоналями единицами(1), все остальное - нули(0) "  
* [notepade](https://github.com/WitoldJnc/Lessons/tree/master/task1/src/main/java/classes_notepade): "Спроектировать и разработать классы "Запись в блокноте" и "блокнот" (записи блокнота хранятся в массиве). Реализовать методы: "Добавить запись, Удалить запись, Редактировать запись, Посмотреть все записи"  

# [task2](https://github.com/WitoldJnc/Lessons/tree/master/task2/src):
* [oop basics](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/oop_basics): "Разработать спецификацию и создать класс Ручка(Pen). Определить в этом классе equals(), hashCode() и toString()"  
* [classes abd objects](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/classes_and_object): "Напишите приложение, позволяющиее вести учет канцелярских товаров на рабочем месте сотрудника. Определите полную стоимость канцоваров у определенного сотрудника"  
* [inheritance](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/inheritance): "Разработайте иерархию канцелярских товаров. Создайте "набор новичка", используя созданную иерархию"  
* [interfaces](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/interfaces): "Используйте "набор новичка" или другую любую коллекццию объекторв. Остортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию"    
* [generics]()https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/generics): "Разработайте приложение, позволяющие формировать группы студентов по разным дисциплинам. Состав групп может быть разным. Каждая дисциплина в отдельности определяет, целыми или вещественными будут оценки по ней. Необходимо найти группы в которые входит студент Х, и сравнить его оценки. Для организации перечня дисциплин можно использовать перечисления"
[unit tests for generic task](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/test/java/generics)  
* [inner clases](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/inner_classes): "Пазработайте класс "Атомная лодка", создайте внутренний класс - "Двигатель". Создайте объект "Атомная лодка" и ""Запустите его в плавание" "  
* [annotations](https://github.com/WitoldJnc/Lessons/tree/master/task2/src/main/java/annotations): "Разработайте для класса "Атомная лодка" аннотацию, которая могла бы обрабатываться утилитой JavaDoc. Аннотируйте Класс"  
# [task3](https://github.com/WitoldJnc/Lessons/tree/master/task3/src/main/java)
* [string classes](https://github.com/WitoldJnc/Lessons/tree/master/task3/src/main/java/string_classes): "Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель объект типа StringBuilder. Логгер должен содержать методы поиска определенной информации в таком логе [с возможностью вывода ее в поток ввода вывода].Информацию логгер хранит в форматированном виде: dd-mm-YYYY :hh-mm – message;."  
* [locale resource bundle](https://github.com/WitoldJnc/Lessons/tree/master/task3/src/main/java/locale_resource_bundle): "Разработать приложение, позволяющее по выбору пользователя использовать русский или английский язык, для отображения информации. Приложение должно представлять собой перечень вопросов под номерами (на английском или русском соответственно). Выбрав номер вопроса пользователь может узнать ответ на него."  
#[task4](https://github.com/WitoldJnc/Lessons/tree/master/task4/src/main/java)
* [byte io stream](https://github.com/WitoldJnc/Lessons/tree/master/task4/src/main/java/byte_oi_stream): "Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java это код содержит. Выведите эти слова и их количество в другой файл. Используйте только байтовые потоки ввода-вывода."  
* [symbol io stream](https://github.com/WitoldJnc/Lessons/tree/master/task4/src/main/java/symbol_io_stream): "Прочитайте файл, содержащий код на языке Java. Определите, какие ключевые слова языка Java это код содержит. Выведите эти слова и их количество в другой файл. Используйте только символьные потоки ввода-вывода."  
* [translate stream]https://github.com/WitoldJnc/Lessons/tree/master/task4/src/main/java/translate(): "Дан файл, содержащий буквы текст на кириллице. Кодировка файла utf-8. Прочитайте информацию из файла и перепишите ее в файл в кодировкой utf-16."  
* [serialization](https://github.com/WitoldJnc/Lessons/tree/master/task4/src/main/java/serialization): "Дана коллекция фильмов, содержащая информацию об актерах, снимавшихся в главных ролях (один актер мог сниматься и в нескольких фильмах). Необходимо написать приложение, позволяющее при запуске восстанавливать коллекцию фильмов, позволять ее модифицировать, а по завершении работы приложения – сохранять (в файл). Для восстановления/сохранения коллекции использовать сериализацию/десериализацию"  
# [task5](https://github.com/WitoldJnc/Lessons/tree/master/task5/src/main/java)  
* [exceptions](https://github.com/WitoldJnc/Lessons/tree/master/task5/src/main/java/exceptions): "Разработать приложение, позволяющее просматривать файлы и каталоги файловой системы, а также создавать и удалять текстовые файлы. Для работы с текстовыми файлами необходимо реализовать функциональность записи (дозаписи) в файл. Требуется определить исключения для каждого слоя приложения и корректно их обработать."  
* [properties reader](https://github.com/WitoldJnc/Lessons/tree/master/task5/src/main/java/properties_readeer): "Создать “универсальный” класс, позволяющий получить значение из любого properties-файла. Физическое чтение файла должно происходить только один раз. Обработайте следующие исключительные ситуации: нет файла *.properties, нет ключа в properties-файле."  
# [task6](https://github.com/WitoldJnc/Lessons/tree/master/task6/src/main/java)  
* [collection classes](https://github.com/WitoldJnc/Lessons/tree/master/task6/src/main/java/collections): "Изучить классы и заполнить таблицу"  
* [properties reader to map](https://github.com/WitoldJnc/Lessons/tree/master/task6/src/main/java/properties_reader_map): "Создать “универсальный” класс, позволяющий получить значение из любого properties-файла. Физическое чтение файла должно происходить только один раз. Результаты чтения хранить в коллекции типа Map"  
* [collections links](https://github.com/WitoldJnc/Lessons/tree/master/task6/src/main/java/collections_links): "Заполнить таблицу. Дать пояснения"  
* [collections functionals](https://github.com/WitoldJnc/Lessons/tree/master/task6/src/main/java/functionals): "Заполнить таблицу"  
