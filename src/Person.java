public class Person {

    private int id;
    private  String name ;
    private  int age;
    private String profession;
    private int experiance;
    public  void introducing(){

        System.out.println("My name is "+ " " + name + " , "  +" I am" + " "+ age + " "+" years old and I am" + " " + profession);

    }
    public Person() {

    }

    public Person(int id, String name, int age, String profession, int experiance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.experiance = experiance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
}

