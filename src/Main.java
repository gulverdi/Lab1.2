public class Main {
    public static void main(String[] args) {

        Person p= new Person();
        p.setId(1);
        p.setName( "Orxan");
        p.setAge(28);
        p.setProfession("Doctor");
        p.setExperiance(3);
        p.introducing();


        Person p1= new Person();
        p1.setId(2);
        p1.setName( "Ayla");
        p1.setAge(24);
        p1.setProfession("Teacher");
        p1.setExperiance(1);
        p1.introducing();


        Person p2= new Person();
        p2.setId(3);
        p2.setName( "Aylin");
        p2.setAge(28);
        p2.setProfession("Doctor");
        p2.setExperiance(3);
        p2.introducing();


        Shape s= new Shape();
        s.setName("square");
        s.setCountOfLines(4);
        s.setValue(16);
        s.info();

        Shape s1= new Shape();
        s1.setName("triangle");
        s1.setCountOfLines(3);
        s1.setValue(15);
        s1.info();

        Shape s2= new Shape();
        s2.setName("octagon");
        s2.setCountOfLines(8);
        s2.setValue(32);
        s2.info();


        Animal a=new Animal();
        a.setName("cat");
        a.setAge(1);
        a.setRun(true);
        a.setRun(false);
        a.info();

        Animal a1=new Animal();
        a1.setName("butterfly");
        a1.setAge(1);
        a1.setRun(false);
        a1.setFly(true);
        a1.info();

        Animal a2=new Animal();
        a2.setName("dog");
        a2.setAge(3);
        a2.setRun(true);
        a2.setFly(false);
        a2.info();






    }

}