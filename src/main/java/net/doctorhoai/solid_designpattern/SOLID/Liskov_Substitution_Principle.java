package net.doctorhoai.solid_designpattern.SOLID;

// trong chuong trinh, cac object con co the thay the class cha ma khong lam thay doi tinh dung dan cua chuong trinh
public class Liskov_Substitution_Principle {
    static public abstract class Vit{
        public void keu(){

        }
    }

    static public class VitPin extends Vit{
        private Boolean Pin;

        @Override
        public void keu() {
            if( Pin ){
                super.keu();
            }
            else{
                try {
                    throw new Exception("Khong co pin de keu");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        public Boolean getPin(){
            return this.Pin;
        }
        public void setPin(Boolean pin){
            this.Pin = pin;
        }
    }
    static public class VitBau extends Vit{

        @Override
        public void keu() {
            super.keu();
        }
    }
    public static void main(String arg[]){
        Vit vitBau = new VitBau();
        vitBau.keu();
//        Vit vitPin=  new VitPin();
//        vitPin.keu();

    }
}
