package creational.factory_method.example3;

public class FactoryPerson {

  public Person getPerson(PersonType type){
    switch (type) {
      case PERSON_CITY:
        return new CityPerson();
      case PERSON_VILLAGE:
        return new VillagePerson();
      default: new IllegalArgumentException("Not Found Your Request Type");
    }

    return null;
  }

}
