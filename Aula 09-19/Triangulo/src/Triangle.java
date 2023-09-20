public public class Triangle {

    // atributos
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if(isTriangle(sideA, sideB, sideC) && isPositive(sideA, sideB, sideC)){
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }else{
            this.sideA = 1;
            this.sideB = 1;
            this.sideC = 1;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if(isTriangle(sideA, this.sideB, this.sideC) && isPositive(sideA)){
            this.sideA = sideA;
        }   
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if(isTriangle(this.sideA, sideB, this.sideC) && isPositive(sideB)){
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if(isTriangle(this.sideA, this.sideB, sideC) && isPositive(sideC)){
            this.sideC = sideC;
        }
    }
    
    public boolean isTriangle(int sideA, int sideB, int sideC){
        return (sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB);
        /*
         * if((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)){
         *  return true;
         * }
         * return false;
         */
    }

    public boolean isPositive(int sideA, int sideB, int sideC){
        return (sideA > 0 && sideB > 0 && sideC > 0);
    }

    public boolean isPositive(int side){
        return side > 0;
    }

    public boolean isEquals(Triangle other){
        boolean number1 = (this.sideA == other.sideA) || 
                          (this.sideA == other.sideB) ||
                          (this.sideA == other.sideC);
        boolean number2 = (this.sideB == other.sideA) ||
                          (this.sideB == other.sideB) ||
                          (this.sideB == other.sideC);
        boolean number3 = (this.sideC == other.sideA) ||
                          (this.sideC == other.sideB) ||
                          (this.sideC == other.sideC);
        return number1 || number2 || number3;
    }

    public Triangle checkPerimeter(Triangle other){
        int perimeter1 = this.sideA + this.sideB + this.sideC;
        int perimeter2 = other.sideA + other.sideB + other.sideC;
        if(perimeter1 > perimeter2){
            return this;
        }else{
            return other;
        }
    }

    @Override
    public String toString() {
        return "(" + sideA + ", " + sideB + ", " + sideC + ")";
    }
    
}