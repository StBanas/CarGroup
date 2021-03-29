###### Zadanie 1.

Mamy metodę o nazwie grupuj. Wejściem metody jest Lista obiektów Car

**class Car {
public String brand;
public String color;
....
}**

Chcemy aby metoda grupowała listę samochodów po kolorze i zwracała Mapę której kluczami są kolory samochodów,
a wartościami listy samochodów o danym kolorze.

Mówiąc prosto chcemy mapę:

Map< Car.color, ArrayList<Car>> gropusByColor = group.stream()...

