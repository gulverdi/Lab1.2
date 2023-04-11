public class Shape {
    private String name;
    private int CountOfLines;
    private int value;

    public void info(){
        System.out.println("Shape"+ " " + name +" count of lines" + " "+ CountOfLines );


    }
    public Shape(){

    }
    public Shape(String name, int countOfLines, int value) {
        this.name = name;
        CountOfLines = countOfLines;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfLines() {
        return CountOfLines;
    }

    public void setCountOfLines(int countOfLines) {
        CountOfLines = countOfLines;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

