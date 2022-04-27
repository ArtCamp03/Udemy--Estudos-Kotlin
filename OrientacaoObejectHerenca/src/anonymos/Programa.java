package anonymos;

public class Programa {

    public void calculo(boolean bonus){
        bonus.calcula();
    }

    public static void main(String[] args){
        Programa p = new Programa(new Bonus() {
            @Override
            public float calcula(){
                return 500f;
            }
        });
        p.calculo();
    }

}
