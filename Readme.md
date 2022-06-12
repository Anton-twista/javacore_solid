# Задача Магазин
## Примеры принципов, использованных в коде:

### Magics:
Информация о продуктах вынесена в константы своих классов,
и не используются в основном коде напрямую.

### DRY:
Повторяющийся код вынесен в отдельные методы (printProducts(), basket.print()),
и вызывается по необходимости не засоряя основной код.

### SOLID:
* S - класс Basket отвечает только за добавление/удаление товаров в корзине.

* O - все товары наследуются от класса Product, который мы используем в других классах.
  Это позволяет добавлять новые товары с уникальными свойствами,
  не меняя основной класс Product и классы, которые его используют.

* L - все товары наследуются от класса Product и могут быть использованы вместо класса-родителя.

* I - Применяем разные интерфейсы вместо одного большого.

* D - разделив интерфейсы мы не зависим от их общей функциональности, 
 мы можем поменять один интерфейс на другой