public class App {
    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle(2, 2, 3);
        Triangle t2 = new Triangle(3, 4, 5);
        System.out.println(t1);
        System.out.println(t2);
        if(t1.isEquals(t2)){
            System.out.println("Triângulos possuem pelo menos um lado em comum.");
        }else{
            System.out.println("Triângulos não possuem lados em comum.");
        }
        System.out.println("Maior perímetro: " + t1.checkPerimeter(t2) );
        t2.setSideC(7);
        System.out.println(t2);
    }
}