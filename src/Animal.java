public class Animal {
    private String name;
    private int age;
    private boolean run;
    private  boolean fly;

    public void  info(){

        System.out.println(  name + " " + "has" + " "+ age+ " "+ "years");

    }
    public Animal(){

    }
    public Animal(String name, int age, boolean run, boolean fly) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.fly = fly;
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

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
