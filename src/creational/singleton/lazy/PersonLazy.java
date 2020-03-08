package creational.singleton.lazy;

public class PersonLazy {

  private String name;
  private String family;
  private int age;
  private static PersonLazy instance;

  private PersonLazy(){}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "PersonBillPugh{" +
      "name='" + name + '\'' +
      ", family='" + family + '\'' +
      ", age=" + age +
      '}';
  }

  public static PersonLazy getInstance(){
    if (instance == null){
      synchronized (PersonLazy.class){
        if (instance == null){
          instance = new PersonLazy();
        }
      }
    }

    return instance;
  }


}
