package Search;

import java.io.IOException;

/**
 * Created by Crow on 08.11.2016.
 * Считывает символы с клавиатуры, и выводить их, пока не встретится точка.Все делается в цикле do-while.
 */

public class Search {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите символы: ");

        char s, ignore;

        do  {
            s =(char) System.in.read(); //считывает при первом заходе первый символ и идет далее по коду

            System.out.println("Вы ввели символ: "+ s); // вывели первый символ
            do {
                ignore=(char) System.in.read(); // считывает все символы со второго символа пока не дойдет до
                // нашей \n, а \n у нас как вы знаете это нажатие Enter (в буфере)
            }while(ignore != '\n');  // этот код не присваивает! как думают некие личности, а ищет конец строки \n
            //после второго символа и найдя его идет далее по коду операторов, а
            //переменная ch присвоила изначально первый символ!
        }while (s != '.');
    }
}
