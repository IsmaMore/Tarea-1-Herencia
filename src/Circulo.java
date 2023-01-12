public class Circulo {
    private final double radio;

    public Circulo(double rad){
        if (rad > 0){
            this.radio = rad;
        }else {
            this.radio = 0.0;
        }
    }

    public double getRadio() {
        return this.radio;
    }

    public double getArea() {
        return Math.pow(this.getRadio(), 2) * Math.PI;
    }

    public static class Cilindro extends Circulo{
        private final double altura;

        public Cilindro(double rad, double alt){
            super(rad);
            if (alt > 0){
                this.altura = alt;
            }else {
                this.altura = 0.0;
            }
        }

        public double getAltura(){
            return this.altura;
        }

        public double getVolume(){
            return super.getArea() * getAltura();
        }
    }

    public static void main(String[] args) {
        Circulo ob1 = new Circulo(3.2);
        Cilindro ob2 = new Cilindro(3.4, 4.3);
        System.out.println(ob1.getRadio() + " " + ob1.getArea());
        System.out.println(ob2.getRadio() + " " + ob2.getVolume());
    }
}
