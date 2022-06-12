# Задача Магазин
## Примеры принципов, использованных в коде:

### Magics:
Информация о продуктах вынесена в [константы](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/product/Sausage.java) своих классов,
и не используются в основном коде напрямую. Так же используем [длину массива ассортимента](https://github.com/Anton-twista/javacore_solid/blob/bc1505122c355430b0064cfc8fcd6707532bb787/src/main/java/org/example/App.java#L97), вместо конкретного значения, т.к. его длинна может меняться.
### DRY:
Повторяющийся код вынесен в отдельные методы ([printProducts()](https://github.com/Anton-twista/javacore_solid/blob/a8262ee883cc28a624107056725f8a68716a24b8/src/main/java/org/example/App.java#L93)), [basket.print())](https://github.com/Anton-twista/javacore_solid/blob/a8262ee883cc28a624107056725f8a68716a24b8/src/main/java/org/example/basket/Basket.java#L39),
и вызывается по необходимости не засоряя основной код.

### SOLID:
* S - класс [Basket](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/basket/Basket.java) отвечает только за добавление/удаление товаров в корзине.

* O - [все товары](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/product/Water.java) наследуются от класса [Product](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/product/Product.java), который мы используем в других классах.
  Это позволяет добавлять новые товары с уникальными свойствами,
  не меняя основной класс Product и классы, которые его используют.

* L - [все товары](https://github.com/Anton-twista/javacore_solid/tree/main/src/main/java/org/example/product) наследуются от класса Product и могут быть использованы вместо класса-родителя.

* I - Применяем разные интерфейсы вместо одного большого([IStorageLife](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/product/IStorageLife.java), [ICaloric](https://github.com/Anton-twista/javacore_solid/blob/main/src/main/java/org/example/product/ICaloric.java)).

* D - разделив интерфейсы мы не зависим от их общей функциональности, 
 мы можем поменять один интерфейс на другой
