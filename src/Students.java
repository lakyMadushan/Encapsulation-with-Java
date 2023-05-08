public class Students {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Test{
    public static void main(String[] args) {
        Students s = new Students();
        s.setName("Lakshitha");
        System.out.println(s.getName());
    }
}
