package net.doctorhoai.solid_designpattern.SOLID;


// chung ta thoai mai mo rong  nhung khong duoc chinh sua noi dung ben trong no
public class OpenClosed_Principle {

    public abstract class Shape{
        public abstract double Area();
    }
    public class Rectangle extends Shape{
        private double Witdth;
        private double Height;
        @Override
        public double Area() {
            return this.Height * this.Witdth;
        }
    }

    public class Circle extends Shape{
        private double Radius;
        @Override
        public double Area() {
            return Radius*Radius*Math.PI;
        }
    }
}
