package pbc.car;

import java.util.List;
import java.util.stream.Collectors;

public class KeyColorRepository {


    //Ustalamy klucze do mapy Map<Color, List<Car>> :
    // z listy samochodów za pomocą .stream filtrujemy te samochody, których parametry color ma wartość kolor.
    //listę kolorów ustalamy filtrując strumień listy i zapisując wszystkie wystepujące kolory do listy kolorów

    // tworzymy w pętli for:color, listaColorów grupy




    List<Car> colors = ValueCarRepository.getCarList()
            .stream()
            .filter(s ->s.get()="White" )

            .collect(Collectors.toList());
        System.out.println(colors.toString());

}
    public static String getCarBrand(brand sers) { return getCarBrand().getName(); }
}
