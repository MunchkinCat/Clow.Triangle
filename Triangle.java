package TrianglePackage;

/**
 * Created by Gabe on 9/12/2016.
 */
public class Triangle {

    private
    double SideA;
    double SideB;
    double SideC;


    Triangle (double A,double B,double C)
    {
        this.SideA = A;
        this.SideB= B;
        this.SideC = C;
    }

    public void setTriangle(double a, double b, double c)
    {
        this.SideA = a;
        this.SideB = b;
        this.SideC = c;

    }
    public void getTriangle(){
        System.out.print("SideA"+ this.SideA + "SideB"+this.SideB + "SideC"+this.SideC);
    }

    public boolean isEquilateral(Triangle triangle) {
    return(this.SideA == this.SideB && this.SideC == this.SideA);

    }

    public boolean isIsosceles(Triangle triangle) {
    return((this.SideA == this.SideB && this.SideA != this.SideC)
            || (this.SideA == this.SideC && this.SideA != this.SideB )
            || (this.SideB == this.SideC && this.SideB != this.SideA));
    }

    public boolean isScalene(Triangle triangle) {
        return (this.SideA != this.SideB && this.SideA != this.SideC);
    }


    public boolean isTrueTriangle() {
        if (((this.SideA < (this.SideB + this.SideC))
                && (this.SideB < (this.SideA + this.SideC))
                && (this.SideC < (this.SideA + this.SideB))))
            return true;
        else
            return false;

    }


}


