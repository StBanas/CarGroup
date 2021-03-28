package pbc.car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class KeyColorRepository {

    //Ustalamy klucze do mapy Map<Color, List<Car>> :
    // z listy samochodów za pomocą .stream filtrujemy te samochody, których parametry color ma wartość kolor.
    //listę kolorów ustalamy filtrując strumień listy i zapisując wszystkie wystepujące kolory do listy kolorów-
    // należy jednokrotnie przejść po wszystkich elementach, aby
    //skatalogować wszystkie wystepujące kolory.

    // tworzymy w pętli for:color, listaColorów grupy
    public static LinkedList<> createColorList(ArrayList<CarRepository>)  {
    for( car: List<Car>){
    List<Car> colors = CarRepository.getCarList()
            .stream()
            .filter(s ->s.getColor() )

            .collect(Collectors.toList());


}

public class PrintOutColors{

//System.out.println(colors.toString());
}
