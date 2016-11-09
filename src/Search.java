package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Crow on 08.11.2016.
 */

public class Search {

    public static void main(String[] args) throws IOException {

        // Считывает символы с клавиатуры, и выводит их, пока не встретится точка.Все делается в цикле do-while.
        System.out.println("Введите символы: ");

        char s, ignore;

        do  {
            s =(char) System.in.read(); //считывает при первом заходе первый символ и идет далее по коду

            System.out.println("Вы ввели символ: " + s); // вывели первый символ
            do {
                ignore=(char) System.in.read(); // считывает все символы со второго символа пока не дойдет до
                // нашей \n, а \n у нас как вы знаете это нажатие Enter (в буфере)
            } while(ignore != '\n');  // этот код не присваивает! как думают некие личности, а ищет конец строки \n
            //после второго символа и найдя его идет далее по коду операторов, а
            //переменная ch присвоила изначально первый символ!
        }while (s != '.');
        
        
        // Напишите программу, которая считывает символы пока не встретится точка. 
        // Также предусмотрите вывод количества пробелов.
        
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку: ");

        String input = x.readLine();
        String output = input.substring(0, input.indexOf('.'));

        System.out.println( output );

        String s = " ";
        String a = output;
        int l = a.length();
        a = a.replaceAll(s, "");
        int q = (l - a.length()) / s.length();

        System.out.println("количество пробелов: " + q);
    }
}
