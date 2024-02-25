package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FelloWorkerRepozitory {


    public static List<FelloWorker> data = new ArrayList<>();
    private static boolean close = true;

    public static List<FelloWorker> addFrerflloW() {
        System.out.println(
                "1. Введите имя сотрудника \n" +
                        "2. Введите табельный номер сотрудника \n" +
                        "3. Введите номер телефона сотрудника\n" +
                        "4. Введите стаж сотрудника \n");
        Scanner scanner = new Scanner(System.in);
        FelloWorker woker = new FelloWorker(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
        data.add(woker);

        System.out.println("Сотрудник {" +
                "Имя = " + woker.getName() + '\'' +
                ", табельный номер ='" + woker.getPersonnelNumber() + '\'' +
                ", телефон =" + woker.getPhoneName() +
                ", стаж =" + woker.getLengthOfWork() +
                '}');
        System.out.println("Сотрудник добавлен");
        return data;
    }


    public static void addFelloW(FelloWorker felloWorker, List<FelloWorker> data) {
        data.add(felloWorker);
        System.out.println();
        System.out.println("Сотрудник добавлен");
    }

    public static List<FelloWorker> searchLengthOfWork() {
        data.sort(new ComporatorByLengthOfWork());
        for (FelloWorker felloWorker : data) {
            System.out.println("имя сотрудника " + felloWorker.getName() + " стаж " + felloWorker.getLengthOfWork());
        }
        return data;
    }

    public static List<FelloWorker> employeePhoneNumberByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника ");
        String name = scanner.nextLine();
        for (FelloWorker woker : data) {
            if (name.toLowerCase().equals(woker.getName().toLowerCase())) {
                System.out.println("имя сотрудника " + woker.getName() + " номер телефона " + woker.getPhoneName());
            }
        }
        return data;
    }

    public static List<FelloWorker> searchGetPersonnelNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите табельный номер сотрудника ");
        String personnelNumber = scanner.nextLine();
        for (FelloWorker woker : data) {
            if (personnelNumber.toLowerCase().equals(woker.getPersonnelNumber().toLowerCase())) {
                System.out.println("имя сотрудника " + woker.getName() + " табельный номер " + woker.getPersonnelNumber());
            }

        }
            return data;
    }

    public static int menu(){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1 : addFrerflloW();
            break;
            case 2 : searchLengthOfWork();
            break;
            case 3 : employeePhoneNumberByName();
            break;
            case 4 : searchGetPersonnelNumber();
            break;
            case 5 :
                close = false;
                break;
            default:
                System.out.println("введено неверное значение");
                break;

        }
        return num;
    }

    public static void start(){

        while (close){
            System.out.println("1. Добавить сотрудника");
            System.out.println("2. Найти сотрудника по стажу");
            System.out.println("3. Найти номер телефона сотрудника по имени");
            System.out.println("4. Найти сотрудника по табельному номеру");
            System.out.println("5. Выйти");

            menu();
        }
    }

}
