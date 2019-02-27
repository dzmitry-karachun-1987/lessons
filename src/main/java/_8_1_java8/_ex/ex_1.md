1. Напишите функциональный интерфейс, который принимает 3 аргумента и возвращает тип `boolean`.
2. Реализуйте: 
    - Функцию сложения чисел, то есть `int addUp (Stream<Integer> numbers)`.
    - Функцию, которая получает исполнителя и возвращает список строк, 
    содержащих имена и место происхождения.
    - Функцию, которая получает альбомы и возвращает список альбомов, 
    содержащих не более трех произведений.
3. Найдите исполнителя с самым длинным именем. В решении воспользуйтесь `коллектором` 
и функцией высшего порядка `reduce`. Сравните обе реализации: какую проще писать, а какую - читать? 
   При следующих исходных данных должно быть возвращено имя "Stuart Sutcliffe":
   ```
   Stream<String> names = Stream.of("John Lennon", "Paul McCartney", 
   "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
   ```