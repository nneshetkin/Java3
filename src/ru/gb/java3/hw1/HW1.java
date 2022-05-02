/*      1. Написать метод, который меняет два элемента массива местами (массив может быть любого
        ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;
        3. Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
        и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
        коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
        равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
        апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
        объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку
 */

package ru.gb.java3.hw1;

public class HW1 {

    public static void main(String[] args) {
//1,2
        String[] str = {"1", "2"};
        Integer[] ing = {1, 3};
        Double[] dbl = {1.2, 3.1};
        SomeArray array = new SomeArray();
        array.changeIndex(str, 0, 1);
        array.changeIndex(ing, 0, 1);
        array.changeIndex(dbl, 0, 1);
        System.out.println(array.toArrayList(str).getClass().getName());
        //3.Boxes
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox.addInBox(new Apple());
            orangeBox.addInBox(new Orange());
        }
        // appleBox.addInBox(new Orange()); error, you can't put Orange in box with Apples
        System.out.println(appleBox.getFruits());
        System.out.println(orangeBox.getFruits());
        System.out.println("Weight of box with apples"+"="+ appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addInBox(new Apple());
        appleBox.moveAllToNextBox(appleBox2);
        System.out.println(appleBox.getFruits());
        System.out.println(appleBox2.getFruits());

    }
}
