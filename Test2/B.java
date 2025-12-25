class B extends A{
    int z;
    B(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    void show(){
        super.show();
        System.out.println(z);
    }
}