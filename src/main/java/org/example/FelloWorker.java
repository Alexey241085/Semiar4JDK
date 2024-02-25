package org.example;

//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник

public class FelloWorker {

   String name;
   String personnelNumber;
   int phoneName;
   double lengthOfWork;

   public FelloWorker(String name, String personnelNumber, int phoneName, double lengthOfWork) {
      this.name = name;
      this.personnelNumber = personnelNumber;
      this.phoneName = phoneName;
      this.lengthOfWork = lengthOfWork;
   }

   public String getName() {
      return name;
   }

   public String getPersonnelNumber() {
      return personnelNumber;
   }

   public int getPhoneName() {
      return phoneName;
   }

   public double getLengthOfWork() {
      return lengthOfWork;
   }


   @Override
   public String toString() {
      return "FelloWorker{" +
              "name='" + name + '\'' +
              ", personnelNumber='" + personnelNumber + '\'' +
              ", phoneName=" + phoneName +
              ", lengthOfWork=" + lengthOfWork +
              '}';
   }
}
