package Collection;

interface Firstdetail {
    void Flywheel();
}

interface Seconddetail {
    void Piston();
}

class Motor implements Firstdetail, Seconddetail {

    @Override
    public void Flywheel() {
        System.out.println("lasting");
    }

    @Override
    public void Piston() {
        System.out.println("22 diameters");
    }
}

class Main1 {
    public static void main(String[] args) {
        Motor myMotor = new Motor();
        myMotor.Piston();
        myMotor.Flywheel();
    }
}
