package creational.factory_method.example3;

public class Stage {

  public static void main(String[] args) {
    FactoryPerson factoryPerson = new FactoryPerson();
    Person person = factoryPerson.getPerson(PersonType.PERSON_VILLAGE);

    System.out.println(person.getName());
  }
}
