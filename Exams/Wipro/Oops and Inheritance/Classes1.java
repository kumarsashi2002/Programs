public class Classes1 {
    public class Box{
        int width,height,depth;
        Box(int w,int h,int d){
            this.width=w;
            this.height=h;
            this.depth=d;
        }
        int volumeOfBox(){
            int vol=width*height*depth;
            return vol;
        }
    }
    public static void main(String[] args) {
        Box b1=new Box(1,2,3);
        b1.volumeOfBox();

    }
}
