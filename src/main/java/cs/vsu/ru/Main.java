package cs.vsu.ru;

import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Main {



    public static void main(String[] args) throws IOException {

        List<Human> list = createListOfPeople("src/main/resources/foreign_names.csv");
        displayListOnTheScreen(list);

    }

    /**
     * Функция получающая на вход адрес файла и возвращающая
     * список всех людей из файла
     * @param Path адрес файла
     * @throws FileNotFoundException  выводит ошибку о том, что файл не найден
     * @return возвращает список людей
     */
    public static List createListOfPeople(String Path) throws IOException {
        List<Human> list= new ArrayList<Human>();

        CSVReader reader = new CSVReader(new FileReader(Path),';');
        if (reader == null) {
            throw new FileNotFoundException(Path);
        }else {
            String[] nextLine;
            nextLine=reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                Human human = new Human(nextLine[0],nextLine[1],nextLine[2], nextLine[3],nextLine[4],(nextLine[5]));
                list.add(human);
            }
        }
        return  list;
    }

    /**
     * Функция получает список людей на вход и выводит всю информацию о них на экран
     * @param list список людей
     */
    public static void displayListOnTheScreen(List<Human> list){
        for(int i =0; i< list.size();i++){
            System.out.println(list.get(i).getId()+ " "+list.get(i).getName()+" " + list.get(i).getGender()+ " "+
                    list.get(i).getBirDate()+" "+list.get(i).getDivision().getName()+" "+
                    list.get(i).getDivision().getID()+" "+list.get(i).getSalary());
        }
    }
}
